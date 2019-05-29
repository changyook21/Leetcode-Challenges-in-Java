public class SearchInABinarySearchTree {
    /*
    Given the root node of a binary search tree (BST) and a value. You need to find the node in the BST that the node's value equals the given value. Return the subtree rooted with that node. If such node doesn't exist, you should return NULL.
    /*

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        TreeNode answer = null;
        public TreeNode searchBST(TreeNode root, int val) {
            helper(root, val);
            return answer;
        }
        public void helper(TreeNode root, int val) {
            if (root == null) {
                return;
            }
            if (root.val == val) {
                answer = root;
                return;
            }
            helper(root.left, val);
            helper(root.right, val);

        }
    }
}
