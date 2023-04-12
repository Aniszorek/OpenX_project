
class Node {
    int value;
    Node left, right;

    public Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree{
    Node root;

    public BinaryTree(Node root) { this.root = root; }

    public int countLeafNodes(){
        return countLeafNodesHelper(root);
    }
    private int countLeafNodesHelper(Node node) {
        if (node == null){
            return 0;
        } else if (node.left == null && node.right == null){
            return 1;
        } else {
            return countLeafNodesHelper(node.left) + countLeafNodesHelper(node.right);
        }
    }

    public int largestPath(){
        return largestPathHelper(root) - 1;
    }
    public int largestPathHelper(Node node) {
        if (node == null){
            return 0;
        } else {
            int leftLargest = largestPathHelper(node.left);
            int rightLargest = largestPathHelper(node.right);
            return Math.max(leftLargest, rightLargest) + 1;
        }
    }

    public boolean isEqual(BinaryTree other){
        return isEqualHelper(this.root, other.root);
    }

    private boolean isEqualHelper(Node node1, Node node2){
        if (node1 == null && node2 == null){
            return true;
        } else if (node1 == null || node2 == null){
            return false;
        } else if (node1.value != node2.value){
            return false;
        } else {
            return isEqualHelper(node1.left, node2.left) && isEqualHelper(node1.right, node2.right);
        }
    }

}