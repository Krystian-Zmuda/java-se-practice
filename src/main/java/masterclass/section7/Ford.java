package masterclass.section7;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    public static void main(String[] args) {
        Ford ford = new Ford(4,"ford");
        System.out.println(ford.startEngine());
    }
}
