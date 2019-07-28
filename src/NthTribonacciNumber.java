public class NthTribonacciNumber {
/*
The Tribonacci sequence Tn is defined as follows:

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given n, return the value of Tn.



Example 1:

Input: n = 4
Output: 4
Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4
*/

    public int tribonacci(int n) {
        int[] array = new int[38];

        array[0] = 0;
        array[1] = 1;
        array[2] = 1;

        for (int i = 3; i <= n; i++) {
            array[i] = array[i-1] + array[i-2] + array[i-3];
        }
        // for (int i = 0; i < array.length; i++ ) {
        //     System.out.println(array[i]);
        // }
        return array[n];
    }

}
