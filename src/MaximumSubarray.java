public class MaximumSubarray {
    /*
    Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

    Example:

    Input: [-2,1,-3,4,-1,2,1,-5,4],
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6.
    */
    public int maxSubArray(int[] nums) {
        int total = nums[0];
        int current = 0;


        for (int i = 0; i < nums.length; i++) {
            current += nums[i];
            if (current > total) {
                total = current;
            }
            if (current < 0) {
                current = 0;
            }
        }

        return total;


    }

}
