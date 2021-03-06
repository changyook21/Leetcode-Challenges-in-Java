public class NumberOfLinesToWriteString {
/*
We are to write the letters of a given string S, from left to right into lines. Each line has maximum width 100 units, and if writing a letter would cause the width of the line to exceed 100 units, it is written on the next line. We are given an array widths, an array where widths[0] is the width of 'a', widths[1] is the width of 'b', ..., and widths[25] is the width of 'z'.

Now answer two questions: how many lines have at least one character from S, and what is the width used by the last such line? Return your answer as an integer list of length 2.
*/
    public int[] numberOfLines(int[] widths, String S) {
        int[] arr = new int[2];
        int line = 0;
        int total  = 0;
        for (int i = 0; i < S.length(); i++) {
            total += widths[S.charAt(i) - 'a'];
            if (total == 100) {
                line++;
                total = 0;
            }
            if (total > 100) {
                line++;
                total = widths[S.charAt(i) - 'a'];
            }
        }
        arr[0] = line + 1;
        arr[1] = total;
        return arr;
    }
}
