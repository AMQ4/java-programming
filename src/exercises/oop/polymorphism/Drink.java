package exercises.oop.polymorphism;

/**
 * Represents a drink item that can be ordered with different sizes.
 */
public class Drink extends MenuItem {

    /**
     * The price multiplier for a small-sized drink.
     */
    public static final double SMALL = 1;

    /**
     * The price multiplier for a medium-sized drink.
     */
    public static final double MEDIUM = 1.5;

    /**
     * The price multiplier for a large-sized drink.
     */
    public static final double LARGE = 1.75;

    private double size;

    /**
     * Constructs a drink item with the specified type and price, setting the size to small by default.
     *
     * @param type  The type or name of the drink.
     * @param price The price of the drink.
     */
    public Drink(String type, double price) {
        super(type, price);
        size = Drink.SMALL;
    }

    /**
     * Sets the size of the drink.
     *
     * @param size The size of the drink (SMALL, MEDIUM, or LARGE).
     */
    public void setSize(double size) {
        if (size == Drink.LARGE || size == Drink.MEDIUM || size == Drink.SMALL) {
            this.size = size;
        } else {
            System.out.println("Failed: The size of the drink can only be: Drink.LARGE, Drink.MEDIUM, or Drink.SMALL");
        }
    }

    /**
     * Gets the size of the drink.
     *
     * @return The size of the drink (SMALL, MEDIUM, or LARGE).
     */
    public double getSize() {
        return size;
    }


    /**
     * Overrides the method to calculate the price of the drink based on its size.
     *
     * @return The calculated price of the drink.
     */
    @Override
    public double getPrice() {
        return super.getPrice() * size;
    }
}
