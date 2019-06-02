import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
    /*
    Given an array A of strings made only from lowercase letters, return a list of all characters that show up in all strings within the list (including duplicates).  For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.

    You may return the answer in any order.
    */
    public List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < A[0].length();i++) {
            list.add(""+A[0].charAt(i));
        }

        for (int i = 1; i < A.length; i++ ) {
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < A[i].length(); j++) {
                if (list.contains(""+A[i].charAt(j))) {
                    temp.add(""+A[i].charAt(j));
                    list.remove(""+A[i].charAt(j));
                }
            }
            list = temp;
        }

        return list;
    }

}
