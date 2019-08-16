public class TwoSumLessThanK {
/*
Given an array A of integers and integer K, return the maximum S such that there exists i < j with A[i] + A[j] = S and S < K. If no i, j exist satisfying this equation, return -1.

Example 1:

Input: A = [34,23,1,24,75,33,54,8], K = 60
Output: 58
Explanation:
We can use 34 and 24 to sum 58 which is less than 60.
*/

    class Solution {
        public int twoSumLessThanK(int[] A, int K) {
            Arrays.sort(A);
            int max = -1;
            int current = 0;
            int left = 0;
            int right = A.length - 1;

            while (left < right) {
                current = A[left] + A[right];
                if (current > K) {
                    right--;
                }
                else if (current < K && current > max) {
                    max = current;
                    left++;
                }
                else {
                    left++;
                }


            }
            return max;
        }
    }
}
