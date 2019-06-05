import java.util.Arrays;
import java.lang.Math;
public class ShortestDistanceToACharacter {
/*
Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.
*/
    public int[] shortestToChar(String S, char C) {
        int[] fWard = new int[S.length()];
        int[] bWard = new int[S.length()];
        Arrays.fill(fWard, 10000);
        Arrays.fill(bWard, 10000);
        int pointer = 0;

        for (int i = 0; i < S.length(); i++) {
            pointer = 0;
            if (S.charAt(i) == C) {
                fWard[i] = pointer;
                for (int j = i - 1 ; j >= 0; j--) {
                    if (S.charAt(j) == C) {
                        break;
                    }
                    fWard[j] = pointer + 1;
                    pointer++;

                }
            }
        }

        for (int i = S.length() - 1; i >= 0 ; i--) {
            pointer = 0;
            if (S.charAt(i) == C) {
                bWard[i] = pointer;
                for (int j = i + 1 ; j < S.length(); j++) {
                    if (S.charAt(j) == C) {
                        break;
                    }

                    bWard[j] = pointer + 1;
                    pointer++;

                }
            }
        }

        for (int i = 0; i < S.length(); i++) {
            fWard[i] = Math.min(fWard[i], bWard[i]);
        }
        return fWard;
    }

}
