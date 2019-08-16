public class NaryTreeLevelOrderTraversal {
    /*
    Given an n-ary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

    We should return its level order traversal:

    [
         [1],
         [3,2,4],
         [5,6]
    ]
    */
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> answer = new ArrayList<>();

        if (root == null) {
            return answer;
        }

        q.add(root);


        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node current = q.remove();
                list.add(current.val);

                for (int j = 0; j < current.children.size(); j++) {
                    q.add(current.children.get(j));
                }


            }
            answer.add(list);

        }
        return answer;
    }
}
