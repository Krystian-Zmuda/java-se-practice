package masterclass.section8;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] testArray = {1,2,3,4,5};
        int[] arrayResize = Arrays.copyOf(testArray,7);
        System.out.println(Arrays.toString(arrayResize));
        reverse(testArray);
    }

    private static void reverse(int[] array) {
        System.out.println(Arrays.toString(array));
        int[] reversedArray = Arrays.copyOf(array,array.length);
        int j = reversedArray.length -1;
        for (int i = 0; i < reversedArray.length; i++, j--) {
            array[i] = reversedArray[j];
        }
        System.out.println(Arrays.toString(array));
    }
}
