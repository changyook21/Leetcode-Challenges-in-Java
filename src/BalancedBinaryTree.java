public class BalancedBinaryTree {
    /*
    Given a binary tree, determine if it is height-balanced.

    For this problem, a height-balanced binary tree is defined as:

    a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

    Example 1:

    Given the following tree [3,9,20,null,null,15,7]:

        3
       / \
      9  20
        /  \
       15   7
    Return true.
    */
    class Solution {
        public boolean isBalanced(TreeNode root) {
            if (root == null || (root.left == null && root.right == null)) {
                return true;
            }
            int hLeft = helper(root.left);
            int hRight = helper(root.right);
            return (Math.abs(hLeft - hRight) <= 1 && isBalanced(root.left) && isBalanced(root.right));
        }

        public int helper(TreeNode root) {
            if (root == null) {
                return 0;
            }
            return 1 + Math.max(helper(root.left), helper(root.right));
        }
    }
}
