package challenges.abstraction;

/**
 * An abstract class representing a product available for sale.
 */
abstract public class ProductForSale {
    private String type;
    private String description;
    private double price;

    /**
     * Initializes a new instance of the ProductForSale class.
     *
     * @param type        The type or category of the product.
     * @param description A brief description of the product.
     * @param price       The price of the product.
     */
    public ProductForSale(String type, String description, double price) {
        this.type = type;
        this.description = description;
        this.price = price;
    }

    /**
     * Gets the type of the product.
     *
     * @return The type of the product.
     */
    public String getType() {
        return type;
    }

    /**
     * Gets a brief description of the product.
     *
     * @return The product description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the price of the product.
     *
     * @return The price of the product.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Calculates the total price for a specified quantity of the product.
     *
     * @param quantity The quantity of the product to calculate the total price for.
     * @return The total price for the specified quantity of the product.
     */
    public double getPrice(int quantity) {
        if (quantity < 0) {
            System.out.println("Quantity cannot be a negative number, returning zero.");
            return 0;
        }
        return getPrice() * quantity;
    }

    /**
     * Prints an itemized list for the product, including quantity, item price, and total price.
     *
     * @param quantity The quantity of the product to print the itemized list for.
     */
    public void printItemizedList(int quantity) {
        if (quantity < 0) {
            System.out.println("Quantity cannot be a negative number, printing for quantity = 1");
            quantity = 1;
        }

        System.out.printf("%-15s:%d%-15s:%.2f%-15s:%.2f",
                "Quantity", quantity,
                "Item Price", getPrice(),
                "Total", getPrice(quantity));
    }

    /**
     * Displays detailed information about the product.
     * Subclasses should implement this method to provide specific details for each product type.
     */
    public abstract void showDetails();
}
