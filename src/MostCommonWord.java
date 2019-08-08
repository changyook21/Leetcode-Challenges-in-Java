public class MostCommonWord {
    class Solution {
        /*
        Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words.  It is guaranteed there is at least one word that isn't banned, and that the answer is unique.

        Words in the list of banned words are given in lowercase, and free of punctuation.  Words in the paragraph are not case sensitive.  The answer is in lowercase.



        Example:

        Input:
        paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
        banned = ["hit"]
        Output: "ball"
        Explanation:
        "hit" occurs 3 times, but it is a banned word.
        "ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
        Note that words in the paragraph are not case sensitive,
        that punctuation is ignored (even if adjacent to words, such as "ball,"),
        and that "hit" isn't the answer even though it occurs more because it is banned.
        */
        public String mostCommonWord(String paragraph, String[] banned) {
            HashMap<String, Integer> map = new HashMap<>();
            paragraph = paragraph.toLowerCase();
            String max = "";
            int count = 0;
            List<String> list = Arrays.asList(banned);
            paragraph = paragraph.replaceAll("[^a-z ]", " ");
            String[] arr = paragraph.split(" ");

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("")) {
                    continue;
                }
                if (map.containsKey(arr[i])) {
                    map.put(arr[i], map.get(arr[i]) + 1);
                }
                else {
                    map.put(arr[i],1);
                }
            }

            for (String cur : map.keySet()) {
                if (list.contains(cur)) {
                    continue;
                }
                if (map.get(cur) > count) {
                    count = map.get(cur);
                    max = cur;
                }
            }
            return max;
        }
    }
}
