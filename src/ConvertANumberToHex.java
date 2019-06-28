public class ConvertANumberToHex {
/*
Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.


Example 1:

Input:
26

Output:
"1a"
*/

    public String toHex(int n)
    {
        if(n == 0)
            return "0";

        char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        String result = "";

        while(n != 0)
        {
            result = map[n & 15] + result;
            n >>>= 4;
        }
        return result;
    }

}
