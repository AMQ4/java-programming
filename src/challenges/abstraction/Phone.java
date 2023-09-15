package challenges.abstraction;

/**
 * A class representing a phone product available for sale, extending the ProductForSale class.
 */
public class Phone extends ProductForSale {

    /**
     * Initializes a new instance of the Phone class.
     *
     * @param type        The type or category of the phone.
     * @param description A brief description of the phone.
     * @param price       The price of the phone.
     */
    public Phone(String type, String description, double price) {
        super(type, description, price);
    }

    /**
     * Displays detailed information about the phone, including its type, description, and price.
     * Overrides the showDetails method of the ProductForSale class.
     */
    @Override
    public void showDetails() {
        System.out.printf("%-15s%s%n".repeat(2), "Type", getType(), "Description", getDescription());
        System.out.printf("%-15s%.2f%n", "Price", getPrice());
    }
}
