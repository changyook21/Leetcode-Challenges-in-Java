public class BinaryGap {
/*
Given a positive integer N, find and return the longest distance between two consecutive 1's in the binary representation of N.

If there aren't two consecutive 1's, return 0.
*/


    public int binaryGap(int N) {
        int current = 1;
        int max = 0;
        while (N > 1) {

            if ((N & 1) == 1) {
                current = 1;
                N >>= 1;
                while ( (N & 1) == 0) {
                    current++;
                    N >>= 1;
                }
                if (max < current)
                    max = current;
            }
            else {
                N >>= 1;
            }
        }
        return max;


    }

}
