package exercises.oop.polymorphism;

/**
 * The MealOrder class represents a customer's meal order, including a hamburger, drink, and side item.
 */
public class MealOrder {
    private Hamburger hamburger;
    private Drink drink;
    private MenuItem sideItem;

    /**
     * Sets the type of burger in the order.
     *
     * @param burgerType True for a regular burger, false for a vegetarian burger.
     */
    public void setBurgerType(boolean burgerType){
        hamburger.setType(burgerType);
    }

    /**
     * Constructs a MealOrder with default items: a hamburger, a drink, and a side item.
     */
    MealOrder(){
        hamburger = new Hamburger(1.0);
        drink = new Drink("Coca-Cola", 0.3);
        sideItem = new MenuItem("Fries", 0.4);
    }

    /**
     * Sets the hamburger in the order.
     *
     * @param hamburger The hamburger to set.
     */
    public void setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    /**
     * Sets the drink in the order.
     *
     * @param drink The drink to set.
     */
    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    /**
     * Sets the side item in the order.
     *
     * @param sideItem The side item to set.
     */
    public void setSideItem(MenuItem sideItem) {
        this.sideItem = sideItem;
    }

    /**
     * Adds extra toppings to the hamburger.
     *
     * @param toppingsNumber The number of extra toppings to add.
     */
    public void addExtraToppings(byte toppingsNumber){
        hamburger.addExtraToppings(toppingsNumber);
    }

    /**
     * Calculates the total price of the meal order.
     *
     * @return The total price of the meal order.
     */
    public double price(){
        return drink.getPrice() + hamburger.getPrice() + sideItem.getPrice();
    }

    /**
     * Creates a new MealOrder with specified parameters.
     *
     * @param burgerType True for a regular burger, false for a vegetarian burger.
     * @param drinkType The type of drink.
     * @param itemSideType The type of side item.
     * @return A new MealOrder with the specified parameters.
     */
    public static MealOrder createMealOrder(boolean burgerType, String drinkType, String itemSideType){
        MealOrder mealOrder = new MealOrder();
        mealOrder.setBurgerType(burgerType);
        mealOrder.setDrinkType(drinkType);
        Drink drink = new Drink(drinkType, 0.30);
        MenuItem itemSide = new MenuItem(itemSideType, 0.5);

        mealOrder.setDrink(drink);
        mealOrder.setSideItem(itemSide);

        return mealOrder;
    }

    /**
     * Sets the type of drink in the order.
     *
     * @param type The type of drink to set.
     */
    public void setDrinkType(String type){
        drink.setType(type);
    }

    /**
     * Sets the size of the drink in the order.
     *
     * @param drinkSize The size of the drink to set.
     */
    public void setDrinkSize(double drinkSize){
        drink.setSize(drinkSize);
    }
}
