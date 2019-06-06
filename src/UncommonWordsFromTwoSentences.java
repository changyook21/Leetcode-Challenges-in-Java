import java.util.HashMap;

public class UncommonWordsFromTwoSentences {
/*
We are given two sentences A and B.  (A sentence is a string of space separated words.  Each word consists only of lowercase letters.)

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Return a list of all uncommon words.

You may return the list in any order.
*/

    public String[] uncommonFromSentences(String A, String B) {
        String[] word1 = A.split(" ");
        String[] word2 = B.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < word1.length; i++) {
            if (map.containsKey(word1[i])) {
                map.put(word1[i], 2);
            }
            else {
                map.put(word1[i], 1);
            }
        }
        for (int i = 0; i < word2.length; i++) {
            if (map.containsKey(word2[i])) {
                map.put(word2[i], 2);
            }
            else {
                map.put(word2[i], 1);
            }
        }
        int count = 0;
        for (String name : map.keySet()) {
            if (map.get(name) == 1) {
                count++;
            }

        }
        int i = 0;
        String[] array = new String[count];
        for (String name : map.keySet()) {
            if (map.get(name) == 1) {
                array[i] = name;
                i++;
            }

        }
        return array;
    }

}
