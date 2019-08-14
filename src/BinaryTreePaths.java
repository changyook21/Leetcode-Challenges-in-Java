public class BinaryTreePaths {
    /*
    Given a binary tree, return all root-to-leaf paths.

    Note: A leaf is a node with no children.

    Example:

    Input:

       1
     /   \
    2     3
     \
      5

    Output: ["1->2->5", "1->3"]

    Explanation: All root-to-leaf paths are: 1->2->5, 1->3
    */
    LinkedList<String> list = new LinkedList<>();
    public List<String> binaryTreePaths(TreeNode root) {

        helper(root, "");
        return list;
    }
    public void helper(TreeNode root, String current) {

        if (root != null) {
            current += Integer.toString(root.val);

            if ((root.left == null) && (root.right == null)) {
                list.add(current);
            }

            else {
                current += "->";
                helper(root.left, current);
                helper(root.right, current);

            }
        }

    }

}
