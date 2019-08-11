public class GreatestCommonDivisorOfStrings {
    /*
    For strings S and T, we say "T divides S" if and only if S = T + ... + T  (T concatenated with itself 1 or more times)

    Return the largest string X such that X divides str1 and X divides str2.



    Example 1:

    Input: str1 = "ABCABC", str2 = "ABC"
    Output: "ABC"
    */
    public String gcdOfStrings(String str1, String str2) {
        String current = "";
        if (str1.contains(str2) || str2.contains(str1)) {
            for (int i = 2; i <= str2.length(); i++) {
                if (str1.length() % i == 0 && str2.length() % i == 0) {
                    //System.out.println(i);
                    int repeat1 = str1.length() / i;

                    StringBuilder build = new StringBuilder();
                    for (int j = 0; j < repeat1; j++) {
                        build.append(str1.substring(0, i));
                    }
                    if (build.toString().equals(str1)) {
                        current = str1.substring(0, i);
                    }

                }
            }
        }

        return current;
    }

}
