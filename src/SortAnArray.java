public class SortAnArray {
    /*
    Given an array of integers nums, sort the array in ascending order.



    Example 1:

    Input: [5,2,3,1]
    Output: [1,2,3,5]
    Example 2:

    Input: [5,1,1,2,0,0]
    Output: [0,0,1,1,2,5]


    Note:

    1 <= A.length <= 10000
    -50000 <= A[i] <= 50000
    */
    public int[] sortArray(int[] nums) {
        int[] array = new int[100000];

        for (int i = 0; i < nums.length; i++) {
            array[nums[i] + 50000]++;
        }
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                while (array[i] > 0) {
                    nums[k++] = i - 50000;
                    array[i]--;
                }
            }
        }
        return nums;
    }

}
