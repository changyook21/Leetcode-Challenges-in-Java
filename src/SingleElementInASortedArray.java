public class SingleElementInASortedArray {
    /*
    Given a sorted array consisting of only integers where every element appears exactly twice except for one element which appears exactly once. Find this single element that appears only once.



    Example 1:

    Input: [1,1,2,3,3,4,4,8,8]
    Output: 2
    */
    public int singleNonDuplicate(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid < arr.length - 1 && arr[mid] == arr[mid + 1]) {
                if (mid % 2 == 0) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
            else if (mid > 0 && arr[mid] == arr[mid - 1]) {
                if ((arr.length - (1 + mid)) % 2 == 0) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            else {
                return arr[mid];
            }
        }
        return -1;
    }

}
