package challenges.generics;

/**
 * An abstract class representing a geographical point with latitude and longitude coordinates.
 * Classes that extend this class should provide specific implementations for rendering and other behaviors.
 */
public abstract class Point implements Mappable {
    private double lat, lang;

    /**
     * Constructs a Point object with the given latitude and longitude coordinates.
     *
     * @param lat  The latitude coordinate.
     * @param lang The longitude coordinate.
     */
    public Point(double lat, double lang) {
        this.lat = lat;
        this.lang = lang;
    }

    /**
     * Sets the latitude and longitude coordinates of the Point.
     *
     * @param lat  The new latitude coordinate.
     * @param lang The new longitude coordinate.
     */
    void setPoint(double lat, double lang) {
        this.lat = lat;
        this.lang = lang;
    }

    /**
     * Gets the latitude and longitude coordinates of the Point as an array.
     *
     * @return An array containing the latitude and longitude coordinates.
     */
    double[] getPoint() {
        return new double[]{lat, lang};
    }

    /**
     * Returns a string representation of the Point in the format "[latitude, longitude]".
     *
     * @return A string representation of the Point.
     */
    @Override
    public String toString() {
        return String.format("[%f, %f]", lat, lang);
    }

    /**
     * Checks if this Point is equal to another object.
     *
     * @param obj The object to compare with.
     * @return {@code true} if the objects are equal, {@code false} otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().getSimpleName().equals(getClass().getSimpleName())) {
            return false;
        }

        return ((Point) obj).lang == lang && ((Point) obj).lat == lat;
    }
}
