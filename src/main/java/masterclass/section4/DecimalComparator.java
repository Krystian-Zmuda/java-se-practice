package masterclass.section4;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double firstParameter, double secondParameter) {
        if ((int) (firstParameter * 1000) == (int) (secondParameter * 1000)) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.176,3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
    }
}
