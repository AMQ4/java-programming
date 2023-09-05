package exercises.oop.inheritance;

/**
 * The `Circle` class represents a geometric circle with a specified radius.
 */
public class Circle {
    private double radius;

    /**
     * Constructs a new `Circle` object with the specified radius.
     *
     * @param radius The radius of the circle. Must be greater than 0.
     */
    public Circle(double radius) {
        this.radius = radius > 0 ? radius : 0;
    }

    /**
     * Gets the radius of the circle.
     *
     * @return The radius of the circle.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Calculates and returns the area of the circle.
     *
     * @return The area of the circle.
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
