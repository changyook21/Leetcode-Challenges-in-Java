public class SubArraySumEqualsK {
    /*
    Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

    Example 1:
    Input:nums = [1,1,1], k = 2
    Output: 2
    */
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;
        for(int i = 0; i <= nums.length - 1; i++) {
            sum += nums[i];

            if(sum == k) {
                ans++;
            }

            if (map.containsKey(sum - k)) {
                ans += map.get(sum-k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }

}
