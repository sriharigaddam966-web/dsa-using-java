class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTreeDemo {
    TreeNode root;

    BinaryTreeDemo() {
        root = null;
    }

    void inorder(TreeNode node) {
        if (node == null)
            return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        BinaryTreeDemo tree = new BinaryTreeDemo();

        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);
    }
}