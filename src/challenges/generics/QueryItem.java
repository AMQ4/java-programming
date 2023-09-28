package challenges.generics;

/**
 * The QueryItem interface represents an item that can be used for querying data.
 * Implementations of this interface should provide a method to match a field's value.
 */
public interface QueryItem {

    /**
     * Checks if a field's value matches a given value.
     *
     * @param fieldName The name of the field to match.
     * @param value     The value to match against the field's value.
     * @return True if the field's value matches the given value, otherwise false.
     */
    boolean matchFieldValue(String fieldName, String value);
}
