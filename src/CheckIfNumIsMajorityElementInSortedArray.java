public class CheckIfNumIsMajorityElementInSortedArray {
    /*
    Given an array nums sorted in non-decreasing order, and a number target, return True if and only if target is a majority element.

    A majority element is an element that appears more than N/2 times in an array of length N.



    Example 1:

    Input: nums = [2,4,5,5,5,5,5,6,6], target = 5
    Output: true
    Explanation:
    The value 5 appears 5 times and the length of the array is 9.
    Thus, 5 is a majority element because 5 > 9/2 is true.
    */
    public boolean isMajorityElement(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        while (left < right) {
            int mid = (left + right)/2;

            if (nums[mid] == target) {
                left = mid;
                right = mid + 1;
                while (left >= 0 && nums[left] == target) {
                    left--;
                    count++;
                }
                while (right < nums.length  && nums[right] == target) {
                    right++;
                    count++;
                }

                return count > nums.length/2;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return false;
    }

}
