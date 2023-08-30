package exercises;

public class LeapYearCalculator {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return year >= 1 && year <= 9999;
        } else {
            return year % 4 == 0 && year % 100 != 0 && year >= 1 && year <= 9999;
        }
    }
}
