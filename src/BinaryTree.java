
class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public int countLeafNodes() {
        return countLeafNodesHelper(root);
    }

    private int countLeafNodesHelper(Node node) {
        if (node == null) {
            return 0;
        } else if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeafNodesHelper(node.left) + countLeafNodesHelper(node.right);
    }

    public int maxPath() {
        return maxPathHelper(root) - 1;
    }

    public int maxPathHelper(Node node) {
        if (node == null) {
            return 0;
        }
        int leftLargest = maxPathHelper(node.left);
        int rightLargest = maxPathHelper(node.right);
        return Math.max(leftLargest, rightLargest) + 1;
    }

    public boolean isEqual(BinaryTree other) {
        return isEqualHelper(this.root, other.root);
    }

    private boolean isEqualHelper(Node node1, Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        } else if (node1 == null || node2 == null) {
            return false;
        } else if (node1.value != node2.value) {
            return false;
        }
        return isEqualHelper(node1.left, node2.left) && isEqualHelper(node1.right, node2.right);
    }

}