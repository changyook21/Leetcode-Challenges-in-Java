public class InvertABinaryTree {
/*
Invert a binary tree.

Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1
*/

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public TreeNode invertTree(TreeNode root) {
        TreeNode top = root;
        helper(root);
        return top;
    }
    public void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.left);
        TreeNode tmp = root.left;
        root.left = root.right;
        helper(root.right);
        root.right = tmp;

    }

}
