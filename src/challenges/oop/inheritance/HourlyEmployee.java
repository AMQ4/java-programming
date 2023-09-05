package challenges.oop.inheritance;

/**
 * The `HourlyEmployee` class extends the `Employee` class and represents an employee paid on an hourly basis.
 */
public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    /**
     * Constructs a new `HourlyEmployee` object with the specified name, birthdate, hire date, and hourly pay rate.
     *
     * @param name           The name of the hourly employee.
     * @param birthDate      The birthdate of the hourly employee in the format "dd/mm/yyyy."
     * @param hireDate       The hire date of the hourly employee in the format "dd/mm/yyyy."
     * @param hourlyPayRate  The hourly pay rate for the employee.
     */
    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    /**
     * Calculates and returns the weekly pay for the hourly employee.
     *
     * @return The weekly pay for the hourly employee based on the hourly pay rate and assuming 40 hours worked per week.
     */
    @Override
    public double collectPay() {
        return hourlyPayRate * 40; // Assume the employee gets paid weekly for 40 hours of work.
    }

    /**
     * Calculates and returns the double pay for the hourly employee, which is twice the weekly pay.
     *
     * @return The double pay for the hourly employee.
     */
    public double getDoublePay() {
        return collectPay() * 2;
    }
}
