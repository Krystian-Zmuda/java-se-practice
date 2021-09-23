package masterclass.section5;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(122));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int digitSum = number % 10;
        while (number > 0) {
            if (number >= 10) {
                number /= 10;
            }else {
                digitSum += number;
                break;
            }
        }

        return digitSum;
    }
}
