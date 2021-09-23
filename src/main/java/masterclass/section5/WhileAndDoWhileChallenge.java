package masterclass.section5;

public class WhileAndDoWhileChallenge {

    public static void main(String[] args) {
        int number = 4;
        int finalNumber = 20;
        int evenCount = 0;

        while (number <= finalNumber) {
            number++;
            if (!isEvenNumber(number)){
                continue;
            }

            System.out.println("Even number is " + number);
            evenCount++;
            if (evenCount >= 5) {
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {

        if(number % 2 == 0) {
            return true;
        }else {
            return false;
        }


    }
}
