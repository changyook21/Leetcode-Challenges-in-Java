public class MonotonicArray {
    /*
    An array is monotonic if it is either monotone increasing or monotone decreasing.

    An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].

    Return true if and only if the given array A is monotonic.



    Example 1:

    Input: [1,2,2,3]
    Output: true
    */
    public boolean isMonotonic(int[] A) {
        boolean inc = false;
        int counter = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i+1]) {
                continue;
            }
            if (A[i] > A[i+1]) {
                inc = false;
                counter = i;
                break;
            }
            if (A[i] < A[i+1]) {
                inc = true;
                counter = i;
                break;
            }
        }
        for (int i = counter; i < A.length - 1; i++) {

            if (A[i] < A[i+1] && !inc) {
                return false;
            }
            if (A[i] > A[i+1] && inc) {
                return false;
            }
        }

        return true;
    }

}
