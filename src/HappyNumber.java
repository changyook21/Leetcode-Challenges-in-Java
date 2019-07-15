public class HappyNumber {
    /*
    Write an algorithm to determine if a number is "happy".

    A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

    Example:

    Input: 19
    Output: true
    Explanation:
    12 + 92 = 82
    82 + 22 = 68
    62 + 82 = 100
    12 + 02 + 02 = 1
    */
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        boolean loop = false;
        int save = 0;
        int current = 0;
        while (n > 0) {
            current += (n % 10) * (n % 10);
            n /= 10;

            if (n == 0) {
                if (set.contains(current)) {
                    return false;
                }
                set.add(current);
                if (current != 1) {
                    n = current;
                    current = 0;
                }
                else {
                    return true;
                }
            }

        }
        return false;
    }

}
