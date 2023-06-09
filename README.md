# OpenX_internship_task_1

This is a Java project that implements a binary tree and includes a JUnit test class for verifying the functionality of the binary tree. The project has three source files:

BinaryTree.java - file contains the BinaryTree class. The BinaryTree class represents the binary tree and has a reference to the root node. The class includes methods to count the number of leafs (nodes without child) in the tree, find the length of the longest path from the root node to a leaf node, and compare the tree with another tree for equality.

Node.java - file contains the Node class. The Node class represents a node in the binary tree, has an integer value and integer ID, as well as references to its left and right child nodes.

BinaryTreeTest.java - file contains a test class BinaryTreeTest that uses JUnit to test the functionality of the BinaryTree class. The test class includes three test methods to verify that:

+ Binary tree is constructed correctly with one leaf node and a path length of zero.
+ Id is assigned correctly to nodes
+ Counting leaf nodes in the binary tree works correctly.
+ Finding the length of the longest path from the root node to a leaf node works correctly.
+ Comparing two binary trees for equality works correctly.


# Requirements
+ Java (JDK 17)
+ JUnit library v. 4.10
+ IntelliJ IDEA Community Edition v. 2023.1 or another compatible IDE.

# Running the tests
To run the tests, open the BinaryTreeTest.java file in IntelliJ IDEA or another compatible IDE and click on the Run button for the BinaryTreeTest class. The tests will run automatically, and the results will be displayed in the IDE console.
