public class LongestPalindromicSubstring {
    /*
    Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

    Example 1:

    Input: "babad"
    Output: "bab"
    Note: "aba" is also a valid answer.
    */
    public String longestPalindrome(String s) {
        String max = "";
        for (int i = 0; i < s.length(); i++) {
            String even = palindromeCheck(i,i,s);
            String odd = palindromeCheck(i,i+1,s);

            if (even.length() > max.length()) {
                max = even;
            }
            if (odd.length() > max.length()) {
                max = odd;
            }
        }
        return max;
    }

    public String palindromeCheck(int start, int end, String word) {
        while (start >= 0 && end < word.length() && word.charAt(start) == word.charAt(end)) {
            start--;
            end++;
        }
        return word.substring(start + 1, end);
    }
}

