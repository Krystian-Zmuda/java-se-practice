package masterclass.section5;

import masterclass.section4.LeapYearCalculator;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2,2024));
    }

    public static boolean isLeapYear(int year) {

        if(year < 1 || year > 9999) {
            return false;
        }else if((year % 4 == 0) && (year % 100 != 0)) {
            return true;
        } else if(year % 400 == 0) {
            return true;
        }else{
            return false;
        }
    }
    public static int getDaysInMonth(int month, int year) {
        if(month < 1 || month > 12) {
            return -1;
        }else if(year < 1 || year > 9999) {
            return -1;
        } else if(isLeapYear(year) && month == 2){
            return 29;
        }else if(!isLeapYear(year) && month == 2) {
            return 28;
        }else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        }else {
            return 30;
        }
    }

}
