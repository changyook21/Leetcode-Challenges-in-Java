import java.util.ArrayList;
import java.util.List;

public class NAryTreePreorderTraversal {
/*
Given an n-ary tree, return the preorder traversal of its nodes' values.

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

    class Solution {
        List<Integer> list = new ArrayList<>();
        public List<Integer> preorder(Node root) {
            if (root == null) {
                return list;
            }
            list.add(root.val);
            helper(root);
            return list;

        }
        public void helper(Node root) {
            if (root == null) {
                return;
            }
            int size = root.children.size();
            int i = 0;

            while (i < size) {
                list.add(root.children.get(i).val);
                helper(root.children.get(i));
                i++;
            }
        }
    }
}
