package masterclass.section5;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int evenSum = 0;
        while (number > 0) {
            if ((number % 10) % 2 == 0) {
                evenSum += number % 10;
                number /= 10;
            }else {
                number /= 10;
            }

        }
        return evenSum;
    }
}
