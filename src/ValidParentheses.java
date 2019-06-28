public class ValidParentheses {
    /*
    Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Note that an empty string is also considered valid.

    Example 1:

    Input: "()"
    Output: true
    */
    public boolean isValid(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<Character>();
        if (s.length() == 0) {
            return true;
        }
        else if (s.length() == 1) {
            return false;
        }
        else if (s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(0) == ')') {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (character == '(' || character == '[' || character == '{') {
                stack.push(character);
                count++;
            }
            else if (!stack.empty()){
                if (character == ')' && stack.peek() == '(' ) {
                    stack.pop();
                    count--;
                }
                else if (character == ']' && stack.peek() =='[') {
                    stack.pop();
                    count--;
                }
                else if (character == '}' && stack.peek() == '{') {
                    stack.pop();
                    count--;
                }
                else {
                    return false;
                }


            }
            else {
                return false;
            }
        }
        if (count == 0) {
            return true;
        }
        return false;
    }

}
