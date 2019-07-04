public class PathSum {
/*
Share
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1
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
    boolean found = false;
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        helper(root, sum);
        return found;
    }
    public void helper(TreeNode root, int sum) {
        if (root != null) {
            if (root.left == null && root.right == null && (sum - root.val == 0)) {
                found = true;
            }

        }
        else {
            return;
        }


        helper(root.left, sum - root.val);
        helper(root.right, sum - root.val);
    }

}
