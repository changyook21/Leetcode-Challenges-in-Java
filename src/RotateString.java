public class RotateString {
    /*
    We are given two strings, A and B.

    A shift on A consists of taking string A and moving the leftmost character to the rightmost position. For example, if A = 'abcde', then it will be 'bcdea' after one shift on A. Return True if and only if A can become B after some number of shifts on A.

    Example 1:
    Input: A = 'abcde', B = 'cdeab'
    Output: true

    Example 2:
    Input: A = 'abcde', B = 'abced'
    Output: false
    */
    public boolean rotateString(String A, String B) {


        if (A.length() == 0 && B.length() == 0) {
            return true;
        }
        if (A.length() != B.length()) {
            return false;
        }

        StringBuilder builder = new StringBuilder(A);

        for (int i = 0; i < A.length(); i++) {
            if (builder.toString().equals(B)) {
                return true;
            }
            char tmp = builder.charAt(0);
            builder.deleteCharAt(0);
            builder.append(tmp);
        }
        return false;
    }

}
