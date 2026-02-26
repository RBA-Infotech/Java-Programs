package DataStructure;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreePreOrder {
    TreeNode root;

    BinaryTreePreOrder() {
        root = null;
    }

    // Method to insert a new node with a given value
    public void insert(int val) {
        root = insertRec(root, val);
    }

    // A recursive function to insert a new value into the BST
    private TreeNode insertRec(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val) {
            root.left = insertRec(root.left, val);
        } else if (val > root.val) {
            root.right = insertRec(root.right, val);
        }

        return root;
    }

    // Method to perform preorder traversal
    public void preorderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] values = {10, 5, 15, 3, 7, 12, 18};

        for (int val : values) {
            bst.insert(val);
        }

        System.out.println("Preorder traversal of the BST:");
        bst.preorderTraversal(bst.root);
        
    }
}



