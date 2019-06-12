public class FlipGame {
/*
You are playing the following Flip Game with your friend: Given a string that contains only these two characters: + and -, you and your friend take turns to flip two consecutive "++" into "--". The game ends when a person can no longer make a move and therefore the other person will be the winner.

Write a function to compute all possible states of the string after one valid move.
*/

    public List<String> generatePossibleNextMoves(String s) {
        StringBuilder builder = new StringBuilder(s);
        List<String> list = new ArrayList<>();
        for (int i = 0 ; i < s.length() - 1; i++) {
            if (s.charAt(i) == '+' && s.charAt(i+1) == '+') {
                builder.setCharAt(i, '-');
                builder.setCharAt(i + 1, '-');
                list.add(builder.toString());
                builder.setCharAt(i, '+');
                builder.setCharAt(i + 1, '+');
            }
        }
        return list;
    }

}
