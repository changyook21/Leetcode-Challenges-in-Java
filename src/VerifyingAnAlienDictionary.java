import java.util.HashMap;
import java.lang.Math;
public class VerifyingAnAlienDictionary {
/*
In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.

Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographicaly in this alien language.



Example 1:

Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
Output: true
Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
*/
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> list = new HashMap<>();
        int[] total = new int[words.length];
        for (int i = 0; i < order.length(); i++) {
            list.put(order.charAt(i), i);
        }

        for (int i = 0; i < words.length - 1; i++) {
            int length = Math.min(words[i].length(), words[i+1].length());
            for (int j =0; j < length; j++) {
                int current = list.get(words[i].charAt(j));
                int current1 = list.get(words[i+1].charAt(j));

                total[i] += current;
                total[i+1] += current1;

                if (current == current1) {
                    continue;
                }
                else if (current > current1) {
                    return false;
                }
                else {
                    break;
                }

            }
            if (total[i] > total[i+1] || ((total[i] == total[i+1]) && words[i].length() > words[i+1].length())) {
                return false;
            }
        }

        return true;
    }

}
