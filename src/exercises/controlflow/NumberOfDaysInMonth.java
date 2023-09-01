package exercises.controlflow;

public class NumberOfDaysInMonth {
    /**
     * Gets the number of days in a specific month of a given year.
     *
     * @param month The month for which the number of days is required (1-12).
     * @param year  The year in which the month falls (1-9999).
     * @return The number of days in the specified month of the provided year.
     *         Returns -1 if either month or year is outside valid ranges.
     */
    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return -1; // Return -1 for invalid month or year values
        }
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31; // Months with 31 days
            case 2 -> LeapYearCalculator.isLeapYear(year) ? 29 : 28; // February, accounting for leap years
            default -> 30; // Months with 30 days
        };
    }
}
