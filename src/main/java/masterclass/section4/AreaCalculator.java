package masterclass.section4;
public class AreaCalculator {

    static final double INVALID_VALUE = -1.0;

    public static double area(double radius) {
        if (radius < 0) {
            return INVALID_VALUE;
        }

        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return INVALID_VALUE;
        }

        return x * y;
    }

    public static void main(String[] args) {
        System.out.println(area(-1,4));
    }
}
