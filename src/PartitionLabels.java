public class PartitionLabels {
    /*
    A string S of lowercase letters is given. We want to partition this string into as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts.

    Example 1:
    Input: S = "ababcbacadefegdehijhklij"
    Output: [9,7,8]
    Explanation:
    The partition is "ababcbaca", "defegde", "hijhklij".
    This is a partition so that each letter appears in at most one part.
    A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.

    */
    public List<Integer> partitionLabels(String S) {
        int[]array = new int[26];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            array[S.charAt(i) - 'a'] = i;
        }

        int j = 0;
        int line = 0;
        for (int i = 0; i < S.length(); i++) {
            j = Math.max(j, array[S.charAt(i) - 'a']);
            if (i == j) {
                list.add(i+1 - line);
                line = i + 1;
            }
        }
        return list;
    }

}
