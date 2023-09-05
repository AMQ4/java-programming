package exercises.oop.inheritance;

/**
 * The `Cylinder` class represents a geometric cylinder, extending the functionality of a circle to include height.
 */
public class Cylinder extends Circle {
    private double height;

    /**
     * Constructs a new `Cylinder` object with the specified radius and height.
     *
     * @param radius The radius of the cylinder's base. Must be greater than 0.
     * @param height The height of the cylinder. Must be greater than 0.
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height > 0 ? height : 0;
    }

    /**
     * Gets the height of the cylinder.
     *
     * @return The height of the cylinder.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Calculates and returns the volume of the cylinder.
     * The volume is calculated as the product of the base area (π * radius^2) and the height.
     *
     * @return The volume of the cylinder.
     */
    public double getVolume() {
        return getArea() * height;
    }
}
