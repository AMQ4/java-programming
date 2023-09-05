package challenges.oop.inheritance;

/**
 * The `Worker` class represents a basic worker with a name, birthdate, and employment end date.
 * It provides methods to calculate the worker's age, collect pay, and terminate employment.
 */
public class Worker {
    private String name, birthDate;
    protected String endDate;

    /**
     * Constructs a new `Worker` object with default values.
     * The default name is set to "no name," and both the birthdate and end date are set to "01/01/2023."
     */
    public Worker() {
        this.name = "no name";
        this.birthDate = this.endDate = "01/01/2023";
    }

    /**
     * Constructs a new `Worker` object with the specified name and birthdate.
     *
     * @param name      The name of the worker.
     * @param birthDate The birthdate of the worker in the format "dd/mm/yyyy."
     */
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    /**
     * Calculates and returns the age of the worker based on the birthdate and the current year (2023).
     *
     * @return The age of the worker.
     */
    public int getAge() {
        int currentYear = 2023;
        int birthYear = Integer.parseInt(this.birthDate.substring(6)); // assuming the birthdate is in the form of dd/mm/yyyy
        return currentYear - birthYear;
    }

    /**
     * Calculates and returns the amount of pay for the worker.
     * This method should be overridden by subclasses to provide specific pay calculation logic.
     *
     * @return The amount of pay for the worker.
     */
    public double collectPay() {
        return 0.0;
    }

    /**
     * Terminates the worker's employment and sets the end date to the specified date.
     *
     * @param endDate The end date of the worker's employment in the format "dd/mm/yyyy."
     */
    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * Returns a string representation of the `Worker` object, including its name, birthdate, and end date.
     *
     * @return A string representation of the `Worker` object.
     */
    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}