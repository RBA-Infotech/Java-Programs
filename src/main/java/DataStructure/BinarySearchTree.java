package DataStructure;

class Node1 {
    int key;
    Node1 left, right;

    public Node1(int item) {
        key = item;
        left = right = null;
    }
}

public class BinarySearchTree {
    Node1 root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node1 insertRec(Node1 root, int key) {
        if (root == null) {
            root = new Node1(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    void preorder() {
        preorderRec(root);
    }

    void preorderRec(Node1 root) {
        if (root != null) {
            preorderRec(root.left);
            System.out.print(root.key + " ");
            preorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        /* Example usage:
               50
              /  \
             30   70
            / \   / \
           20 40 60 80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print inorder traversal of the BST
        System.out.println("Inorder traversal of the BST:");
        tree.preorder();
        
    }
}

