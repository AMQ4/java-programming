/**
 * The Marker class represents a marker with a specific name and color.
 * It provides methods to access the marker's properties.
 */
package challenges.abstraction;

public class Marker {
    private String marker, color;

    /**
     * Constructs a new Marker instance with the specified marker name and color.
     *
     * @param marker The name of the marker.
     * @param color  The color of the marker.
     */
    public Marker(String marker, String color) {
        this.marker = marker;
        this.color = color;
    }

    /**
     * Gets the name of the marker.
     *
     * @return The name of the marker.
     */
    public String getMarkerDis() {
        return marker;
    }

    /**
     * Gets the color of the marker.
     *
     * @return The color of the marker.
     */
    public String getColor() {
        return color;
    }
}
