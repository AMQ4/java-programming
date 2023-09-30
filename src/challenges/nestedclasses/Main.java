package challenges.nestedclasses;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Employee> employees = List.of(
                new Employee("Ahmad", "Alqaisi", random.nextInt(1970, 2022)),
                new Employee("Ali", "Hammad", random.nextInt(1970,2022)),
                new Employee("Jana", "Omran", random.nextInt(1970,2022)),
                new Employee("Khaled", "Tuffaha", random.nextInt(1970,2022)),
                new Employee("Khaled", "Tuffaha", random.nextInt(1970,2022)),
                new Employee("Dina", "Alqaisi", random.nextInt(1970,2022))
        );

        printSortedEmployees(employees);
    }
    private static void printSortedEmployees(List<? extends Employee> employees){
        class EmployeeWrapper{
            private Employee employee;
            EmployeeWrapper(Employee employee){
                this.employee = employee;
            }

            public String fullName(){
                return employee.firstName() + " " + employee.lastName();
            }

            public int yearsWorked(){
                return LocalDate.now().getYear() - employee.hireData();
            }

            @Override
            public String toString() {
                return "%-25s%d".formatted(fullName(), yearsWorked());
            }
        }

        var sorter = new Comparator<EmployeeWrapper>(){
            @Override
            public int compare(EmployeeWrapper employee1, EmployeeWrapper employee2){
                return (employee1.fullName() + employee1.yearsWorked()).compareTo(employee2.fullName() + employee2.yearsWorked());
            }
        };

        List<EmployeeWrapper> employeeWrappers = new ArrayList<>();
        for (Employee employee:
             employees) {
            employeeWrappers.add(new EmployeeWrapper(employee));
        }

        System.out.println("\nUnsorted list of Employees:");
        for (EmployeeWrapper employee:
                employeeWrappers) {
            System.out.println(employee);
        }

        employeeWrappers.sort(sorter);

        System.out.println("\nSorted list of Employees based on name/worked years:");
        for (EmployeeWrapper employee:
             employeeWrappers) {
            System.out.println(employee);
        }
    }
}
