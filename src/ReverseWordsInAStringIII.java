public class ReverseWordsInAStringIII {
    /*
    Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
    */
    public String reverseWords(String s) {
        StringBuilder build = new StringBuilder("");
        StringBuilder total = new StringBuilder("");
        int i = 0;
        while (i < s.length()) {
            build = new StringBuilder("");
            while (s.charAt(i) != ' ') {
                build.insert(0, s.charAt(i));
                i++;
                if (i == s.length()) {
                    break;
                }
            }

            total.append(build);
            i++;
            if (i < s.length()) {
                total.append(" ");
            }
        }
        return total.toString();
    }


    // FIRST ATTEMPT CODE

    //     String[] arr = s.split(" ");
    //     StringBuilder builder = new StringBuilder("");
    //     StringBuilder total = new StringBuilder("");
    //     for (int i = 0; i < arr.length; i++) {
    //         builder = new StringBuilder("");
    //         for (int j = 0; j < arr[i].length(); j++) {
    //             builder.insert(0,arr[i].charAt(j));
    //         }
    //         if (i == arr.length - 1)
    //             total.append(builder);
    //         else {
    //             total.append(builder + " ");
    //         }
    //     }
    //     return total.toString();
    // }

}
