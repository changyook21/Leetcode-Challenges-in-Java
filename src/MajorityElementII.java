public class MajorityElementII {
    /*
    Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

    Note: The algorithm should run in linear time and in O(1) space.

    Example 1:

    Input: [3,2,3]
    Output: [3]
    */
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int count1 = 0;
        int count2 = 0;
        int candidate1 = 0;
        int candidate2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate1) {
                count1++;
            }
            else if (nums[i] == candidate2) {
                count2++;
            }
            else if (count1 == 0) {
                count1 = 1;
                candidate1 = nums[i];
            }
            else if (count2 == 0) {
                count2 = 1;
                candidate2 = nums[i];
            }
            else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;

        for (int i : nums) {
            if (i == candidate1) {
                count1++;
            }
            else if (i == candidate2) {
                count2++;
            }
        }
        if (count1 > nums.length/3) {
            list.add(candidate1);
        }

        if (count2 > nums.length/3) {
            list.add(candidate2);
        }


        return list;

    }

}
