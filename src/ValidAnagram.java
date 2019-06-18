import java.util.HashMap;

public class ValidAnagram {

    /*
    Given two strings s and t , write a function to determine if t is an anagram of s.

    Example 1:

    Input: s = "anagram", t = "nagaram"
    Output: true
    */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (map.containsKey(current)) {
                map.put(current, map.get(current) + 1);
            }
            else {
                map.put(current, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char current = t.charAt(i);
            if (!map.containsKey(current)) {
                return false;
            }
            else if (map.containsKey(current) && map.get(current) == 0){
                return false;
            }
            else {
                map.put(current, map.get(current) - 1);
            }

        }
        return true;
    }


}
