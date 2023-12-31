package challenges.oop.inheritance;

public class CoffeeMaker {
    private boolean hasWorkToDo;

    public void brewCoffee(){
        if (hasWorkToDo){
            System.out.printf("Brewing coffee... Work in progress.\n");
            hasWorkToDo = false;
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
