package masterclass.section8;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

//    public Customer(String name) {
//        this.name = name;
//        this.transactions = new ArrayList<Double>();
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransactions(Double transaction) {
        this.transactions.add(transaction);
    }
    public void printListOfTransactions() {
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println((i+1) + "." + this.transactions.get(i));
        }
    }

}
