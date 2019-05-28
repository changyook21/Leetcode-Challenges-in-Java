public class DIStringMatch {
/*
Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.

Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:

If S[i] == "I", then A[i] < A[i+1]
If S[i] == "D", then A[i] > A[i+1]


*/
    public int[] diStringMatch(String S) {
        int length = S.length();
        int[] array = new int[length + 1];
        int min = 0;
        int max = length;

        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == 'I') {
                array[i] = min++;
            }
            if (S.charAt(i) == 'D') {
                array[i] = max--;
            }
        }
        array[length] = min;
        return array;

    }

}
