public class RangeSumOfBits {

    /*
Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).

The binary search tree is guaranteed to have unique values.
*/


    //Definition for a binary tree node.
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }


    int total = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        helper(root, L, R);
        return total;
    }
    public void helper(TreeNode root, int L, int R) {
        if (root == null) {
            return;
        }
        if (root.val >= L && root.val <= R) {
            total += root.val;
        }
        helper(root.left, L, R);
        helper(root.right, L, R);
    }
}

