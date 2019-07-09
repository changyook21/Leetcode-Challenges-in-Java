public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        StringBuilder builder = new StringBuilder();

        ArrayList<Character> list = new ArrayList<>();
        for( int i = 0; i < strs[0].length(); i++ ) {
            list.add(strs[0].charAt(i));
        }


        for (int i = 1; i < strs.length; i++) {
            ArrayList<Character> common = new ArrayList<>();
            for (int j = 0; j < strs[i].length(); j++) {

                //System.out.println(list.contains(strs[i].charAt(j)) + " " + strs[i].charAt(j));
                //System.out.println(list.contains(strs[1].charAt(2)));
                if (list.contains(strs[i].charAt(j))) {
                    //System.out.println(strs[i].charAt(j));
                    list.remove(""+strs[i].charAt(j));
                    common.add(strs[i].charAt(j));
                    System.out.println(list);
                }

            }
            list = common;

        }
        for(Character ch: list)
        {
            builder.append(ch);
        }
        return builder.toString();
    }



}
