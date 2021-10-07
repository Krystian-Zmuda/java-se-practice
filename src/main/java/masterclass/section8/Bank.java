package masterclass.section8;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> listOfBranches = new ArrayList<Branch>();

    public void addNewBranch(String branchName) {
        listOfBranches.add(new Branch(branchName));
    }
    public int findBranch(Branch branch) {
        return this.listOfBranches.indexOf(branch);
    }
    public void addCustomerToBranch(Branch existingBranch, String name) {
        if (findBranch(existingBranch) >= 0) {
            existingBranch.addCustomer(name);
        } else {
            System.out.println("That branch does not exist.");
        }
    }
    public void addTransactionToCustomer(Branch branch, Customer customer, Double transaction) {
        if (findBranch(branch) >= 0) {
                branch.addTransaction(customer,transaction);
        }
    }
    public void addTransactionToCustomer(Branch branch, String customer, Double transaction) {
        if (findBranch(branch) >= 0) {
            branch.addTransaction(branch.getCustomer(customer), transaction);
        }
    }


    public void showListOfCustomers(Branch branch) {
        if (findBranch(branch) >= 0) {
            branch.printListOfCustomers();
        }else {
            System.out.println("That branch does not exist.");
        }
    }
public void showListOfTransactions(Branch branch, String customer) {
    if (findBranch(branch) >= 0) {
        branch.getCustomer(customer).printListOfTransactions();
    }
}
    private int findBranch(String branchName) {
        for (int i = 0; i < this.listOfBranches.size(); i++) {
            Branch branch = this.listOfBranches.get(i);
            if (branch.getBranchName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }
    public Branch getBranch(String name) {
        int position = findBranch(name);
        if (position >= 0) {
            return this.listOfBranches.get(position);
        }
        return null;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addNewBranch("Cracow");
        bank.addCustomerToBranch(bank.getBranch("Cracow"),"Diana");
        bank.showListOfCustomers(bank.getBranch("Cracow"));
        bank.addTransactionToCustomer(bank.getBranch("Cracow"), "Diana",250.0);
        bank.addTransactionToCustomer(bank.getBranch("Cracow"), "Diana",350.0);
        bank.addTransactionToCustomer(bank.getBranch("Cracow"), "Diana",450.0);
        bank.showListOfTransactions(bank.getBranch("Cracow"),"Diana");
    }
}
