package challenges.oop.inheritance;

public class Refrigerator {
    private boolean hasWorkToDo;

    public void orderFood(){
        if (hasWorkToDo){
            System.out.println("Placing food order... Work in progress.");
            hasWorkToDo = false;
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
