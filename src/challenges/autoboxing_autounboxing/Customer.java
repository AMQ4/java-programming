package challenges.autoboxing_autounboxing;

import java.util.ArrayList;

/**
 * Represents a customer with a name and a list of transactions.
 */
public record Customer(String name, ArrayList<Double> transactions) {

    /**
     * Constructs a new Customer with the given name and an empty list of transactions.
     *
     * @param name The name of the customer.
     */
    public Customer(String name) {
        this(name, new ArrayList<>());
    }

    /**
     * Compares this customer to another object to determine if they are equal.
     *
     * @param obj The object to compare to.
     * @return True if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().getSimpleName().equals(this.getClass().getSimpleName())) {
            return false;
        }
        return name.equals(((Customer) obj).name);
    }
}
