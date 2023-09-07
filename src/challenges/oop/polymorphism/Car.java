package challenges.oop.polymorphism;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName() + " startEngine method");
    }

    public void drive(){
        System.out.println(getClass().getSimpleName() + " drive method");
        runEngine();
    }

    protected void runEngine(){
        System.out.println(getClass().getSimpleName() + " runEngine method");
    }
}
