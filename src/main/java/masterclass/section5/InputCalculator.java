package masterclass.section5;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        long average = 0;


        while (true) {
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
            } else {
                break;
            }
        }
        if (counter > 0) {
            average = Math.round((double) sum / counter);
        }
        scanner.close();
        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
