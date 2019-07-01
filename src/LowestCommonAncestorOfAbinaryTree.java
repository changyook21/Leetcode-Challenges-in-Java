public class LowestCommonAncestorOfAbinaryTree {
/*
Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

Given the following binary tree:  root = [3,5,1,6,2,0,8,null,null,7,4]
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

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode a, TreeNode b) {
        TreeNode answer = null;

        List<TreeNode> listA = new ArrayList<>();
        helperAnc(root, a, listA);

        List<TreeNode> listB = new ArrayList<>();
        helperAnc(root, b, listB);

        for (int i = 0; i < Math.min(listA.size(), listB.size()); i++) {
            if (listA.get(i) == listB.get(i)) {
                answer = listA.get(i);
            }
            else {
                break;
            }
        }
        return answer;
    }

    public static boolean helperAnc(TreeNode root, TreeNode child, List<TreeNode> list) {
        if (root == null) {

            return false;
        }
        if (root == child) {
            list.add(root);
            return true;
        }
        list.add(root);
        if(helperAnc(root.left, child, list))
            return true;
        if (helperAnc(root.right, child, list))
            return true;
        list.remove(list.size() -1);
        return false;


    }
}
