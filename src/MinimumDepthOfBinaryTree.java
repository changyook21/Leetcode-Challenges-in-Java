public class MinimumDepthOfBinaryTree {
    /*
    Given a binary tree, find its minimum depth.

    The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

    Note: A leaf is a node with no children.

    Example:

    Given binary tree [3,9,20,null,null,15,7],

        3
       / \
      9  20
        /  \
       15   7
    return its minimum depth = 2.
    */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        int hLeft = Integer.MAX_VALUE;
        int hRight = Integer.MAX_VALUE;

        if (root.left != null) {
            hLeft = minDepth(root.left);
        }

        if (root.right != null) {
            hRight = minDepth(root.right);
        }
        return (Math.min(hLeft, hRight) + 1);
    }

}
