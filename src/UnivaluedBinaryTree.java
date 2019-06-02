import javax.swing.tree.TreeNode;

public class UnivaluedBinaryTree {
/*
A binary tree is univalued if every node in the tree has the same value.

Return true if and only if the given tree is univalued.
*/


     //Definition for a binary tree node.
     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }


    boolean uni = true;
    public boolean isUnivalTree(TreeNode root) {
        helper(root, root.val);
        return uni;
    }

    public void helper(TreeNode root, int value) {
        if (root == null) {
            return;
        }

        if (root.val != value) {
            uni = false;
        }

        helper(root.left, value);
        helper(root.right, value);
    }

}
