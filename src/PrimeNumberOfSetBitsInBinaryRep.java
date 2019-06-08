import java.lang.Math;

public class PrimeNumberOfSetBitsInBinaryRep {

/*
Given two integers L and R, find the count of numbers in the range [L, R] (inclusive) having a prime number of set bits in their binary representation.

(Recall that the number of set bits an integer has is the number of 1s present when written in binary. For example, 21 written in binary is 10101 which has 3 set bits. Also, 1 is not a prime.)
*/

    public int countPrimeSetBits(int L, int R) {
        int total = 0;
        boolean flag = true;
        for (int i = L; i <= R; i++) {
            flag = true;
            int count = Integer.bitCount(i);

            for (int j = 2; j <= Math.sqrt(count); j++) {
                if ((count % j) == 0) {
                    flag = false;
                    break;

                }
            }
            // System.out.println(i+ " " + count + " " + flag);
            if (flag && count > 1) {
                total++;
            }

        }
        return total;
    }

}
