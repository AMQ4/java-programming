/**
 * The Point class represents a point marker with a specific name and color.
 * It extends the Marker class and inherits its properties and methods.
 */
package challenges.abstraction;

public class Point extends Marker {
    /**
     * Constructs a new Point instance with the specified marker name and color.
     *
     * @param marker The name of the point marker.
     * @param color  The color of the point marker.
     */
    public Point(String marker, String color) {
        super(marker, color);
    }
}
