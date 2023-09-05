package exercises.oop.inheritance;

/**
 * The `Ceiling` class represents a ceiling with a specified height and painted color.
 */
public class Ceiling {
    private int height, paintedColor;

    /**
     * Constructs a new `Ceiling` object with the specified height and painted color.
     *
     * @param height       The height of the ceiling.
     * @param paintedColor The color with which the ceiling is painted.
     */
    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    /**
     * Gets the height of the ceiling.
     *
     * @return The height of the ceiling.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Gets the painted color of the ceiling.
     *
     * @return The painted color of the ceiling.
     */
    public int getPaintedColor() {
        return paintedColor;
    }
}
