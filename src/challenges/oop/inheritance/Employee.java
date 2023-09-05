package challenges.oop.inheritance;

/**
 * The `Employee` class extends the `Worker` class and represents an employee with additional properties.
 */
public class Employee extends Worker {
    /**
     * A static variable to keep track of the total number of employees created.
     */
    public static int employeeNo = 0;

    private long employeeid;
    private String hireDate;

    /**
     * Constructs a new `Employee` object with the specified name, birthdate, and hire date.
     *
     * @param name      The name of the employee.
     * @param birthDate The birthdate of the employee in the format "dd/mm/yyyy."
     * @param hireDate  The hire date of the employee in the format "dd/mm/yyyy."
     */
    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeid = ++Employee.employeeNo;
        this.hireDate = hireDate;
    }

    /**
     * Returns a string representation of the `Employee` object, including its employee ID, hire date,
     * and the details inherited from the `Worker` class.
     *
     * @return A string representation of the `Employee` object.
     */
    @Override
    public String toString() {
        return "Employee{" +
                "employeeid=" + employeeid +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
