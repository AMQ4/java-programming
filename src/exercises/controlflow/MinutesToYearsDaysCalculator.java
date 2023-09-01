package exercises.controlflow;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        String result = "Invalid Value";

        if (minutes >= 0)
        {
            long hours = minutes / 60, days = hours / 24, years = days / 365;
            result = minutes + " min = " + years + " y and " + (days - years * 365) + " d";
        }
        System.out.println(result);
    }
}
