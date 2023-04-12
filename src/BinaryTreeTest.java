import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    @Test
    public void testBinaryTreeConstruction() {
        Node root = new Node(5);
        BinaryTree tree = new BinaryTree(root);
        assertEquals(1, tree.getNumOfLeaf());
        assertEquals(0, tree.getMaxPath());
    }

    @Test
    public void testCountLeafNodes() {
        Node root = new Node(5);
        BinaryTree tree = new BinaryTree(root);

        tree.addLeftChild(5, 3);
        tree.addRightChild(5, 7);
        tree.addLeftChild(3, 2);
        tree.addRightChild(3, 5);
        tree.addLeftChild(7, 1);
        tree.addRightChild(7, 0);
        tree.addRightChild(0, 2);
        tree.addLeftChild(0, 8);
        tree.addRightChild(8, 5);
        assertEquals(5, tree.getNumOfLeaf());
    }

    @Test
    public void testFindMaxPath() {
        Node root = new Node(5);
        BinaryTree tree = new BinaryTree(root);

        tree.addLeftChild(5, 3);
        tree.addRightChild(5, 7);
        tree.addLeftChild(3, 2);
        tree.addRightChild(3, 5);
        tree.addLeftChild(7, 1);
        tree.addRightChild(7, 0);
        tree.addRightChild(0, 2);
        tree.addLeftChild(0, 8);
        tree.addRightChild(8, 5);

        assertEquals(4, tree.getMaxPath());
    }

    @Test
    public void testEquals() {
        Node root1 = new Node(5);
        BinaryTree tree1 = new BinaryTree(root1);
        tree1.addLeftChild(5, 3);
        tree1.addRightChild(5, 7);
        tree1.addLeftChild(3, 2);
        tree1.addRightChild(3, 5);
        tree1.addLeftChild(7, 1);
        tree1.addRightChild(7, 0);
        tree1.addRightChild(0, 2);
        tree1.addLeftChild(0, 8);
        tree1.addRightChild(8, 5);

        Node root2 = new Node(5);
        BinaryTree tree2 = new BinaryTree(root2);
        tree2.addLeftChild(5, 3);
        tree2.addRightChild(5, 7);
        tree2.addLeftChild(3, 2);
        tree2.addRightChild(3, 5);
        tree2.addLeftChild(7, 1);
        tree2.addRightChild(7, 0);
        tree2.addRightChild(0, 2);
        tree2.addLeftChild(0, 8);
        tree2.addRightChild(8, 5);

        assertTrue(tree1.isEqual(tree2));
    }

}
