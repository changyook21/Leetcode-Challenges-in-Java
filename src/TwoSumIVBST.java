public class TwoSumIVBST {
    /*
    Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.

    Example 1:

    Input:
        5
       / \
      3   6
     / \   \
    2   4   7

    Target = 9

    Output: True

    */
    HashSet<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        return helper(root, k);

    }
    public boolean helper(TreeNode root, int target) {
        if (root == null) {
            return false;
        }
        if (set.contains(target - root.val)) {
            return true;
        }
        else {
            set.add(root.val);
        }
        return (helper(root.left, target) || helper(root.right, target));
    }

}
