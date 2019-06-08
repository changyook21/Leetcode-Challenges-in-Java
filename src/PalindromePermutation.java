import java.util.HashMap;

public class PalindromePermutation {
/*
Given a string, determine if a permutation of the string could form a palindrome.
*/

    public boolean canPermutePalindrome(String s) {
        Set<Character> map = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (map.contains(current)) {
                map.remove(current);
            }
            else {
                map.add(current);
            }
        }
        if (map.size() < 2) {
            return true;
        }
        return false;
    }

}
