package masterclass.section8;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {


    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        return count;
    }

    public static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
    int[] array = new int[count];
    for (int i = 0; i < array.length; i++) {
        array[i] = scanner.nextInt();
    }
    return array;
    }

    public static int findMin (int[] array) {
        Arrays.sort(array);
        return array[0];
    }

}
