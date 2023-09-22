package exercises.abstraction;

/**
 * An implementation of the NodeList interface representing a binary search tree.
 * The tree has a reference to its root item.
 */
public class SearchTree implements NodeList {

    private ListItem root;

    /**
     * Constructs a new SearchTree with the specified root item.
     *
     * @param root The root ListItem of the binary search tree.
     */
    public SearchTree(ListItem root) {
        this.root = root;
    }

    /**
     * Get the root ListItem of the binary search tree.
     *
     * @return The root ListItem of the binary search tree.
     */
    @Override
    public ListItem getRoot() {
        return root;
    }

    /**
     * Add a new ListItem to the binary search tree while maintaining proper order.
     *
     * @param listItem The ListItem to be added.
     * @return true if the item is successfully added, false otherwise.
     */
    @Override
    public boolean addItem(ListItem listItem) {
        if (root == null) {
            root = listItem;
            return true;
        }

        ListItem head = root, parent = null;

        while (head != null) {
            parent = head;
            int comparison = listItem.compareTo(head);

            if (comparison < 0) {
                head = head.previous();
            } else if (comparison > 0) {
                head = head.next();
            } else {
                return false;
            }
        }

        if (parent.compareTo(listItem) < 0) {
            parent.setNext(listItem);
            return true;
        } else if (parent.compareTo(listItem) > 0) {
            parent.setPrevious(listItem);
            return true;
        }

        return false;
    }

    /**
     * Remove a ListItem from the binary search tree.
     *
     * @param listItem The ListItem to be removed.
     * @return true if the item is successfully removed, false otherwise.
     */
    @Override
    public boolean removeItem(ListItem listItem) {
        if (listItem == null) {
            return false;
        }

        ListItem head = root, parent = root;
        while (head != null) {
            int comparison = listItem.compareTo(head);

            if (comparison < 0) {
                parent = head;
                head = head.previous();
            } else if (comparison > 0) {
                parent = head;
                head = head.next();
            } else {
                performRemoval(head, parent);
                return true;
            }
        }
        return false;
    }

    /**
     * Traverse and print the elements of the binary search tree in-order starting from the provided root.
     *
     * @param root The starting point of the traversal.
     */
    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
            return;
        }

        if (root.previous() != null) {
            traverse(root.previous());
        }

        System.out.println(root.getValue());

        if (root.next() != null) {
            traverse(root.next());
        }
    }

    /**
     * Helper method to perform the removal of a ListItem from the binary search tree.
     *
     * @param itemToBeRemoved The ListItem to be removed.
     * @param parent The parent of the itemToBeRemoved.
     */
    private void performRemoval(ListItem itemToBeRemoved, ListItem parent) {
        if (parent.compareTo(itemToBeRemoved) < 0) {
            if (itemToBeRemoved.next() != null) {
                ListItem successor = itemToBeRemoved.next();
                while (successor.previous() != null) {
                    successor = successor.previous();
                }
                successor.setPrevious(itemToBeRemoved.previous());
                parent.setNext(itemToBeRemoved.next());
            } else {
                parent.setNext(itemToBeRemoved.previous());
            }
        } else if (parent.compareTo(itemToBeRemoved) > 0) {
            if (itemToBeRemoved.next() != null) {
                ListItem successor = itemToBeRemoved.next();
                while (successor.previous() != null) {
                    successor = successor.previous();
                }
                successor.setPrevious(itemToBeRemoved.previous());
                parent.setPrevious(itemToBeRemoved.next());
            } else {
                parent.setPrevious(itemToBeRemoved.previous());
            }
        } else {
            if (parent.next() != null) {
                ListItem successor = itemToBeRemoved.next();
                while (successor.previous() != null) {
                    successor = successor.previous();
                }
                successor.setPrevious(parent.previous());
                root = parent.next();
            } else {
                root = parent.previous();
            }
        }
    }
}
