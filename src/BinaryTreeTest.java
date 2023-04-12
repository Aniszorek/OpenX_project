import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    @Test
    public void testBinaryTreeConstruction() {
        Node root = new Node(5, 1);
        BinaryTree tree = new BinaryTree(root);
        assertEquals(1, tree.getNumOfLeaf());
        assertEquals(0, tree.getMaxPath());
    }

    @Test
    public void testCountLeafNodes() {
        Node root = new Node(5, 0);
        BinaryTree tree = new BinaryTree(root);

        tree.addLeftChild(0, 3);
        tree.addRightChild(0, 7);
        tree.addLeftChild(1, 2);
        tree.addRightChild(1, 5);
        tree.addLeftChild(2, 1);
        tree.addRightChild(2, 0);
        tree.addRightChild(6, 2);
        tree.addLeftChild(6, 8);
        tree.addRightChild(8, 5);
        assertEquals(5, tree.getNumOfLeaf());
    }

    @Test
    public void testFindMaxPath() {
        Node root = new Node(5, 0);
        BinaryTree tree = new BinaryTree(root);

        tree.addLeftChild(0, 3);
        tree.addRightChild(0, 7);
        tree.addLeftChild(1, 2);
        tree.addRightChild(1, 5);
        tree.addLeftChild(2, 1);
        tree.addRightChild(2, 0);
        tree.addRightChild(6, 2);
        tree.addLeftChild(6, 8);
        tree.addRightChild(8, 5);

        assertEquals(4, tree.getMaxPath());
    }

    @Test
    public void testEquals() {
        Node root1 = new Node(5, 0);
        BinaryTree tree1 = new BinaryTree(root1);
        tree1.addLeftChild(0, 3);
        tree1.addRightChild(0, 7);
        tree1.addLeftChild(1, 2);
        tree1.addRightChild(1, 5);
        tree1.addLeftChild(2, 1);
        tree1.addRightChild(2, 0);
        tree1.addRightChild(6, 2);
        tree1.addLeftChild(6, 8);
        tree1.addRightChild(8, 5);

        Node root2 = new Node(5, 0);
        BinaryTree tree2 = new BinaryTree(root2);
        tree2.addLeftChild(0, 3);
        tree2.addRightChild(0, 7);
        tree2.addLeftChild(1, 2);
        tree2.addRightChild(1, 5);
        tree2.addLeftChild(2, 1);
        tree2.addRightChild(2, 0);
        tree2.addRightChild(6, 2);
        tree2.addLeftChild(6, 8);
        tree2.addRightChild(8, 5);

        assertTrue(tree1.isEqual(tree2));
    }

}
