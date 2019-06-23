public class PalindromeNumber {
    /*
    Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

    Example 1:

    Input: 121
    Output: true
    */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        int length = (int) (Math.log10(x) + 1);

        int[] list = new int[length];
        int i = 0;
        int temp = x;
        while (temp > 0) {
            list[i] = (temp % 10);
            i++;
            temp /= 10;
        }

        for (int j = 0 ; j < list.length/2; j++) {
            if (list[j] != list[length - j - 1]) {
                return false;
            }
        }
        return true;

    }

}
