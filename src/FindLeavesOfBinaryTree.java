public class FindLeavesOfBinaryTree {
/*
Given a binary tree, collect a tree's nodes as if you were doing this: Collect and remove all leaves, repeat until the tree is empty.



Example:

Input: [1,2,3,4,5]

          1
         / \
        2   3
       / \
      4   5

Output: [[4,5,3],[2],[1]]
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
    List<List<Integer>> total = new ArrayList<>();
    public List<List<Integer>> findLeaves(TreeNode root) {
        TreeNode current = root;

        if(root == null) {
            return total;
        }

        while (root != null) {
            List<Integer> list = new ArrayList<>();
            root = helper(root, list);
            total.add(list);
        }

        return total;
    }
    public TreeNode helper(TreeNode root, List<Integer> list) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null ) {
            list.add(root.val);
            return null;
        }
        root.left = helper(root.left, list);
        root.right = helper(root.right, list);


        return root;

    }

}
