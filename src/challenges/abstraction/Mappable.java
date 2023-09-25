/**
 * The Mappable interface represents an object that can be mapped to JSON format
 * and provides methods to retrieve label, marker style, marker type, and convert
 * the object to JSON format.
 */
package challenges.abstraction;

public interface Mappable {

    String JSON_PROPERTY = "\"property\":{%s}";

    /**
     * Gets the label associated with the object.
     *
     * @return The label of the object.
     */
    String label();

    /**
     * Gets the marker style associated with the object.
     *
     * @return The marker style of the object.
     */
    String markerStyle();

    /**
     * Gets the marker type associated with the object.
     *
     * @return The marker type of the object.
     */
    Marker markerType();

    /**
     * Converts the object to a JSON representation.
     *
     * @return The JSON representation of the object.
     */
    default String toJSON(){
        return JSON_PROPERTY.formatted("\"type\": \"" + markerType().getClass().getSimpleName() + "\", \"label\": \""
                + label() + "\", \"marker\": \"" + markerStyle() + "\"");
    }

    /**
     * Static method to print all properties of a Mappable object in JSON format.
     *
     * @param mappable The Mappable object to print properties for.
     */
    static void printAllProperties(Mappable mappable){
        System.out.printf((JSON_PROPERTY) + "%n", "\"type\": \"" + mappable.markerType().getClass().getSimpleName() +
                "\", \"label\": \"" + mappable.label() + "\", \"marker\": \"" + mappable.markerStyle() + "\", " + mappable);
    }
}
