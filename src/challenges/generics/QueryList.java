/**
 * The `QueryList` class extends `ArrayList` and represents a generic list that can store objects of type `T` where
 * `T` must extend both the `Student` and `QueryItem` interfaces. This class provides methods for retrieving matches
 * based on specified fields and values.
 *
 * @param <T> The type of elements that this list can store, which must extend both `Student` and `QueryItem`.
 */
package challenges.generics;

import java.util.ArrayList;
import java.util.List;

public class QueryList<T extends Student & QueryItem> extends ArrayList<T> {

    /**
     * Creates a new `QueryList` instance initialized with the elements from the given list of students.
     *
     * @param students A list of students to initialize the `QueryList`.
     */
    QueryList(List<T> students) {
        super(students);
    }

    /**
     * Creates an empty `QueryList`.
     */
    QueryList() {
    }

    /**
     * Retrieves a list of items from the provided list that match the specified field and value.
     *
     * @param items The list of items to search for matches.
     * @param field The name of the field to match.
     * @param value The value to match.
     * @param <S>   The type of items in the list, which must extend both `Student` and `QueryItem`.
     * @return A list of items that match the specified field and value.
     */
    public static <S extends Student & QueryItem> List<S> getMatches(List<S> items, String field, String value) {
        List<S> matches = new ArrayList<>();
        for (var item : items) {
            if (item.matchFieldValue(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }

    /**
     * Retrieves a list of items in this `QueryList` that match the specified field and value.
     *
     * @param field The name of the field to match.
     * @param value The value to match.
     * @return A list of items in this `QueryList` that match the specified field and value.
     */
    public List<T> getMatches(String field, String value) {
        List<T> matches = new ArrayList<>();
        for (int i = 0; i < size(); ++i) {
            if (get(i).matchFieldValue(field, value)) {
                matches.add(get(i));
            }
        }
        return matches;
    }
}
