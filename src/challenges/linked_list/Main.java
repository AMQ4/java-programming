package challenges.linked_list;

import java.util.*;

/**
 * This class represents a simple program for managing a linked list of places.
 */
public class Main {

    /**
     * The main method where the program execution starts.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Initialize a linked list of places
        LinkedList<Place> itinerary = new LinkedList<>(List.of(
                new Place("Sydney", 0),
                new Place("Adelaide", 1374),
                new Place("Alice Springs", 917),
                new Place("Brisbane", 3972),
                new Place("Darwin", 877),
                new Place("Perth", 3932)
        )
        );

        // Sort the itinerary by natural order (distance from Sydney)
        itinerary.sort(Comparator.naturalOrder());

        // Create a list iterator starting from the second place
        ListIterator<Place> placeListIterator = itinerary.listIterator(1);

        // Initialize a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Define the menu options
        String menu = """
                Available actions (select word or letter):

                (A)dd
                (F)orward
                (B)ackward
                (L)ist places
                (M)enu
                (Q)uit
                """;

        System.out.println(menu);
        char response;

        System.out.print("> ");
        while ((response = scanner.nextLine().toLowerCase().charAt(0)) != 'q') {
            switch (response) {
                case 'a':
                    add(itinerary);
                    break;
                case 'f':
                    if (placeListIterator.hasNext()) {
                        System.out.println(placeListIterator.next());
                    }
                    break;
                case 'b':
                    if (placeListIterator.hasPrevious()) {
                        System.out.println(placeListIterator.previous());
                    }
                    break;
                case 'l':
                    System.out.println(itinerary);
                    break;
                case 'm':
                    System.out.println(menu);
                    break;

                default:
                    System.out.println("Invalid option, menu list: ");
                    System.out.println(menu);
            }
            System.out.print("> ");
        }
    }

    /**
     * Adds a new place to the list of places in a sorted manner.
     *
     * @param places The linked list of places.
     */
    private static void add(LinkedList<Place> places) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the town: ");
        String town = scanner.nextLine();

        System.out.println("Enter the distance from Sydney: ");
        double distanceFromSydney = Double.parseDouble(scanner.nextLine());

        Place place = new Place(town, distanceFromSydney);

        if (!places.contains(place) && place.distanceFromSydney() > 0) {
            for (ListIterator<Place> listIterator = places.listIterator(); listIterator.hasNext(); ) {

                if (listIterator.next().distanceFromSydney() > place.distanceFromSydney()) {
                    listIterator.previous();
                    listIterator.add(place);
                    return;
                }
            }
        }
        places.addLast(place);
    }
}

/**
 * Represents a place with a town name and its distance from Sydney.
 */
record Place(String town, double distanceFromSydney) implements Comparable<Place> {

    /**
     * Checks if this place is equal to another object.
     *
     * @param obj The object to compare to.
     * @return True if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !obj.getClass().getSimpleName().equals(this.getClass().getSimpleName())) {
            return false;
        }

        return town.equalsIgnoreCase(((Place) obj).town);
    }

    /**
     * Generates a string representation of this place.
     *
     * @return A string representation of the place.
     */
    @Override
    public String toString() {
        return town + " " + distanceFromSydney;
    }

    /**
     * Compares this place to another place based on their distances from Sydney.
     *
     * @param o The other place to compare to.
     * @return A negative value if this place is less than the other, 0 if they are equal, and a positive value if this place is greater than the other.
     */
    @Override
    public int compareTo(Place o) {
        if (o != null) {
            return Double.compare(distanceFromSydney, o.distanceFromSydney);
        }
        return 0;
    }
}
