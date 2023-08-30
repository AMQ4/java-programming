package exercises;

public class AreaCalculator {
    public static double area(double radius) {
        double result = -1;
        if (radius >= 0) {
            result = radius * radius * Math.PI;
        }
        return result;
    }

    public static double area(double x, double y) {
        double result = -1;
        if (x >= 0 && y >= 0) {
            result = x * y;
        }
        return result;
    }
}