package challenges.oop.inheritance;

public class DishWasher {
    private boolean hasWorkToDo;

    public void doDishes(){
        if(hasWorkToDo) {
            System.out.println("Doing the dishes... Work in progress.");
            hasWorkToDo = false;
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
