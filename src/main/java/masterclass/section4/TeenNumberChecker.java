package masterclass.section4;

public class TeenNumberChecker {

    public static boolean hasTeen (int firstParameter, int secondParameter, int thirdParameter) {
        if (firstParameter >= 13 && firstParameter <=19) {
            return true;
        } else if (secondParameter >= 13 && secondParameter <=19) {
            return true;
        }else if (thirdParameter >= 13 && thirdParameter <=19) {
            return true;
        }else {
            return false;
        }
    }

    public static boolean isTeen (int onlyParameter) {
        if (onlyParameter >= 13 && onlyParameter <= 19) {
            return true;
        }else {
            return false;
        }
    }
}
