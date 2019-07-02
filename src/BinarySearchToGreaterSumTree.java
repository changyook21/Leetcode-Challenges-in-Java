public class BinarySearchToGreaterSumTree {
/*
Given the root of a binary search tree with distinct values, modify it so that every node has a new value equal to the sum of the values of the original tree that are greater than or equal to node.val.
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
    public TreeNode bstToGst(TreeNode root) {
        helper(root);

        return root;
    }
    public void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.right);
        int temp = root.val;
        root.val = (root.val + total);
        total += temp;
        helper(root.left);
    }

}
