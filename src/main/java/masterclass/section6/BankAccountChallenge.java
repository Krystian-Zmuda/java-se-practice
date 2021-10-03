package masterclass.section6;

public class BankAccountChallenge {
    private String  accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    //We can set up a default constructor which will use "this." form another constructor (in this case below)
    public BankAccountChallenge() {
        this("12344",1.00,"No name","No email","123456789");
        System.out.println("Empty constructor called, default values used");
    }

    //Setting up constructor below. Constructor can be overloaded just like the method (different parameters).
    public BankAccountChallenge(String accountNumber, double balance, String customerName, String customerEmail, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    //We can also set up constructor in such a way that some fields are given default values and don require input, and some do:
    public BankAccountChallenge(String customerName, String customerEmail, String phoneNumber) {
        this("999999", 12345.00, customerName, customerEmail, phoneNumber);
        System.out.println("First two fields have default values");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        System.out.println("Account number has been set to: " + this.accountNumber);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit) {
        this.balance += deposit;
        System.out.println("Your new account balance is: " + this.balance);
    }
    public void withdrawFunds(double withdrawal) {
        if (withdrawal > this.balance) {
            System.out.println("Insufficient funds");
        }else if (withdrawal <= 0) {
            System.out.println("Invalid value!");
        }else {
            this.balance -= withdrawal;
            System.out.println("Your new account balance is: " + this.balance);
        }
    }
}
