/**
 * The `LPAStudent` class extends the `Student` class and represents a student with an additional property,
 * the percentage of the course they have completed.
 */
package challenges.generics;

import java.util.Comparator;
import java.util.List;

public class LPAStudent extends Student {

    private double percentComplete;

    /**
     * Creates a new instance of the `LPAStudent` class with a random percentage of course completion.
     */
    public LPAStudent() {
        percentComplete = random.nextDouble(0, 100.001);
    }

    /**
     * Returns a formatted string representation of the `LPAStudent`, including their name, course, year started,
     * and the percentage of the course they have completed.
     *
     * @return A formatted string.
     */
    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percentComplete);
    }

    /**
     * Checks if the specified field name and value match any of the student's fields.
     * Overrides the method from the `Student` class and adds a specific check for the "percentComplete" field.
     *
     * @param fieldName The name of the field to match.
     * @param value     The value to match.
     * @return `true` if the field and value match, otherwise `false`.
     */
    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        if (fieldName.equalsIgnoreCase("percentComplete")) {
            return percentComplete <= Double.parseDouble(value);
        } else {
            return super.matchFieldValue(fieldName, value);
        }
    }

    /**
     * Retrieves the percentage of the course completion for the `LPAStudent`.
     *
     * @return The percentage of course completion.
     */
    public double getPercentComplete() {
        return percentComplete;
    }

    /**
     * The main method demonstrates the usage of the `LPAStudent` class and related functionality.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Create a list of `LPAStudent` objects
        QueryList<Student> students = new QueryList<>();

        // Add 25 random `LPAStudent` instances to the list
        for (int i = 0; i < 25; ++i) {
            students.add(new LPAStudent());
        }

        // Display all students in the list
        System.out.println("All Students:");
        printStudents(students);

        // Sort students by their IDs (as implemented in the `compareTo` method)
        students.sort(Comparator.naturalOrder());

        // Display students sorted by ID
        System.out.println("Students sorted by id (as is implemented in compareTo method):");
        printStudents(students);

        // Sort students using the custom `StudentComparator`
        System.out.println("Students sorted by StudentComparator :");
        students.sort(new StudentComparator());
        printStudents(students);

        // Find and display students who have completed less than 50% of their course
        System.out.println("List of students who have completed less than 50% of the course they are enrolled for:");
        List<Student> studentsWithProgressLessThan50 =
                QueryList.getMatches(students, "percentComplete", "50");
        printStudents(studentsWithProgressLessThan50);
    }

    /**
     * Helper method to print a list of students.
     *
     * @param students The list of students to be printed.
     */
    public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
