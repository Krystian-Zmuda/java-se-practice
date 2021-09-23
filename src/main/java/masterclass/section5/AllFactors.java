package masterclass.section5;

public class AllFactors {

    public static void main(String[] args) {
        printFactors(32);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }else {
            int divider = 1;
            while (divider <= number) {
                if (number % divider == 0) {
                    System.out.println(divider);
                    divider++;
                }else {
                    divider++;
                }
            }
        }

    }
}
