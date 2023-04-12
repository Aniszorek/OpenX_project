public class BinaryTree {
    Node root;

    private int countLeafNodes(Node node) {
        if (node == null) {
            return 0;
        } else if (node.getLeft() == null && node.getRight() == null) {
            return 1;
        }
        return countLeafNodes(node.getLeft()) + countLeafNodes(node.getRight());
    }

    private int searchMaxPath(Node node) {
        if (node == null) {
            return 0;
        }
        int leftLargest = searchMaxPath(node.getLeft());
        int rightLargest = searchMaxPath(node.getRight());
        return Math.max(leftLargest, rightLargest) + 1;
    }

    private boolean areNodesEqual(Node node1, Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        if (node1.getValue() != node2.getValue()) {
            return false;
        }
        return areNodesEqual(node1.getLeft(), node2.getLeft()) && areNodesEqual(node1.getRight(), node2.getRight());
    }

    private Node findNode(Node node, int value) {
        if (node == null) {
            return null;
        }
        if (node.getValue() == value) {
            return node;
        }
        Node left = findNode(node.getLeft(), value);
        if (left != null) {
            return left;
        }
        return findNode(node.getRight(), value);
    }


    public BinaryTree(Node root) {
        this.root = root;
    }

    public int getNumOfLeaf() {
        return countLeafNodes(root);
    }

    public int getMaxPath() {
        return searchMaxPath(root) - 1;
    }

    public boolean isEqual(BinaryTree other) {
        return areNodesEqual(root, other.root);
    }

    public void addLeftChild(int parentValue, int value) {
        Node parent = findNode(root, parentValue);
        if (parent == null) {
            throw new IllegalArgumentException("Parent node not found");
        }
        if (parent.getLeft() != null) {
            throw new IllegalArgumentException("Parent already has left child");
        }
        parent.setLeft(new Node(value));
    }

    public void addRightChild(int parentValue, int value) {
        Node parent = findNode(root, parentValue);
        if (parent == null) {
            throw new IllegalArgumentException("Parent node not found");
        }
        if (parent.getRight() != null) {
            throw new IllegalArgumentException("Parent already has right child");
        }
        parent.setRight(new Node(value));
    }
}