public class InsertIntoABinarySearchTree {
/*
Given the root node of a binary search tree (BST) and a value to be inserted into the tree, insert the value into the BST. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.

Note that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.

For example,

Given the tree:
        4
       / \
      2   7
     / \
    1   3
And the value to insert: 5
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode temp = root;
        TreeNode prev = null;
        while (temp != null) {
            prev = temp;
            if (temp.val > val) {

                temp = temp.left;
            }
            else {

                temp = temp.right;
            }
        }
        if (prev.val > val) {
            prev.left = new TreeNode(val);
        }
        else {
            prev.right = new TreeNode(val);
        }
        return root;
    }

}
