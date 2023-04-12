import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {
    @Test
    public void testBinaryTreeConstruction() {
        Node root = new Node(5,1);
        BinaryTree tree = new BinaryTree(root);
        assertEquals(1, tree.getNumOfLeaf());
        assertEquals(0, tree.getMaxPath());
    }

    @Test
    public void testCountLeafNodes() {
        Node root = new Node(5,1);
        BinaryTree tree = new BinaryTree(root);

        tree.addLeftChild(1, 3, 2);
        tree.addRightChild(1, 7, 3);
        tree.addLeftChild(2, 2, 4);
        tree.addRightChild(2, 5, 5);
        tree.addLeftChild(3, 1, 6);
        tree.addRightChild(3, 0, 7);
        tree.addRightChild(7, 2, 8);
        tree.addLeftChild(7, 8, 9);
        tree.addRightChild(9, 5, 10);
        assertEquals(5, tree.getNumOfLeaf());
    }

    @Test
    public void testFindMaxPath() {
        Node root = new Node(5, 1);
        BinaryTree tree = new BinaryTree(root);

        tree.addLeftChild(1, 3, 2);
        tree.addRightChild(1, 7, 3);
        tree.addLeftChild(2, 2, 4);
        tree.addRightChild(2, 5, 5);
        tree.addLeftChild(3, 1, 6);
        tree.addRightChild(3, 0, 7);
        tree.addRightChild(7, 2, 8);
        tree.addLeftChild(7, 8, 9);
        tree.addRightChild(9, 5, 10);

        assertEquals(4, tree.getMaxPath());
    }

    @Test
    public void testEquals() {
        Node root1 = new Node(5,1 );
        BinaryTree tree1 = new BinaryTree(root1);
        tree1.addLeftChild(1, 3, 2);
        tree1.addRightChild(1, 7, 3);
        tree1.addLeftChild(2, 2, 4);
        tree1.addRightChild(2, 5, 5);
        tree1.addLeftChild(3, 1, 6);
        tree1.addRightChild(3, 0, 7);
        tree1.addRightChild(7, 2, 8);
        tree1.addLeftChild(7, 8, 9);
        tree1.addRightChild(9, 5, 10);

        Node root2 = new Node(5, 1);
        BinaryTree tree2 = new BinaryTree(root2);
        tree2.addLeftChild(1, 3, 2);
        tree2.addRightChild(1, 7, 3);
        tree2.addLeftChild(2, 2, 4);
        tree2.addRightChild(2, 5, 5);
        tree2.addLeftChild(3, 1, 6);
        tree2.addRightChild(3, 0, 7);
        tree2.addRightChild(7, 2, 8);
        tree2.addLeftChild(7, 8, 9);
        tree2.addRightChild(9, 5, 10);

        assertTrue(tree1.isEqual(tree2));
    }

}
