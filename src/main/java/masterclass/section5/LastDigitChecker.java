package masterclass.section5;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9,99,999));
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (number1 < 10 || number1 > 1000) {
            return false;
        }
        if (number2 < 10 || number2 > 1000) {
            return false;
        }
        if (number3 < 10 || number3 > 1000) {
            return false;
        }
        number1 %= 10;
        number2 %= 10;
        number3 %= 10;

        if (number1 == number2 || number1 == number3 || number2 == number3) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        }else {
            return true;
        }
    }
}
