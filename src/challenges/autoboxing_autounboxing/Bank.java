package challenges.autoboxing_autounboxing;

import java.util.ArrayList;

/**
 * Represents a bank with a name and a list of customers.
 */
public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    /**
     * Constructs a new Bank with the given name and initializes an empty list of customers.
     *
     * @param name The name of the bank.
     */
    public Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    /**
     * Adds a customer to the bank's list of customers.
     *
     * @param customer The customer to add.
     * @return True if the customer was added successfully, false if the customer already exists.
     */
    public boolean addCustomer(Customer customer) {
        if (!customers.contains(customer)) {
            customers.add(customer);
            return true;
        }
        return false;
    }

    /**
     * Adds a transaction to a customer's list of transactions.
     *
     * @param customer    The customer whose transactions will be updated.
     * @param transaction The transaction amount to add.
     * @return True if the transaction was added successfully, false if the customer is not found.
     */
    public boolean addTransaction(Customer customer, double transaction) {
        int customerIndex = customers.indexOf(customer);
        if (customerIndex > -1) {
            customers.get(customerIndex).transactions().add(transaction); // Auto-boxing here
            return true;
        }
        return false;
    }

    /**
     * Returns a string representation of the bank.
     *
     * @return A string representing the bank's name and its list of customers.
     */
    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    /**
     * Prints the transactions of a customer with the given name.
     *
     * @param customerName The name of the customer whose transactions will be printed.
     */
    public void print(String customerName) {
        int customerIndex = customers.indexOf(new Customer(customerName));
        if (customerIndex > -1) {
            System.out.println(customerName + ":");
            System.out.print("transactions: ");
            for (double transaction : customers.get(customerIndex).transactions()) // Auto-unboxing here
            {
                System.out.print(transaction + " ");
            }
            System.out.println();
        }
    }
}
