/*
Given an unsorted integer array, find the smallest missing positive integer.

Example 1:

Input: [1,2,0]
Output: 3
Example 2:

Input: [3,4,-1,1]
Output: 2
Example 3:

Input: [7,8,9,11,12]
Output: 1
 */
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] array = {-1,4,2,1,9,10};

        int answer = MissingInt(array);
        System.out.println(answer);
    }
    public static int MissingInt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            while (array[i] < array.length && array[i] > 0 && array[array[i] - 1] != array[i]) {
                swap (array, i, array[i] - 1);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i + 1) {
                return i + 1;
            }
        }
        return array.length+1;
    }
    public static void swap (int[] array, int i , int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
