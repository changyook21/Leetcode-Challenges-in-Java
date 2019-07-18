public class FindKLengthSubStringsWithNoRepeatedCharacters {
    /*
    Given a string S, return the number of substrings of length K with no repeated characters.



    Example 1:

    Input: S = "havefunonleetcode", K = 5
    Output: 6
    Explanation:
    There are 6 substrings they are : 'havef','avefu','vefun','efuno','etcod','tcode'.
    */
    public int numKLenSubstrNoRepeats(String S, int K) {
        if (K > S.length()) {
            return 0;
        }
        int count = 0;
        boolean broken = false;
        for (int i = 0; i <= S.length() - K; i++) {
            int[] array = new int[26];
            for (int j = i; j < i + K; j++) {
                if (array[S.charAt(j) - 'a'] == 1) {
                    broken = true;
                    break;
                }
                array[S.charAt(j) - 'a'] = 1;
            }
            if (!broken) {
                count++;

            }
            broken = false;
        }
        return count;
    }
}
