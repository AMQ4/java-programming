package challenges.abstraction;

/**
 * A class representing a watch product available for sale, extending the ProductForSale class.
 */
public class Watch extends ProductForSale {

    /**
     * Initializes a new instance of the Watch class.
     *
     * @param type        The type or category of the watch.
     * @param description A brief description of the watch.
     * @param price       The price of the watch.
     */
    public Watch(String type, String description, double price) {
        super(type, description, price);
    }

    /**
     * Displays detailed information about the watch, including its type, description, and price.
     * Overrides the showDetails method of the ProductForSale class.
     */
    @Override
    public void showDetails() {
        System.out.printf("%-15s%s%n".repeat(2), "Type", getType(), "Description", getDescription());
        System.out.printf("%-15s%.2f%n", "Price", getPrice());
    }
}
