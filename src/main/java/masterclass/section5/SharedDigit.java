package masterclass.section5;

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,31));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99) {
            return false;
        }

        if (number2 < 10 || number2 > 99) {
            return false;
        }
        int tempNumber1;
        int tempNumber2;
        int reviveNumber = number2;
        while (number1 > 0) {
            tempNumber1 = number1 % 10;
            while (number2 > 0) {
                tempNumber2 = number2 % 10;
                if (tempNumber1 == tempNumber2) {
                    return true;
                }else {
                    number2 /= 10;
                }
            }
            number1 /= 10;
            number2 = reviveNumber;
        }
        return false;
    }
}
