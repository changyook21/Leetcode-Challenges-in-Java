import java.util.HashSet;

public class UniqueMorseCodeWords {
    /*
International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.

For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.

Return the number of different transformations among all words we have.
*/


    public int uniqueMorseRepresentations(String[] words) {
        String[] letters = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            StringBuilder str = new StringBuilder("");
            for (int j = 0; j < words[i].length(); j++) {
                str.append(letters[words[i].charAt(j) - 'a']);
            }
            set.add(str.toString());

        }
        return set.size();
    }
}
