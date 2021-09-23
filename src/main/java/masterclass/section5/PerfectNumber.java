package masterclass.section5;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }
        int dividerSum = 0;
        int counter = 1;
        while (counter < number) {
            if (number % counter == 0) {
                dividerSum += counter;
                counter++;
            }else {
                counter++;
            }
        }
        if (number == dividerSum) {
            return true;
        }else {
            return false;
        }
    }
}
