package exercises.abstraction;

/**
 * This abstract class represents a basic linked list item.
 * Each item has a reference to the next and previous items, as well as a value.
 */
abstract public class ListItem {
    protected ListItem rightLink, leftLink;
    protected Object value;

    /**
     * Constructs a new ListItem with the specified value.
     *
     * @param value The value to be stored in this ListItem.
     */
    public ListItem(Object value) {
        this.value = value;
    }

    /**
     * Get the next ListItem in the list.
     *
     * @return The next ListItem in the list, or null if there is no next item.
     */
    abstract ListItem next();

    /**
     * Set the next ListItem in the list.
     *
     * @param rightLink The ListItem to be set as the next item.
     * @return The updated ListItem with the new next reference.
     */
    abstract ListItem setNext(ListItem rightLink);

    /**
     * Get the previous ListItem in the list.
     *
     * @return The previous ListItem in the list, or null if there is no previous item.
     */
    abstract ListItem previous();

    /**
     * Set the previous ListItem in the list.
     *
     * @param leftLink The ListItem to be set as the previous item.
     * @return The updated ListItem with the new previous reference.
     */
    abstract ListItem setPrevious(ListItem leftLink);

    /**
     * Compare this ListItem with another ListItem for ordering purposes.
     *
     * @param listItem The ListItem to compare with.
     * @return A negative integer if this item is less than the other, zero if they are equal,
     *         or a positive integer if this item is greater than the other.
     */
    abstract int compareTo(ListItem listItem);

    /**
     * Get the value stored in this ListItem.
     *
     * @return The value stored in this ListItem.
     */
    public Object getValue() {
        return value;
    }

    /**
     * Set the value to be stored in this ListItem.
     *
     * @param value The new value to be stored.
     */
    public void setValue(Object value) {
        this.value = value;
    }
}
