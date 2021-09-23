package masterclass.section5;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int number1, int number2) {
        if (number1 < 10 || number2 < 10) {
            return -1;
        }

        int commonDivisor = 1;
        int counter = 1;
        while (counter <= number1 || counter <- number2) {
            if ((number1 % counter == 0) && (number2 % counter == 0)) {
                commonDivisor = counter;
                counter++;
            }else {
                counter ++;
            }
        }
        return commonDivisor;
    }
}
