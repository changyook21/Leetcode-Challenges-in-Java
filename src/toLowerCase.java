public class toLowerCase {
    /*Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
You cannot use the built-in function: .toLowerCase()
*/


    public String toLowerCase(String str) {
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 &&  str.charAt(i) <= 90 ) {
                result.append( (char) (str.charAt(i) + 32));

            }
            else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
