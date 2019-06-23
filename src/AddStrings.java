public class AddStrings {
/*
Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
*/

    public String addStrings(String num1, String num2) {
        boolean overflow = false;
        StringBuilder answer = new StringBuilder("");
        if (num1.length() < num2.length()) {
            while (num1.length() != num2.length()) {
                num1 = "0" + num1;
            }
        }
        else {
            while (num1.length() != num2.length()) {
                num2 = "0" + num2;
            }
        }
        for (int i = num1.length() - 1; i >= 0; i--) {
            int current1 = Character.getNumericValue(num1.charAt(i));
            int current2 = Character.getNumericValue(num2.charAt(i));
            int total = current1 + current2;
            if (overflow) {
                total++;
                overflow = false;
            }
            if ( total > 9 ) {
                overflow = true;
            }

            answer = answer.insert(0,total % 10);
            if (i == 0 && overflow) {
                answer = answer.insert(0,'1');
            }
        }
        return answer.toString();
    }

}
