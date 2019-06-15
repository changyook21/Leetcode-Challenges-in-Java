public class PartitionArrayIntoThreePartsWithEqualSum {
    /*
    Given an array A of integers, return true if and only if we can partition the array into three non-empty parts with equal sums.

    Formally, we can partition the array if we can find indexes i+1 < j with (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1])
    */
    public boolean canThreePartsEqualSum(int[] A) {
        int total = 0;
        int current = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            total += A[i];
        }

        for (int i = 0; i < A.length; i++) {
            current += A[i];
            if (current == (total/3)) {
                current = 0;
                count++;
            }
        }
        return count == 3;
    }

}
