package exercises.oop.polymorphism;

/**
 * Represents a hamburger menu item with options for regular or deluxe burgers.
 */
public class Hamburger extends MenuItem {
    /**
     * Indicates a regular burger.
     */
    public static final boolean REGULAR_BURGER = false;

    /**
     * Indicates a deluxe burger.
     */
    public static final boolean DELUXE_BURGER = true;

    private byte numberOfToppings;
    private boolean type;

    /**
     * Constructs a hamburger menu item with the specified type and price, setting the number of toppings to 1 by default.
     *
     * @param type  The type of the hamburger (REGULAR_BURGER or DELUXE_BURGER).
     * @param price The price of the hamburger.
     */
    public Hamburger(boolean type, double price) {
        super((type) ? "Deluxe burger" : "Regular burger", price);
        this.type = type;
        numberOfToppings = 1;
    }

    /**
     * Constructs a regular hamburger menu item with the specified price.
     *
     * @param price The price of the hamburger.
     */
    public Hamburger(double price) {
        this(Hamburger.REGULAR_BURGER, price);
    }

    /**
     * Adds extra toppings to the hamburger.
     *
     * @param numberOfExtraToppings The number of extra toppings to add.
     */
    public void addExtraToppings(byte numberOfExtraToppings) {
        if (numberOfExtraToppings <= 0) {
            System.out.println("Failed: You cannot add %d extra toppings!".formatted(numberOfExtraToppings));
            return;
        }

        int maxToppingsAllowed = (type) ? 5 : 3;

        if (numberOfToppings + numberOfExtraToppings <= maxToppingsAllowed) {
            numberOfToppings += numberOfExtraToppings;
            System.out.println("Your burger now has %d toppings".formatted(getNumberOfToppings()));
        } else {
            System.out.println("failed: You cannot add more than %d toppings!".formatted(maxToppingsAllowed));
            if (maxToppingsAllowed == 3) {
                System.out.println("Try Deluxe burgers.");
            }
        }
    }

    /**
     * Sets the type of the hamburger, indicating whether it is a regular burger or a deluxe burger.
     *
     * @param type The type of the hamburger (REGULAR_BURGER or DELUXE_BURGER).
     */
    public void setType(boolean type) {
        this.type = type;
    }

    /**
     * Gets the current number of toppings on the hamburger.
     *
     * @return The number of toppings on the hamburger.
     */
    public byte getNumberOfToppings() {
        return numberOfToppings;
    }

    /**
     * Removes toppings from the hamburger.
     *
     * @param numberOfToppingsToRemove The number of toppings to remove.
     */
    public void removeToppings(byte numberOfToppingsToRemove) {
        if (numberOfToppings - numberOfToppingsToRemove <= 0) {
            System.out.printf("Failed: You can get a burger of %d toppings!%n", numberOfToppings - numberOfToppingsToRemove);
        } else {
            numberOfToppings -= numberOfToppingsToRemove;
            System.out.printf("Your burger is now of %d toppings.%n", numberOfToppings);
        }
    }

    /**
     * Overrides the method to calculate the price of the hamburger based on the number of toppings.
     *
     * @return The calculated price of the hamburger.
     */
    @Override
    public double getPrice() {
        return switch (numberOfToppings) {
            case 2 -> super.getPrice() + super.getPrice() * 0.75 + (type ? 0.30 : 0);
            case 3, 4, 5 -> super.getPrice() + super.getPrice() * 0.5 * numberOfToppings + (type ? 0.30 : 0);
            default -> super.getPrice() + (type ? 0.30 : 0);
        };
    }
}
