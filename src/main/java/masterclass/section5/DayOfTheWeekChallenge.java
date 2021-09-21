package masterclass.section5;

public class DayOfTheWeekChallenge {

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0 -> System.out.println("Monday");
            case 1 -> System.out.println("Tuesday");
            case 2 -> System.out.println("Wednesday");
            case 3 -> System.out.println("Thursday");
            case 4 -> System.out.println("Friday");
            case 5 -> System.out.println("Saturday");
            case 6 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }
    }

    public static void printDayOfTheWeek2(int day) {
        if(day == 0) {
            System.out.println("Monday");
        }else if(day == 1) {
            System.out.println("Tuesday");
        }else if(day == 2) {
            System.out.println("Wednesday");
        }else if(day == 3) {
            System.out.println("Thursday");
        }else if(day == 4) {
            System.out.println("Friday");
        }else if(day == 5) {
            System.out.println("Saturday");
        }else if(day == 6) {
            System.out.println("Sunday");
        }else {
            System.out.println("Invalid day");
        }
    }

    public static void main(String[] args) {
        printDayOfTheWeek(6);
        printDayOfTheWeek2(9);
    }
}
