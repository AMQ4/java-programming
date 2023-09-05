package challenges.oop.inheritance;

/**
 * The `SalariedEmployee` class extends the `Employee` class and represents an employee paid a fixed annual salary.
 */
public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    /**
     * Constructs a new `SalariedEmployee` object with the specified name, birthdate, hire date, and annual salary.
     *
     * @param name          The name of the salaried employee.
     * @param birthDate     The birthdate of the salaried employee in the format "dd/mm/yyyy."
     * @param hireDate      The hire date of the salaried employee in the format "dd/mm/yyyy."
     * @param annualSalary  The annual salary of the employee.
     */
    SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    /**
     * Calculates and returns the weekly pay for the salaried employee.
     * The weekly pay is based on the annual salary, and if the employee is retired, it is reduced by 10%.
     *
     * @return The weekly pay for the salaried employee.
     */
    @Override
    public double collectPay() {
        double weeklySalary = isRetired ? 0.9 * annualSalary / 26 : annualSalary / 26;
        return (int) weeklySalary;
    }

    /**
     * Sets the employee's retirement status to true and terminates their employment.
     * When an employee retires, their end date is set, and they are no longer active.
     */
    public void retire() {
        this.isRetired = true;
        terminate(endDate);
    }
}
