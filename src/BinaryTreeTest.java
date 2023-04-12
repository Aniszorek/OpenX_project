import org.junit.Test;
import static org.junit.Assert.*;
public class BinaryTreeTest {
    @Test
    public void testBinaryTreeConstruction() {
        Node root = new Node(5);
        BinaryTree tree = new BinaryTree(root);
        assertEquals(1, tree.countLeafNodes());
        assertEquals(0, tree.largestPath());
    }

    @Test
    public void testCountLeaves() {
        Node root = new Node(5);

        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.right = new Node(7);
        root.right.left = new Node(1);
        root.right.right = new Node(0);
        root.right.right.left = new Node(2);
        root.right.right.right = new Node(8);
        root.right.right.right.right = new Node(5);

        BinaryTree tree = new BinaryTree(root);

        assertEquals(5, tree.countLeafNodes());
    }

    @Test
    public void testFindMaxPath() {
        Node root = new Node(5);

        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.right = new Node(7);
        root.right.left = new Node(1);
        root.right.right = new Node(0);
        root.right.right.left = new Node(2);
        root.right.right.right = new Node(8);
        root.right.right.right.right = new Node(5);

        BinaryTree tree = new BinaryTree(root);

        assertEquals(4, tree.largestPath());
    }

    @Test
    public void testEquals() {
        Node root1 = new Node(5);

        root1.left = new Node(3);
        root1.left.left = new Node(2);
        root1.left.right = new Node(5);
        root1.right = new Node(7);
        root1.right.left = new Node(1);
        root1.right.right = new Node(0);
        root1.right.right.left = new Node(2);
        root1.right.right.right = new Node(8);
        root1.right.right.right.right = new Node(5);

        Node root2 = new Node(5);

        root2.left = new Node(3);
        root2.left.left = new Node(2);
        root2.left.right = new Node(5);
        root2.right = new Node(7);
        root2.right.left = new Node(1);
        root2.right.right = new Node(0);
        root2.right.right.left = new Node(2);
        root2.right.right.right = new Node(8);
        root2.right.right.right.right = new Node(5);


        BinaryTree tree1 = new BinaryTree(root1);
        BinaryTree tree2 = new BinaryTree(root2);

        assertTrue(tree1.isEqual(tree2));
    }

}
