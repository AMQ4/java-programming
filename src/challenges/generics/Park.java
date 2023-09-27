package challenges.generics;

/**
 * Represents a park with a name and geographical coordinates.
 * The Park class extends the Point class and provides specific functionality for rendering and displaying parks.
 */
public class Park extends Point {
    private String name;

    /**
     * Constructs a Park object with the given name, latitude, and longitude coordinates.
     *
     * @param name The name of the park.
     * @param lat  The latitude coordinate of the park's location.
     * @param lang The longitude coordinate of the park's location.
     */
    public Park(String name, double lat, double lang) {
        super(lat, lang);
        this.name = name;
    }

    /**
     * Constructs a Park object with the given name and default coordinates (0, 0).
     *
     * @param name The name of the park.
     */
    public Park(String name) {
        super(0, 0);
        this.name = name;
    }

    /**
     * Renders the park as a string, including its name and coordinates.
     *
     * @return A string representation of the park.
     */
    @Override
    public String render() {
        return name + " " + getClass().getSimpleName() + " as POINT (" + super.toString() + ")";
    }

    /**
     * Returns a string representation of the park, including its name.
     *
     * @return A string representation of the park.
     */
    @Override
    public String toString() {
        return name + super.toString();
    }
}
