package exercises.oop.polymorphism;

/**
 * Represents a menu item with a type and price.
 */
public class MenuItem {
    private double price;
    private String type;

    /**
     * Constructs a menu item with the specified type and price.
     *
     * @param type  The type or name of the menu item.
     * @param price The price of the menu item.
     */
    public MenuItem(String type, double price) {
        this.type = type;
        setPrice(price);
    }

    public void setType(String type){
        this.type = type;
    }

    /**
     * Constructs a menu item with the specified type and no specified price.
     *
     * @param type The type or name of the menu item.
     */
    public MenuItem(String type) {
        this.type = type;
    }

    /**
     * Sets the price of the menu item.
     *
     * @param price The price to set. If the price is negative, it is set to 1.0.
     */
    public void setPrice(double price) {
        if (price < 1) {
            System.out.println("The price cannot be a negative number.\nThe " + type + " is set to 1.0");
            this.price = 1.0;
        } else {
            this.price = price;
        }
    }

    /**
     * Gets the price of the menu item.
     *
     * @return The price of the menu item.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns a string representation of the menu item.
     *
     * @return A string in the format "type -> ClassName".
     */
    @Override
    public String toString() {
        return type + " -> " + getClass().getSimpleName();
    }
}
