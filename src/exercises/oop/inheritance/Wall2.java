package exercises.oop.inheritance;

/**
 * The `Wall2` class represents a wall with a specified direction.
 */
public class Wall2 {
    private String direction;

    /**
     * Constructs a new `Wall2` object with the specified direction.
     *
     * @param direction The direction in which the wall is facing or located.
     */
    public Wall2(String direction) {
        this.direction = direction;
    }

    /**
     * Gets the direction of the wall.
     *
     * @return The direction of the wall.
     */
    public String getDirection() {
        return direction;
    }
}
