public class IntervalListIntersections {
    /*
    Given two lists of closed intervals, each list of intervals is pairwise disjoint and in sorted order.

    Return the intersection of these two interval lists.

    (Formally, a closed interval [a, b] (with a <= b) denotes the set of real numbers x with a <= x <= b.  The intersection of two closed intervals is a set of real numbers that is either empty, or can be represented as a closed interval.  For example, the intersection of [1, 3] and [2, 4] is [2, 3].)
    */
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<List<Integer>> total = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                List<Integer> list = new ArrayList<>();
                if (A[i][1] < B[j][0]) {
                    break;
                }
                if (A[i][0] > B[j][1]) {
                    continue;
                }
                if (A[i][0] < B[j][0] && A[i][1] >= B[j][0] && A[i][1] < B[j][1]) {
                    list.add(B[j][0]);
                    list.add(A[i][1]);
                    total.add(list);
                }

                else if (A[i][0] <= B[j][0] && A[i][1] >= B[j][1]) {
                    list.add(B[j][0]);
                    list.add(B[j][1]);
                    total.add(list);
                }

                else if (A[i][0] >= B[j][0] && A[i][1] >= B[j][1]) {
                    list.add(A[i][0]);
                    list.add(B[j][1]);
                    total.add(list);
                }

                else if (A[i][0] >= B[j][0] && A[i][1] <= B[j][1]) {
                    list.add(A[i][0]);
                    list.add(A[i][1]);
                    total.add(list);
                }
            }
        }
        int[][] answer = new int[total.size()][2];
        for (int i = 0; i < total.size(); i++) {
            answer[i][0] = total.get(i).get(0);
            answer[i][1] = total.get(i).get(1);
        }

        return answer;

    }

}
