public class IncreasingOrderSearchTree {
/*
Given a tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only 1 right child.
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
    List<Integer> list= new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        helper(root);
        TreeNode tree = new TreeNode(list.get(0));
        TreeNode head = tree;
        for (int i = 1; i < list.size(); i++) {

            tree.right = new TreeNode(list.get(i));
            tree = tree.right;


        }
        return head;

    }
    public void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.left);

        list.add(root.val);

        helper(root.right);
    }

}
