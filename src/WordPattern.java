public class WordPattern {
    /*
    Given a pattern and a string str, find if str follows the same pattern.

    Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

    Example 1:

    Input: pattern = "abba", str = "dog cat cat dog"
    Output: true
    */
    public boolean wordPattern(String pattern, String str) {
        HashSet<String> Stringset = new HashSet<>();
        HashSet<Character> CharSet = new HashSet<>();
        boolean isChar = false;
        char[] chars = new char[0];
        String[] dic = new String[0];
        if (str.split(" ").length == 1 && pattern.length() > 1) {
            isChar = true;
            chars = str.toCharArray();
        }
        else {
            isChar = false;
            dic = str.split(" ");
        }
        String[] StringArr = new String[26];
        char[] CharArr = new char[26];



        if (isChar) {
            if (chars.length != pattern.length()) {
                return false;
            }
            for (int i = 0; i < pattern.length(); i++) {
                if (CharArr[pattern.charAt(i) - 'a'] == '\u0000' && !CharSet.contains(chars[i])) {
                    CharArr[pattern.charAt(i) - 'a'] = chars[i];
                    CharSet.add(chars[i]);
                }
                else if (CharArr[pattern.charAt(i) - 'a'] == '\u0000' && CharSet.contains(chars[i])) {
                    return false;
                }
                else if (CharArr[pattern.charAt(i) - 'a'] != (chars[i])) {
                    return false;
                }

            }

        }
        else {
            if (dic.length != pattern.length()) {
                return false;
            }

            for (int i = 0; i < pattern.length(); i++) {
                //System.out.println(i);
                if (StringArr[pattern.charAt(i) - 'a'] == null && !Stringset.contains(dic[i])) {
                    StringArr[pattern.charAt(i) - 'a'] = dic[i];
                    Stringset.add(dic[i]);
                }
                else if (StringArr[pattern.charAt(i) - 'a'] == null && Stringset.contains(dic[i])) {
                    return false;
                }

                else if (StringArr[pattern.charAt(i) - 'a'] != null && !StringArr[pattern.charAt(i) - 'a'].equals(dic[i])) {
                    return false;
                }

            }
        }
        return true;

    }

}
