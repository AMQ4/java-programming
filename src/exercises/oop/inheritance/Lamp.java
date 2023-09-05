package exercises.oop.inheritance;

/**
 * The `Lamp` class represents a lamp with a specified style, battery availability, and globe rating.
 */
public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    /**
     * Constructs a new `Lamp` object with the specified style, battery availability, and globe rating.
     *
     * @param style      The style of the lamp.
     * @param battery    Indicates whether the lamp has a battery.
     * @param globRating The rating of the lamp's globe.
     */
    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    /**
     * Turns on the lamp if it has a battery.
     */
    public void turnOn() {
        if (battery) {
            System.out.println("Lamp -> Turning on");
        }
    }

    /**
     * Gets the style of the lamp.
     *
     * @return The style of the lamp.
     */
    public String getStyle() {
        return style;
    }

    /**
     * Gets the globe rating of the lamp.
     *
     * @return The globe rating of the lamp.
     */
    public int getGlobRating() {
        return globRating;
    }

    /**
     * Checks if the lamp has a battery.
     *
     * @return `true` if the lamp has a battery, `false` otherwise.
     */
    public boolean isBattery() {
        return battery;
    }
}
