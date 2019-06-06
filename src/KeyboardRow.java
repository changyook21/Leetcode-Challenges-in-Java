public class KeyboardRow {
/*
Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
*/

    public String[] findWords(String[] words) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        Set<Character> set3 = new HashSet<>();

        set1.add('q'); set1.add('w'); set1.add('e');
        set1.add('r'); set1.add('t'); set1.add('y');
        set1.add('u'); set1.add('i'); set1.add('o');
        set1.add('p'); set2.add('a'); set2.add('s');
        set2.add('d'); set2.add('f'); set2.add('g');
        set2.add('h'); set2.add('j'); set2.add('k');
        set2.add('l'); set3.add('z'); set3.add('x');
        set3.add('c'); set3.add('v'); set3.add('b');
        set3.add('n'); set3.add('m');
        int total = words.length;
        int count = 0;
        for (int i = 0; i < words.length; i++) {

            count = 0;
            String word = words[i].toLowerCase();
            if (set1.contains(word.charAt(0))) {
                for (int j = 1; j < word.length(); j++) {

                    if (set1.contains(word.charAt(j))) {
                        count++;
                    }

                }
                if (count != word.length()-1) {
                    words[i] = null;
                    total--;
                }

            }
            else if (set2.contains(word.charAt(0))) {
                for (int j = 1; j < word.length(); j++) {
                    if (set2.contains(word.charAt(j))) {
                        count++;
                    }

                }
                if (count != word.length()-1) {
                    words[i] = null;
                    total--;
                }

            }
            else if (set3.contains(word.charAt(0))) {
                for (int j = 1; j < word.length(); j++) {
                    if (set3.contains(word.charAt(j))) {
                        count++;
                    }

                }
                if (count != word.length()-1) {
                    words[i] = null;
                    total--;
                }

            }

        }

        String[] array = new String[total];
        int k = 0;
        for (int i = 0; i < words.length; i++) {

            if (words[i] != null) {
                array[k] = words[i];
                k++;
            }

        }
        return array;
    }

}
