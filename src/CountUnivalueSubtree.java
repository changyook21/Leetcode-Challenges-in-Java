public class CountUnivalueSubtree {
/*
Given a binary tree, count the number of uni-value subtrees.

A Uni-value subtree means all nodes of the subtree have the same value.

Example :

Input:  root = [5,1,5,5,5,null,5]

              5
             / \
            1   5
           / \   \
          5   5   5

Output: 4
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
    int total = 0;
    public int countUnivalSubtrees(TreeNode root) {
        helper(root);
        return total;
    }
    public boolean helper(TreeNode root) {
        if (root == null) {
            return true;
        }

        boolean left = helper(root.left);
        boolean right = helper(root.right);

        if (left && right) {
            if ((root.left != null && root.left.val != root.val) || (root.right != null && root.right.val != root.val)) {
                return false;
            }
            total++;
            return true;
        }
        return false;
    }

}
