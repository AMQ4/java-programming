package exercises.abstraction;

/**
 * A concrete implementation of the abstract ListItem class representing a node in a linked list.
 * Each Node has a reference to the next and previous nodes, as well as a value.
 */
public class Node extends ListItem {

    /**
     * Constructs a new Node with the specified object value.
     *
     * @param obj The object value to be stored in this Node.
     */
    public Node(Object obj) {
        super(obj);
    }

    /**
     * Get the next ListItem (Node) in the list.
     *
     * @return The next ListItem in the list, or null if there is no next item.
     */
    @Override
    ListItem next() {
        return rightLink;
    }

    /**
     * Set the next ListItem (Node) in the list.
     *
     * @param rightLink The ListItem (Node) to be set as the next item.
     * @return The updated ListItem with the new next reference.
     */
    @Override
    ListItem setNext(ListItem rightLink) {
        this.rightLink = rightLink;
        return this.rightLink;
    }

    /**
     * Get the previous ListItem (Node) in the list.
     *
     * @return The previous ListItem in the list, or null if there is no previous item.
     */
    @Override
    ListItem previous() {
        return leftLink;
    }

    /**
     * Set the previous ListItem (Node) in the list.
     *
     * @param leftLink The ListItem (Node) to be set as the previous item.
     * @return The updated ListItem with the new previous reference.
     */
    @Override
    ListItem setPrevious(ListItem leftLink) {
        this.leftLink = leftLink;
        return this.leftLink;
    }

    /**
     * Compare this Node's value with the value of another ListItem for ordering purposes.
     *
     * @param listItem The ListItem to compare with.
     * @return A negative integer if this Node's value is less than the other, zero if they are equal,
     *         or a positive integer if this Node's value is greater than the other.
     */
    @Override
    int compareTo(ListItem listItem) {
        if (value instanceof Comparable) {
            Comparable<Object> comparableValue = (Comparable<Object>) value;
            return comparableValue.compareTo(listItem.value);
        }
        return 1;
    }
}
