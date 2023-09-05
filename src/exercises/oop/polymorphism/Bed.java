package exercises.oop.polymorphism;

/**
 * The `Bed` class represents a bed with various attributes such as style, pillows, height, sheets, and quilt.
 */
public class Bed {
    private String style;
    private int pillows, height, sheets, quilt;

    /**
     * Constructs a new `Bed` object with the specified attributes.
     *
     * @param style   The style of the bed.
     * @param pillows The number of pillows on the bed.
     * @param height  The height of the bed.
     * @param sheets  The number of sheets on the bed.
     * @param quilt   The quilt on the bed.
     */
    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    /**
     * Prints a message indicating that the bed is being made.
     */
    public void make() {
        System.out.print("Bed -> Making | ");
    }

    /**
     * Gets the number of pillows on the bed.
     *
     * @return The number of pillows.
     */
    public int getPillows() {
        return pillows;
    }

    /**
     * Gets the height of the bed.
     *
     * @return The height of the bed.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Gets the number of sheets on the bed.
     *
     * @return The number of sheets.
     */
    public int getSheets() {
        return sheets;
    }

    /**
     * Gets the quilt on the bed.
     *
     * @return The quilt on the bed.
     */
    public int getQuilt() {
        return quilt;
    }

    /**
     * Gets the style of the bed.
     *
     * @return The style of the bed.
     */
    public String getStyle() {
        return style;
    }
}
