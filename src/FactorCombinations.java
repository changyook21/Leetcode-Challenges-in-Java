public class FactorCombinations {
    /*
    Numbers can be regarded as product of its factors. For example,

    8 = 2 x 2 x 2;
      = 2 x 4.
    Write a function that takes an integer n and return all possible combinations of its factors.

    Note:

    You may assume that n is always positive.
    Factors should be greater than 1 and less than n.
    */
    List<List<Integer>> answer = new ArrayList<>();
    public List<List<Integer>> getFactors(int n) {
        List<Integer> list = new ArrayList<>();
        dfs(n, list, 2);
        return answer;

    }
    public void dfs (int n, List<Integer> list, int start) {

        if (n <= 1 && list.size() > 1) {
            answer.add(new ArrayList<Integer>(list));
            return;
        }
        for (int i = start; i<= n; i++) {
            if (n % i == 0) {
                list.add(i);
                dfs(n/i, list, i);
                list.remove(list.size()-1);
            }
        }
    }

}
