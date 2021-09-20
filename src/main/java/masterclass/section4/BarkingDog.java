package masterclass.section4;

public class BarkingDog {
    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        if (hourOfDay > 23 || hourOfDay < 0){
            return false;
        }else if (barking == true && (hourOfDay > 22 || hourOfDay < 8)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,-1));

    }
}
