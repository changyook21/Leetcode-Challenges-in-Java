public class HammingDistance {
/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

*/

    public int hammingDistance(int x, int y) {
        int count = 0;
        int distance = x ^ y;

        while (distance > 0) {  // I avoid using bitCount because it is a built-in function

            if (distance % 2 != 0) {
                count++;
            }
            distance >>= 1;

        }

        return count;
    }
}
