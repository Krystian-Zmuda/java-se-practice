package masterclass.section5;

public class SwitchChallenge {

    public static void main(String[] args) {

        char charValue = 'Z';

        switch (charValue) {

            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println("Value is " + charValue);
                break;

            default:
                System.out.println("Value was something else");
                break;
        }

        String month = "January";

        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
                break;
        }
    }

}
