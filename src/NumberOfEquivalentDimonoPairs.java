public class NumberOfEquivalentDimonoPairs {
/*
Given a list of dominoes, dominoes[i] = [a, b] is equivalent to dominoes[j] = [c, d] if and only if either (a==c and b==d), or (a==d and b==c) - that is, one domino can be rotated to be equal to another domino.

Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length, and dominoes[i] is equivalent to dominoes[j].



Example 1:

Input: dominoes = [[1,2],[2,1],[3,4],[5,6]]
Output: 1
*/

    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < dominoes.length; i++) {
            StringBuilder build = new StringBuilder();

            if (dominoes[i][1] > dominoes[i][0]) {
                build.insert(0, dominoes[i][1] + " " + dominoes[i][0]);
            }
            else {
                build.insert(0, dominoes[i][0] + " " + dominoes[i][1]);
            }
            if (map.containsKey(build.toString())) {
                count += map.get(build.toString());
            }
            map.put(build.toString(), map.getOrDefault(build.toString(), 0) + 1);

        }
        return count;
    }

}
