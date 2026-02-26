// Class containing left and right child
// of current node and key value
package DataStructure;

class Node {

	int key;

	Node2 left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}

// A Java program to introduce Binary Tree
class BinaryTree {

	// Root of Binary Tree
	Node2 root;

	// Constructors
	BinaryTree(int key) {
		root = new Node2(key);
	}

	BinaryTree() {
		root = null;
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		// Create root
		tree.root = new Node2(1);
		/*
		 * Following is the tree after above statement 1 / \ null null
		 */

		tree.root.left = new Node2(2);
		tree.root.right = new Node2(3);
		/*
		 * 2 and 3 become left and right children of 1 1 / \ 2 3 / \ / \ null null null
		 * null
		 */
		tree.root.left.left = new Node2(4);
		/*
		 * 4 becomes left child of 2 1 / \ 2 3 / \ / \ 4 null null null / \ null null
		 */
	}
}
