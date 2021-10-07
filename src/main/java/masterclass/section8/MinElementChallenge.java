package masterclass.section8;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {
private static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(int count) {
        int[] userArray = new int[count];
        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = scanner.nextInt();
        }
        return userArray;
    }

    public static int findMin (int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(readIntegers(5)));
        int[] sortArray = readIntegers(5);
        System.out.println(findMin(sortArray));
    }
}
