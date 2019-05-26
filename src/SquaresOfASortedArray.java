public class SquaresOfASortedArray {
    /*
Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
*/


    public int[] sortedSquares(int[] A) {
        int min = 0;
        int max = A.length - 1;
        int current = A.length -1;
        int[] result = new int[A.length];
        while (min <= max) {
            if (A[min] * A[min]  >= A[max] * A[max]) {
                result[current] = (int) A[min] * A[min];
                current --;
                min++;
            }
            else if (A[min] * A[min]  < A[max] * A[max]) {
                result[current] = (int) A[max] * A[max];
                current--;
                max--;
            }
        }

        return result;
    }


}
