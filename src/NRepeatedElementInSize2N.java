import java.util.HashSet;

public class NRepeatedElementInSize2N {
    /*
In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.

Return the element repeated N times.
*/

    public int repeatedNTimes(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        int num = A[0];
        int count = 1;
        for (int i = 1; i < A.length; i++) {
            if (set.contains(A[i])) {
                return A[i];
            }
            else {
                set.add(A[i]);
            }
        }

        return num;
    }

}
