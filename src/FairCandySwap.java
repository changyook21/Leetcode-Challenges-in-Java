import java.lang.Math;
public class FairCandySwap {
    /*
Alice and Bob have candy bars of different sizes: A[i] is the size of the i-th bar of candy that Alice has, and B[j] is the size of the j-th bar of candy that Bob has.

Since they are friends, they would like to exchange one candy bar each so that after the exchange, they both have the same total amount of candy.  (The total amount of candy a person has is the sum of the sizes of candy bars they have.)

Return an integer array ans where ans[0] is the size of the candy bar that Alice must exchange, and ans[1] is the size of the candy bar that Bob must exchange.

If there are multiple answers, you may return any one of them.  It is guaranteed an answer exists.
*/

    public int[] fairCandySwap(int[] A, int[] B) {
        int diff = 0;
        int sumA = 0;
        int sumB = 0;
        int[] answer = new int[2];
        Set <Integer> listA = new HashSet<>();
        Set <Integer> listB = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            sumA+=A[i];
            listA.add(A[i]);
        }
        for (int i = 0; i < B.length; i++) {
            sumB+=B[i];
            listB.add(B[i]);
        }
        diff = Math.abs(sumA - sumB);

        if (sumA >= sumB) {
            for (int i = 0; i < A.length; i++) {
                if (listB.contains(A[i] - diff/2)) {
                    answer[0] = A[i];
                    answer[1] = A[i] - diff/2;
                }
            }
        }
        else {
            for (int i = 0; i < B.length; i++) {
                if (listA.contains(B[i] - diff/2)) {

                    answer[1] = B[i];
                    answer[0] = B[i] - diff/2;
                }
            }
        }
        return answer;
    }

}
