package masterclass.section5;

public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(isPrime(89));
        System.out.println(getLargestPrime(16));

    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int largestPrime = -1;
        int counter = 2;
        while (counter < number) {
            if (number % counter == 0 && isPrime(counter)) {
                largestPrime = counter;
            }
            counter++;
        }
        return largestPrime;
    }

    public static boolean isPrime (int number) {
        int counter = number -1;
        boolean result = true;
        if ( number < 2) {
            result = false;
        }
            while (counter > 1) {
            if (number % counter == 0) {
                result = false;
                break;
            }else {
                counter--;
            }
        }
        return result;
    }
}
