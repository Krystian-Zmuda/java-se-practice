package masterclass.section8;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> listOfCustomers = new ArrayList<Customer>();
    private static Customer customer = new Customer();

    public Branch(String branchName) {
        this.branchName = branchName;
        this.listOfCustomers = listOfCustomers;
    }

    public String getBranchName() {
        return branchName;
    }

    public void addCustomer(String name) {
        customer.setName(name);
    listOfCustomers.add(customer);
    }
    public int findCustomer (Customer customer) {
        return this.listOfCustomers.indexOf(customer);
    }
    public void addTransaction(Customer existingCustomer, Double transactionAmount) {
        if (findCustomer(existingCustomer) >= 0 ) {
            existingCustomer.addTransactions(transactionAmount);
        } else {
            System.out.println("That client doesn't exist.");
        }
    }
    public void printListOfCustomers() {
        for (int i = 0; i < listOfCustomers.size(); i++) {
            System.out.println((i+1) + "." + this.listOfCustomers.get(i).getName());
        }
    }
    private int findCustomer(String customerName) {
        for (int i = 0; i < this.listOfCustomers.size(); i++) {
            Customer customer = this.listOfCustomers.get(i);
            if (customer.getName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }
    public Customer getCustomer(String name) {
        int position = findCustomer(name);
        if (position >= 0) {
            return this.listOfCustomers.get(position);
        }
        return null;
    }

}
