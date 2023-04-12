public class Node {
    private final int value;
    private final int id;
    private Node left, right;

    public Node(int value, int id) {
        this.value = value;
        this.id = id;
        this.left = null;
        this.right = null;
    }

    public int getValue() {
        return value;
    }

    public int getId() {
        return id;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
}
