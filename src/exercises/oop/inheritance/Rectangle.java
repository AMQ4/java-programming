package exercises.oop.inheritance;

/**
 * The `Rectangle` class represents a geometric rectangle with specified width and length.
 */
public class Rectangle {
    protected double width, length;

    /**
     * Constructs a new `Rectangle` object with the specified width and length.
     *
     * @param width  The width of the rectangle. Must be greater than 0.
     * @param length The length of the rectangle. Must be greater than 0.
     */
    public Rectangle(double width, double length) {
        this.width = width > 0 ? width : 0;
        this.length = length > 0 ? length : 0;
    }

    /**
     * Gets the width of the rectangle.
     *
     * @return The width of the rectangle.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Gets the length of the rectangle.
     *
     * @return The length of the rectangle.
     */
    public double getLength() {
        return length;
    }

    /**
     * Calculates and returns the area of the rectangle.
     *
     * @return The area of the rectangle.
     */
    public double getArea() {
        return width * length;
    }
}
