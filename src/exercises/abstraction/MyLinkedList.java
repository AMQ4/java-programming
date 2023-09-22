package exercises.abstraction;

/**
 * An implementation of the NodeList interface representing a linked list.
 * The list has a reference to its root item.
 */
public class MyLinkedList implements NodeList {
    private ListItem root;

    /**
     * Constructs a new MyLinkedList with the specified root item.
     *
     * @param root The root ListItem of the linked list.
     */
    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    /**
     * Get the root ListItem of the linked list.
     *
     * @return The root ListItem of the linked list.
     */
    @Override
    public ListItem getRoot() {
        return root;
    }

    /**
     * Add a new ListItem to the linked list while maintaining proper order.
     *
     * @param newItem The ListItem to be added.
     * @return true if the item is successfully added, false otherwise.
     */
    @Override
    public boolean addItem(ListItem newItem) {
        if (root == null) {
            // If the head of the tree is null, make the head refer to the new item.
            root = newItem;
            return true;
        }

        ListItem currentItem = root;

        while (currentItem != null) {
            int comparison = newItem.compareTo(currentItem);

            if (comparison < 0) {
                // If the item to be added is less than the current item, insert it before the current item.
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                }
                newItem.setNext(currentItem);
                currentItem.setPrevious(newItem);

                if (currentItem == root) {
                    // If the current item is the root, update the root reference.
                    root = newItem;
                }

                return true;
            } else if (comparison > 0) {
                // If the item to be added is greater than the current item, move to the next item.
                if (currentItem.next() == null) {
                    // If there is no next item, add the new item at the end.
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
                currentItem = currentItem.next();
            } else {
                // Items are considered equal, so don't allow duplicates (modify behavior as needed).
                return false;
            }
        }

        return false; // Default return value if something unexpected happens.
    }

    /**
     * Remove a ListItem from the linked list.
     *
     * @param listItem The ListItem to be removed.
     * @return true if the item is successfully removed, false otherwise.
     */
    @Override
    public boolean removeItem(ListItem listItem) {
        ListItem tar = root;

        if (tar == null || listItem == null) {
            return false;
        }

        if (tar.compareTo(listItem) == 0) {
            root = root.next();
            return true;
        }

        while (tar != null && listItem.compareTo(tar) > 0) {
            tar = tar.next();
        }

        if (tar == null) {
            return false;
        }

        if (tar.compareTo(listItem) == 0) {
            if (tar.previous() != null) {
                tar.previous().setNext(tar.next());
            }
            if (tar.next() != null) {
                tar.next().setPrevious(tar.previous());
            }
            return true;
        }
        return false;
    }

    /**
     * Traverse and print the elements of the linked list starting from the provided root.
     *
     * @param root The starting point of the traversal.
     */
    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
            return;
        }
        ListItem head = root;
        while (head != null) {
            System.out.println(head.getValue());
            head = head.next();
        }
    }
}
