package masterclass.section7;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);
    }

//    String addition2Name;
//    double addition2Price;
//    String addition3Name;
//    double addition3Price;
//    String addition4Name;
//    double addition4Price;


    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        this.price += addition1Price;
        System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
    }
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        this.price += addition2Price;
        System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        this.price += addition3Price;
        System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        this.price += addition4Price;
        System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
    }

    public double itemizeHamburger() {
        return this.price;
    }

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
    }
}
