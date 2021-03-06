public class FindPivotIndex {
    /*
    Given an array of integers nums, write a method that returns the "pivot" index of this array.

    We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.

    If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.

    Example 1:

    Input:
    nums = [1, 7, 3, 6, 5, 6]
    Output: 3
    Explanation:
    The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
    Also, 3 is the first index where this occurs.
    */
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int total = 0;
        int left = 0;
        int right = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        total -= nums[0];
        if (left == total) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {

            left += nums[i-1];
            total = total - nums[i];
            right = total;
            if (left == right) {
                return i;
            }
        }
        return -1;



    }

}
