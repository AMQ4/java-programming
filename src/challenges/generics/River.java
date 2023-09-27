package challenges.generics;

import java.util.List;

/**
 * Represents a river with a name and a collection of points that define its path.
 * The River class extends the Line class and provides specific functionality for rendering and displaying rivers.
 */
public class River extends Line {
    private String name;

    /**
     * Constructs a River object with the given name and no initial points.
     *
     * @param name The name of the river.
     */
    public River(String name) {
        super();
        this.name = name;
    }

    /**
     * Constructs a River object with the given name and a list of points that define its path.
     *
     * @param name   The name of the river.
     * @param points A list of points representing the path of the river.
     */
    public River(String name, List<Pair> points) {
        super(points);
        this.name = name;
    }

    /**
     * Returns a string representation of the river, including its name.
     *
     * @return A string representation of the river.
     */
    @Override
    public String toString() {
        return name + super.toString();
    }

    /**
     * Renders the river as a string, including its name and the list of points defining its path.
     *
     * @return A string representation of the river.
     */
    @Override
    public String render() {
        return name + " " + getClass().getSimpleName() + " as Line (" + super.toString() + ")";
    }

    /**
     * A sample main method to demonstrate the usage of the River class.
     *
     * @param args The command-line arguments (unused).
     */
    public static void main(String[] args) {
        River river = new River("Azraq");
        river.addPoint(new Pair(10.0, 11.3));
        river.addPoint(new Pair(10.0, 11.31));
        System.out.println(river.render());
    }
}
