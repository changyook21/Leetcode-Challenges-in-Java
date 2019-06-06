public class NumberComplement {
/*
Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

Note:
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.
*/


    public int findComplement(int num) {
        StringBuilder str = new StringBuilder("");
        String binary = Integer.toString(num, 2);
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                str.append('1');
            }
            else {
                str.append('0');
            }
        }
        int answer = Integer.parseInt(str.toString(), 2);

        return answer;
    }

}
