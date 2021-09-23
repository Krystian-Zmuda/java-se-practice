package masterclass.section5;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(900);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int reversedNumber = reverse(number);
            int reversedNumberCount = getDigitCount(reversedNumber);
            int numberCount = getDigitCount(number);
            while (reversedNumber > 0) {
                switch (reversedNumber % 10) {
                    case 0:
                        System.out.println("Zero");
                        reversedNumber /= 10;
                        break;
                    case 1:
                        System.out.println("One");
                        reversedNumber /= 10;
                        break;
                    case 2:
                        System.out.println("Two");
                        reversedNumber /= 10;
                        break;
                    case 3:
                        System.out.println("Three");
                        reversedNumber /= 10;
                        break;
                    case 4:
                        System.out.println("Four");
                        reversedNumber /= 10;
                        break;
                    case 5:
                        System.out.println("Five");
                        reversedNumber /= 10;
                        break;
                    case 6:
                        System.out.println("Six");
                        reversedNumber /= 10;
                        break;
                    case 7:
                        System.out.println("Seven");
                        reversedNumber /= 10;
                        break;
                    case 8:
                        System.out.println("Eight");
                        reversedNumber /= 10;
                        break;
                    case 9:
                        System.out.println("Nine");
                        reversedNumber /= 10;
                        break;

                }
            }
            while (numberCount > reversedNumberCount) {
                System.out.println("Zero");
                numberCount--;
            }

        }

    }


    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber += number % 10;
            if (number >= 10 || number <= -10) {
                reversedNumber *= 10;
            }
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int digitCount = 0;
        while (number >= 0) {
            number /= 10;
            digitCount++;
            if (number == 0) {
                break;
            }
        }
        return digitCount;
    }
}
