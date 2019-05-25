/*You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
*/

import java.util.HashSet;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = new HashSet<>();
        int total = 0;
        for (int i = 0; i <J.length(); i++) {
            set.add(J.charAt(i));
        }

        for (int i = 0; i <S.length(); i++) {
            if (set.contains(S.charAt(i))) {
                total++;
            }
        }
        return total;

    }
}
