package masterclass.section12;


public class DogMain {
    public static void main(String[] args) {
        masterclass.section12.Labrador rover = new masterclass.section12.Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        System.out.println(rover2.equals(rover));
        System.out.println(rover.equals(rover2));
    }
}
