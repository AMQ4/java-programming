package exercises.abstraction;

import java.util.List;

/**
 * The ISaveable interface represents objects that can be saved to and loaded from a list of strings.
 * Implementing classes should provide methods to write their state to a list of strings and read their
 * state from a list of strings.
 */
public interface ISaveable {
    /**
     * Writes the state of the object to a list of strings.
     *
     * @return A list of strings representing the object's state.
     */
    List<String> write();

    /**
     * Reads the state of the object from a list of strings and updates its state accordingly.
     *
     * @param list A list of strings containing the object's state information.
     */
    void read(List<String> list);
}
