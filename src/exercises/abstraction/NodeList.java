package exercises.abstraction;

/**
 * An interface representing a generic list structure.
 * Implementations of this interface are expected to provide methods for managing a list of ListItems.
 */
public interface NodeList {

    /**
     * Get the root ListItem of the list.
     *
     * @return The root ListItem of the list.
     */
    abstract ListItem getRoot();

    /**
     * Add a new ListItem to the list.
     *
     * @param listItem The ListItem to be added.
     * @return true if the item is successfully added, false otherwise.
     */
    abstract public boolean addItem(ListItem listItem);

    /**
     * Remove a ListItem from the list.
     *
     * @param listItem The ListItem to be removed.
     * @return true if the item is successfully removed, false otherwise.
     */
    public boolean removeItem(ListItem listItem);

    /**
     * Traverse and process the elements of the list starting from the provided root.
     *
     * @param root The starting point of the traversal.
     */
    abstract void traverse(ListItem root);
}
