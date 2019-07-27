public class ArmstrongNumber {
    /*
    The k-digit number N is an Armstrong number if and only if the k-th power of each digit sums to N.

    Given a positive integer N, return true if and only if it is an Armstrong number.

    Example 1:

    Input: 153
    Output: true
    Explanation:
    153 is a 3-digit number, and 153 = 1^3 + 5^3 + 3^3.
    */
    public boolean isArmstrong(int N) {
        int save = N;
        int length = Integer.toString(N).length();
        int total = 0;
        while (N > 0) {
            int current = N % 10;
            total += Math.pow(current, length);
            N /= 10;
        }
        return total == save;
    }

}
