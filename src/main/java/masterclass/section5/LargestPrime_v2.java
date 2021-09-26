package masterclass.section5;

public class LargestPrime_v2 {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(16));
    }

        public static int getLargestPrime(int number) {
            if (number <= 1) {
                return -1;
            }
            int count = 0;
            int largestPrime = 1;
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            count++;
                        }
                    }
                    if (count == 0) {
                        largestPrime = i;
                    }
                }
            }
            return largestPrime;
        }
}
