package exercises.autoboxing_autounboxing;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null){
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        Branch branch = findBranch(branchName);

        if (branch != null){
            return branch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }


    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);

        if (branch != null){
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean printTransactions){
        Branch branch = findBranch(branchName);

        if (branch != null) {
            System.out.println("Customer details for branch " + branchName);
            int customersRank = 1;
            for (Customer customer : branch.getCustomers()) {
                System.out.printf("Customer: %s[%d]%n", customer.getName(), customersRank++);
                if (printTransactions) {
                    System.out.println("Transactions");
                    int transactionsRank = 1;
                    for (double transaction : customer.getTransactions()) {
                        System.out.printf("[%d]  Amount %.2f%n", transactionsRank++, transaction);
                    }
                }
            }
            return true;
        }
        return false;
    }
    private Branch findBranch(String name){
        for (Branch branch : branches) {
            if (branch.getName().equalsIgnoreCase(name)){
                return branch;
            }
        }
        return null;
    }
}
