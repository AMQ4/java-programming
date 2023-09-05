package challenges.oop.inheritance;

public class SmartKitchen {
    private CoffeeMaker coffeeMaker;
    private DishWasher dishWasher;
    private  Refrigerator refrigerator;

    public SmartKitchen() {
        this.coffeeMaker = new CoffeeMaker();
        this.dishWasher = new DishWasher();
        this.refrigerator = new Refrigerator();
    }

    public void addWater(){
        coffeeMaker.setHasWorkToDo(true);
    }

    public void pourMilk(){
        refrigerator.setHasWorkToDo(true);
    }

    public void loadDishWasher(){
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean coffeeFlag, boolean dishWasherFlag, boolean fridgeFlag){
        coffeeMaker.setHasWorkToDo(coffeeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
        refrigerator.setHasWorkToDo(fridgeFlag);
    }

    public void doKitchenWork(){
        coffeeMaker.brewCoffee();
        dishWasher.doDishes();
        refrigerator.orderFood();
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }
}
