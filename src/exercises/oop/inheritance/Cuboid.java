package exercises.oop.inheritance;

/**
 * The `Cuboid` class represents a geometric cuboid, extending the functionality of a rectangle to include height.
 */
public class Cuboid extends Rectangle {
    private double height;

    /**
     * Constructs a new `Cuboid` object with the specified width, length, and height.
     *
     * @param width  The width of the cuboid's base. Must be greater than 0.
     * @param length The length of the cuboid's base. Must be greater than 0.
     * @param height The height of the cuboid. Must be greater than 0.
     */
    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height > 0 ? height : 0;
    }

    /**
     * Gets the height of the cuboid.
     *
     * @return The height of the cuboid.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Calculates and returns the volume of the cuboid.
     * The volume is calculated as the product of the base area (width * length) and the height.
     *
     * @return The volume of the cuboid.
     */
    public double getVolume() {
        return height * getWidth() * getLength();
    }
}
