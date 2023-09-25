/**
 * The Line class represents a line marker with a specific name and color.
 * It extends the Marker class and inherits its properties and methods.
 */
package challenges.abstraction;

public class Line extends Marker {
    /**
     * Constructs a new Line instance with the specified marker name and color.
     *
     * @param marker The name of the line marker.
     * @param color  The color of the line marker.
     */
    public Line(String marker, String color) {
        super(marker, color);
    }
}
