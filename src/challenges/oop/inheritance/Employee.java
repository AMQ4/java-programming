package challenges.oop.inheritance;

public class Employee extends Worker{
    private long employeeid;
    private String hireDate;

    public static int employeeNo = 0;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeid = ++Employee.employeeNo;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeid=" + employeeid +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
