/**
 * The Building class represents a building with a specific name, usage, and label.
 * It implements the Mappable interface, providing methods to retrieve label, marker style,
 * marker type, and convert the building to JSON format.
 */
package challenges.abstraction;

public class Building implements Mappable {
    private String name, usage, label;
    private Point point;

    /**
     * Constructs a new Building instance with the specified name, usage, label, and point.
     *
     * @param name   The name of the building.
     * @param usage  The usage of the building.
     * @param label  The label of the building.
     * @param point  The point representing the building's location.
     */
    public Building(String name, String usage, String label, Point point) {
        this.name = name;
        this.usage = usage;
        this.label = label;
        this.point = point;
    }

    /**
     * Gets the name of the building.
     *
     * @return The name of the building.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the usage of the building.
     *
     * @return The usage of the building.
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Implements the label method from the Mappable interface.
     *
     * @return The label of the building.
     */
    @Override
    public String label() {
        return label;
    }

    /**
     * Implements the markerStyle method from the Mappable interface.
     *
     * @return The marker style of the building.
     */
    @Override
    public String markerStyle() {
        return point.getColor() + " " + point.getMarkerDis();
    }

    /**
     * Implements the markerType method from the Mappable interface.
     *
     * @return The marker type of the building.
     */
    @Override
    public Marker markerType() {
        return point;
    }

    /**
     * Converts the building to a JSON representation.
     *
     * @return The JSON representation of the building.
     */
    @Override
    public String toString() {
        return "\"name\": \"" + name + "\", \"usage\": \"" + usage + "\"";
    }
}
