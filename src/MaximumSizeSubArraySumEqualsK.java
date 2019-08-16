public class MaximumSizeSubArraySumEqualsK {
    /*
    Given an array nums and a target value k, find the maximum length of a subarray that sums to k. If there isn't one, return 0 instead.

    Note:
    The sum of the entire nums array is guaranteed to fit within the 32-bit signed integer range.

    Example 1:

    Input: nums = [1, -1, 5, -2, 3], k = 3
    Output: 4
    Explanation: The subarray [1, -1, 5, -2] sums to 3 and is the longest.
    */
    class Solution {
        public int maxSubArrayLen(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int sum = 0;
            int ans = 0;
            map.put(0, -1);
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];

                if (map.containsKey(sum - k)) {
                    ans = Math.max(i - map.get(sum - k), ans);
                }
                if (!map.containsKey(sum)) {
                    map.put(sum, i);
                }
            }
            return ans;
        }
    }
}
