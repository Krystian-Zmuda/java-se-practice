package masterclass.section5;

public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(12 % 5);
        System.out.println(canPack(2,1,1));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }else if (((bigCount * 5) + smallCount) < goal) {
            return false;
        }else if ((goal < (bigCount * 5)) && (smallCount < goal % 5)) {
            return false;
        }else {
            return true;
        }
    }
}
