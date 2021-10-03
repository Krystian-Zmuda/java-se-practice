package masterclass.section6;

public class Test {
    public static void main(String[] args) {
        SimpleCalculator calc1 = new SimpleCalculator();
        SimpleCalculator calc2 = new SimpleCalculator();
        calc1.setFirstNumber(10);
        calc1.setSecondNumber(5);
        calc2.setFirstNumber(20);
        calc2.setSecondNumber(2);
        System.out.println(calc1.getFirstNumber());
        System.out.println(calc1.getSecondNumber());
        System.out.println(calc2.getFirstNumber());
        System.out.println(calc2.getSecondNumber());

        BankAccountChallenge halfEmpty = new BankAccountChallenge("Bill","bill@email.com","112345000");
        System.out.println(halfEmpty.getAccountNumber());
        System.out.println(halfEmpty.getBalance());
        System.out.println(halfEmpty.getCustomerName());
        System.out.println(halfEmpty.getCustomerEmail());
        System.out.println(halfEmpty.getPhoneNumber());

        System.out.println("-------------------------------------");

        VipCustomerChallenge vip = new VipCustomerChallenge();
        System.out.println(vip.getCreditLimit());
        System.out.println(vip.getEmailAddress());
        System.out.println(vip.getName());
        VipCustomerChallenge vip2 = new VipCustomerChallenge("Bob" , 12345);
        System.out.println(vip2.getName());
        System.out.println(vip2.getEmailAddress());
        System.out.println(vip2.getCreditLimit());
        VipCustomerChallenge vip3 = new VipCustomerChallenge("Bobba", 99999, "no email needed");
        System.out.println(vip3.getName());
        System.out.println(vip3.getEmailAddress());
        System.out.println(vip3.getCreditLimit());

        System.out.println("--------------------");
        Point first = new Point();
        System.out.println(first.distance());
    }
}
