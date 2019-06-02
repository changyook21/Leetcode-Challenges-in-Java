public class SortArrayByParityII {
/*
Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.

Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.

You may return any answer array that satisfies this condition.
*/


    public int[] sortArrayByParityII(int[] A) {
        int even = 0;
        int odd = 1;
        int[] array = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                array[even] = A[i];
                even +=2;
            }
            if (A[i] % 2 != 0) {
                array[odd] = A[i];
                odd +=2;
            }
        }

        return array;
    }

}
