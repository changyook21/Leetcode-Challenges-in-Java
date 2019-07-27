public class LargestUniqueNumber {
    /*
    Given an array of integers A, return the largest integer that only occurs once.

    If no integer occurs once, return -1.



    Example 1:

    Input: [5,7,3,9,4,9,8,3,1]
    Output: 8
    Explanation:
    The maximum integer in the array is 9 but it is repeated. The number 8 occurs only once, so it's the answer.
    */
    public int largestUniqueNumber(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = -1;
        for (int cur : A) {
            map.put(cur, map.getOrDefault(cur, 0) + 1);
        }
        //System.out.print(map);
        for (int cur : map.keySet()) {
            if (map.get(cur) == 1) {
                if (max < cur) {
                    max = cur;
                }

            }
        }
        return max;
    }

}
