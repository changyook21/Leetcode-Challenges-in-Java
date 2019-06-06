public class SingleNumber {
/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.
*/

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            }
            else {
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }

}
