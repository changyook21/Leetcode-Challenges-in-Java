public class LargestNumberAtLeastTwiceOfOthers {
    /*
    In a given integer array nums, there is always exactly one largest element.

    Find whether the largest element in the array is at least twice as much as every other number in the array.

    If it is, return the index of the largest element, otherwise return -1.

    Example 1:

    Input: nums = [3, 6, 1, 0]
    Output: 1
    Explanation: 6 is the largest integer, and for every other number in the array x,
    6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.
    */
    public int dominantIndex(int[] nums) {

        int max = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > max) {

                max = nums[i];
                index = i;

            }
        }
        for (int i = 0; i < nums.length;i++ ) {
            if (i == index) {
                continue;
            }
            if (2*nums[i] > max) {
                return -1;
            }
        }
        return index;
    }

}
