package masterclass.section6;

public class VipCustomerChallenge {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomerChallenge() {
        this("Default name", 100000, "No email");
    }
    public VipCustomerChallenge(String name, double creditLimit) {
        this(name,creditLimit,"Default email address");
    }

    public VipCustomerChallenge(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
