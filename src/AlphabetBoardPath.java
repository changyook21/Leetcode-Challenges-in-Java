public class AlphabetBoardPath {
    /*
    On an alphabet board, we start at position (0, 0), corresponding to character board[0][0].

    Here, board = ["abcde", "fghij", "klmno", "pqrst", "uvwxy", "z"].

    We may make the following moves:

    'U' moves our position up one row, if the square exists;
    'D' moves our position down one row, if the square exists;
    'L' moves our position left one column, if the square exists;
    'R' moves our position right one column, if the square exists;
    '!' adds the character board[r][c] at our current position (r, c) to the answer.
    Return a sequence of moves that makes our answer equal to target in the minimum number of moves.  You may return any path that does so.



    Example 1:

    Input: target = "leet"
    Output: "DDR!UURRR!!DDD!"
    */
    public String alphabetBoardPath(String target) {
        StringBuilder builder = new StringBuilder();
        int k = 0;
        int j = 0;
        String[] board = {"abcde", "fghij", "klmno", "pqrst", "uvwxy", "z"};
        for (int i = 0; i < target.length(); i++) {
            //System.out.println(builder.toString());
            if (current == 'z') {
                while (j > 0) {
                    j--;
                    builder.append("L");
                }
            }

            while ((current - (board[k].charAt(j) - j)) >= 5) {
                k++;
                builder.append("D");
            }
            while ((current - (board[k].charAt(j) + 5 - 1 - j)) <= -5) {
                k--;
                builder.append("U");
            }
            while (current - board[k].charAt(j) > 0) {
                j++;
                builder.append("R");

            }

            while (current - board[k].charAt(j) < 0) {
                j--;
                builder.append("L");

            }
            if (current == board[k].charAt(j)) {
                builder.append("!");
            }
        }
        return builder.toString();
    }



}
