package practice;

public class OperatorsChallange {
    public static void main(String[] args) {

        double firstValue = 20.00;
        double secondValue = 80.00;
        double thirdValue = (firstValue + secondValue) * 100;
        double modulo = thirdValue % 40;
        boolean testModulo = (modulo == 0) ? true : false;
        System.out.println(testModulo);
        if (modulo != 0) {
            System.out.println("Got some remainder");
        }
    }

}
