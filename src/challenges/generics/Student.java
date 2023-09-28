/**
 * The `Student` class represents a student with attributes such as name, course, year started, and an ID.
 * It implements the `QueryItem` interface and provides methods for comparing and matching fields.
 */
package challenges.generics;

import java.util.Comparator;
import java.util.Random;

public class Student implements QueryItem, Comparable<Student> {
    protected String name;
    protected String course;
    protected int yearStarted, id;

    protected static Random random = new Random();

    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static String[] courses = {"C++", "Java", "Python"};

    /**
     * Creates a new instance of the `Student` class with random values for name, course, year started, and ID.
     */
    public Student() {
        int lastNameIndex = random.nextInt(65, 91);
        name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2018, 2023);
        id = random.nextInt(0, 5000);
    }

    /**
     * Returns a formatted string representation of the student's ID, name, course, and year started.
     *
     * @return A formatted string.
     */
    @Override
    public String toString() {
        return "%-5d %-15s %-15s %d".formatted(id, name, course, yearStarted);
    }

    /**
     * Checks if the specified field name and value match any of the student's fields.
     *
     * @param fieldName The name of the field to match.
     * @param value     The value to match.
     * @return `true` if the field and value match, otherwise `false`.
     */
    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        String fName = fieldName.toUpperCase();
        return switch (fName) {
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value));
            default -> false;
        };
    }

    /**
     * Compares two students based on their IDs.
     *
     * @param o The student to compare to.
     * @return A negative integer, zero, or a positive integer if this student is less than, equal to, or greater than
     *         the specified student.
     */
    @Override
    public int compareTo(Student o) {
        return Integer.compare(id, o.id);
    }
}

/**
 * The `StudentComparator` class implements the `Comparator` interface for comparing students.
 * It compares students based on their course, year started, and additional properties if they are LPAStudents.
 */
class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (!(o1 instanceof LPAStudent)) {
            return (o1.course + o1.yearStarted).compareTo(o2.course + o2.yearStarted);
        } else {
            return (o1.course + o1.yearStarted + ((LPAStudent) o1).getPercentComplete()).compareTo(
                    o2.course + o2.yearStarted + ((LPAStudent) o2).getPercentComplete());
        }
    }
}
