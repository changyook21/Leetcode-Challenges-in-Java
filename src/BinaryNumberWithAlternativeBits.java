public class BinaryNumberWithAlternativeBits {
    /*
    Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.

    Example 1:
    Input: 5
    Output: True
    Explanation:
    The binary representation of 5 is: 101
    */
    public boolean hasAlternatingBits(int n) {
        if (n == 1 || n == 2) {
            return true;
        }

        while (n > 0) {
            if ((n & 1) == 1 && ((n >> 1) & 1) != 0 ||
                    (n & 1) == 0 && ((n >> 1) & 1) != 1) {
                return false;
            }
            n >>= 1;
        }
        return true;
    }

}
