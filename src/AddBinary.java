public class AddBinary {
    /*
    Given two binary strings, return their sum (also a binary string).

    The input strings are both non-empty and contains only characters 1 or 0.

    Example 1:

    Input: a = "11", b = "1"
    Output: "100"
    */
    public String addBinary(String a, String b) {
        StringBuilder builderA = new StringBuilder(a);
        StringBuilder builderB = new StringBuilder(b);

        boolean carry = false;
        while (builderA.length() < builderB.length()) {
            builderA.insert(0,0);
        }
        while (builderB.length() < builderA.length()) {
            builderB.insert(0,0);
        }
        StringBuilder builderC = new StringBuilder(builderA);
        for (int i = builderA.length() - 1; i >= 0; i--) {
            if (carry && builderA.charAt(i) == '0') {
                builderC.setCharAt(i, '1');
                builderA.setCharAt(i, '1');
                carry = false;

            }
            else if (carry && builderA.charAt(i) == '1') {
                builderC.setCharAt(i, '0');
                builderA.setCharAt(i, '0');
                carry = true;
            }
            if (builderB.charAt(i) == '1' && builderA.charAt(i) == '1') {
                builderC.setCharAt(i, '0');
                carry = true;
            }
            else if (builderB.charAt(i) == '1' && builderA.charAt(i) == '0' || builderB.charAt(i) == '0' && builderA.charAt(i) == '1') {
                builderC.setCharAt(i, '1');
            }

        }
        if (carry) {
            builderC.insert(0,1);
        }
        return builderC.toString();
    }

}
