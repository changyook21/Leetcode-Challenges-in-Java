public class GoatLatin {
    /*
    A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.

    We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)

    The rules of Goat Latin are as follows:

    If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
    For example, the word 'apple' becomes 'applema'.

    If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
    For example, the word "goat" becomes "oatgma".

    Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
    For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
    Return the final sentence representing the conversion from S to Goat Latin.
    */
    public String toGoatLatin(String S) {
        StringBuilder build = new StringBuilder();
        StringBuilder as = new StringBuilder("a");
        String[] array = S.split(" ");
        HashSet<Character> set = new HashSet<>();

        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i].charAt(0))) {
                build.append(array[i]);
            }
            else {
                StringBuilder temp = new StringBuilder();
                temp.append(array[i]);
                temp.append(array[i].charAt(0));
                temp.deleteCharAt(0);
                build.append(temp);
            }
            build.append("ma");
            build.append(as);
            as.append('a');
            if (i < array.length - 1)
                build.append(" ");
        }

        return build.toString();

    }

}
