import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
/*
A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
*/


    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        boolean compatible = true;
        for (int i = left; i <= right; i++) {
            compatible = true;
            int num = i;
            while (num> 0) {
                if (num % 10 == 0) {
                    compatible = false;
                    break;
                }

                if (i % (num % 10) != 0) {

                    compatible = false;
                    break;
                }
                num = num / 10;
            }
            if (compatible) {
                list.add(i);
            }

        }
        return list;
    }

}
