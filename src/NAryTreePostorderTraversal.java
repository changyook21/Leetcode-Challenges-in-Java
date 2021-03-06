import java.util.ArrayList;
import java.util.List;

public class NAryTreePostorderTraversal {
/*
Given an n-ary tree, return the postorder traversal of its nodes' values.

For example, given a 3-ary tree:
*/

// class Node {
//     public int val;
//     public List<Node> children;

//     public Node() {}

//     public Node(int _val,List<Node> _children) {
//         val = _val;
//         children = _children;
//     }
// };

    List<Integer> list = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if (root == null) {
            return list;
        }

        helper(root);
        list.add(root.val);

        return list;

    }
    public void helper(Node root) {
        if (root == null) {
            return;
        }
        int size = root.children.size();
        int i = 0;

        while (i < size) {

            helper(root.children.get(i));
            list.add(root.children.get(i).val);
            i++;

        }
    }

}
