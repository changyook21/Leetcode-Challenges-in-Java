import java.util.ArrayList;

public class MovingAverageFromStream {
/*
Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

Example:

MovingAverage m = new MovingAverage(3);
m.next(1) = 1
m.next(10) = (1 + 10) / 2
m.next(3) = (1 + 10 + 3) / 3
m.next(5) = (10 + 3 + 5) / 3
*/

    class MovingAverage {
        private List<Integer> list = new ArrayList<>();
        private int size;
        private double current = 0;
        /** Initialize your data structure here. */
        public MovingAverage(int size) {
            this.size = size;
        }

        public double next(int val) {
            current++;
            list.add(val);
            if (current > size) {
                list.remove(0);
                current--;
            }
            double sum = 0;
            for(int i = 0; i < list.size(); i++)
                sum = sum + list.get(i);
            return sum/current;

        }
    }

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
}
