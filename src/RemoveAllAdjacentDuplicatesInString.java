public class RemoveAllAdjacentDuplicatesInString {
/* Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.

We repeatedly make duplicate removals on S until we no longer can.

Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.
*/

    public String removeDuplicates(String S) {

        StringBuilder str = new StringBuilder(S);

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                str.delete(i, i+2);
                if (i - 2 >= -1) {
                    i -=2;
                }
                else {
                    i = -1;
                }
            }
        }
        return str.toString();
    }

}
