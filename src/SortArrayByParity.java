public class SortArrayByParity {
    /* Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.
*/


    public int[] sortArrayByParity(int[] A) {
        int low = 0;
        int high = A.length - 1;

        while (low < high) {
            if(A[low] % 2 != 0 && A[high] % 2 == 0) {
                swap(low, high, A);
                low++;
                high--;
            }
            if (A[low] % 2 == 0) {
                low++;
            }
            if (A[high] % 2 != 0) {
                high--;
            }


        }
        return A;
    }

    public int[] swap(int low, int high, int[] A) {
        int temp = A[low];
        A[low] = A[high];
        A[high] = temp;

        return A;
    }

}
