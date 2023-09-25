/**
 * The UtilityLine class represents a utility line with a specific name, utility type, and label.
 * It implements the Mappable interface, providing methods to retrieve label, marker style,
 * marker type, and convert the utility line to JSON format.
 */
package challenges.abstraction;

public class UtilityLine implements Mappable {
    private String name, utility, label;
    private Line line;

    /**
     * Constructs a new UtilityLine instance with the specified name, utility type, label, and line.
     *
     * @param name    The name of the utility line.
     * @param utility The utility type of the line.
     * @param label   The label of the utility line.
     * @param line    The line representing the utility line.
     */
    public UtilityLine(String name, String utility, String label, Line line) {
        this.name = name;
        this.utility = utility;
        this.label = label;
        this.line = line;
    }

    /**
     * Gets the name of the utility line.
     *
     * @return The name of the utility line.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the utility type of the utility line.
     *
     * @return The utility type of the utility line.
     */
    public String getUtility() {
        return utility;
    }

    /**
     * Implements the label method from the Mappable interface.
     *
     * @return The label of the utility line.
     */
    @Override
    public String label() {
        return label;
    }

    /**
     * Implements the markerStyle method from the Mappable interface.
     *
     * @return The marker style of the utility line.
     */
    @Override
    public String markerStyle() {
        return line.getColor() + " " + line.getMarkerDis();
    }

    /**
     * Implements the markerType method from the Mappable interface.
     *
     * @return The marker type of the utility line.
     */
    @Override
    public Marker markerType() {
        return line;
    }

    /**
     * Converts the utility line to a JSON representation.
     *
     * @return The JSON representation of the utility line.
     */
    @Override
    public String toString() {
        return "\"name\": \"" + name + "\", \"utility\": \"" + utility + "\"";
    }
}
