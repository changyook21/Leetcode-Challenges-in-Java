public class FindAndReplacePattern {
/*
You have a list of words and a pattern, and you want to know which words in words matches the pattern.

A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the pattern with p(x), we get the desired word.

(Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.)

Return a list of the words in words that match the given pattern.

You may return the answer in any order.
*/

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        boolean broken = false;
        for (int i = 0; i < words.length; i++) {
            char[] arr1 = new char[26];
            char[] arr2 = new char[26];
            for (int j = 0; j < words[i].length(); j++) {
                if (arr1[words[i].charAt(j) - 'a'] == pattern.charAt(j) || arr1[words[i].charAt(j) - 'a'] == '\u0000') {
                    if (arr1[words[i].charAt(j) - 'a'] == '\u0000') {
                        arr1[words[i].charAt(j) - 'a'] = pattern.charAt(j);
                    }
                }
                else {
                    broken = true;
                    break;
                }
                if (arr2[pattern.charAt(j) - 'a'] == words[i].charAt(j) || arr2[pattern.charAt(j) - 'a'] == '\u0000') {
                    if (arr2[pattern.charAt(j) - 'a'] == '\u0000') {
                        arr2[pattern.charAt(j) - 'a'] = words[i].charAt(j);
                    }
                }
                else {
                    broken = true;
                    break;
                }
            }
            if (!broken) {
                list.add(words[i]);
            }
            broken = false;
        }
        return list;
    }



}
