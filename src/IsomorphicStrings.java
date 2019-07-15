public class IsomorphicStrings {
/*
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Example 1:

Input: s = "egg", t = "add"
Output: true
*/

    public boolean isIsomorphic(String s, String t) {

        int n = s.length();
        int[] mapS = new int[256], mapT = new int[256];
        for (int i = 0; i < n; i++) {
            char chS = s.charAt(i), chT = t.charAt(i);
            if (mapS[chS] == 0)
                mapS[chS] = chT;
            if (mapT[chT] == 0)
                mapT[chT] = chS;
            if (mapS[chS] != chT || mapT[chT] != chS)
                return false;
        }

        return true;
    }


}
