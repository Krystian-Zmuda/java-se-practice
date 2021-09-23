package masterclass.section5;

public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println(sumDigits(10));
        System.out.println(1/10);
    }
    public static int sumDigits(int number) {
        int sumOfDigits = 0;
        if (number < 10) {
            return -1;
        }else {
            while (number / 10 != 0) {
                sumOfDigits += number % 10;
                number = number / 10;
                if (number < 10) {
                    sumOfDigits += number;
                }
            }
            return sumOfDigits;
        }
    }
}
