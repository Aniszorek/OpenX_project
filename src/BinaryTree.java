public class BinaryTree {
    private int nodeId = 1;
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
        return Math.max(searchMaxPath(node.getLeft()), searchMaxPath(node.getRight())) + 1;
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

    private Node findNode(Node node, int id) {
        if (node == null) {
            return null;
        }
        if (node.getId() == id) {
            return node;
        }
        Node left = findNode(node.getLeft(), id);
        if (left != null) {
            return left;
        }
        return findNode(node.getRight(), id);
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

    public void addLeftChild(int parentId, int value) {
        Node parent = findNode(root, parentId);
        if (parent == null) {
            throw new IllegalArgumentException("Parent node not found");
        }
        if (parent.getLeft() != null) {
            throw new IllegalArgumentException("Parent already has left child");
        }
        parent.setLeft(new Node(value, nodeId));
        this.nodeId++;
    }

    public void addRightChild(int parentId, int value) {
        Node parent = findNode(root, parentId);
        if (parent == null) {
            throw new IllegalArgumentException("Parent node not found");
        }
        if (parent.getRight() != null) {
            throw new IllegalArgumentException("Parent already has right child");
        }
        parent.setRight(new Node(value, nodeId));
        this.nodeId++;
    }
}