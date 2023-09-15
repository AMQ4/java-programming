package challenges.abstraction;

/**
 * A class representing a TV product available for sale, extending the ProductForSale class.
 */
public class TV extends ProductForSale {

    /**
     * Initializes a new instance of the TV class.
     *
     * @param type        The type or category of the TV.
     * @param description A brief description of the TV.
     * @param price       The price of the TV.
     */
    public TV(String type, String description, double price) {
        super(type, description, price);
    }

    /**
     * Displays detailed information about the TV, including its type, description, and price.
     * Overrides the showDetails method of the ProductForSale class.
     */
    @Override
    public void showDetails() {
        System.out.printf("%-15s%s%n".repeat(2), "Type", getType(), "Description", getDescription());
        System.out.printf("%-15s%.2f%n", "Price", getPrice());
    }
}
