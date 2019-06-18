import java.util.HashMap;

public class MajorityElement {
/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:
Input: [3,2,3]
Output: 3
*/

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (hash.containsKey(current)) {
                hash.put(current, (hash.get(current) + 1));
            }
            else {
                hash.put(current, 1);
            }
        }
        for (int i: hash.keySet()) {
            int current = hash.get(i);
            if (current > count) {
                count = current;
                max = i;
            }
        }

        return max;
    }

}
