import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        String hex = "a2f";
        int base = 16;
        int total = 0;
        int num = 0;
        int power = 1;
        for (int i = hex.length(); i > 0; i--) {
            char current = hex.charAt(i);

            switch (current) {
                case 'A':
                    num = 10;
                    break;
                case 'B':
                    num = 11;
                    break;
                case 'C':
                    num = 12;
                    break;
                case 'D':
                    num = 13;
                    break;
                case 'E':
                    num = 14;
                    break;
                case 'F':
                    num = 15;
                    break;
                default:
                    num = Character.getNumericValue(current);
            }
            total += num * Math.pow(base, power);
            power++;

        }
        System.out.println(total);
    }
}
