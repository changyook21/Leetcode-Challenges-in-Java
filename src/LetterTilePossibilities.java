public class LetterTilePossibilities {
    /*
    You have a set of tiles, where each tile has one letter tiles[i] printed on it.  Return the number of possible non-empty sequences of letters you can make.



    Example 1:

    Input: "AAB"
    Output: 8
    Explanation: The possible sequences are "A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA".
    */
    int count = 0;
    public int numTilePossibilities(String tiles) {
        int[] dic = new int[26];

        for (int i = 0; i < tiles.length(); i++) {
            dic[tiles.charAt(i) - 'A']++;
        }

        dfs(dic);
        return count;
    }
    public void dfs(int[] dic) {
        for (int i = 0; i < dic.length; i++) {
            if (dic[i] > 0) {
                dic[i]--;
                dfs(dic);
                dic[i]++;
                count++;
            }
        }
    }

}
