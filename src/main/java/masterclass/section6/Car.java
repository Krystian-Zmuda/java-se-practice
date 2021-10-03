package masterclass.section6;

public class Car extends Vehicle{
    private int wheels;
    private int doors;
    private String typeOfFuel;

    public Car(int length, String name, int wheels, int doors, String typeOfFuel) {
        super(length, name);
        this.wheels = wheels;
        this.doors = doors;
        this.typeOfFuel = typeOfFuel;
    }


}
