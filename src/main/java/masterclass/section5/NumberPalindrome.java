package masterclass.section5;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }

    public static boolean isPalindrome(int number) {
        int lastDigit = 0;
        int reverseNumber = 0;
        int calcNumber = number;

        while (calcNumber != 0) {
            lastDigit = calcNumber % 10;
            reverseNumber += lastDigit;
            if (calcNumber >= 10 || calcNumber <= -10) {
                reverseNumber *= 10;
            }
            calcNumber /= 10;
        }
        if (number == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }
}
