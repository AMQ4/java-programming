package exercises.oop.polymorphism;

/**
 * The `Bedroom` class represents a bedroom with various components, including walls, a ceiling, a bed, and a lamp.
 */
public class Bedroom {
    private String name;
    private Wall2 wall1, wall2, wall3, wall4;
    private Ceiling ceiling;

    private Bed bed;
    private Lamp lamp;

    /**
     * Constructs a new `Bedroom` object with the specified components.
     *
     * @param name    The name of the bedroom.
     * @param wall1   The first wall of the bedroom.
     * @param wall2   The second wall of the bedroom.
     * @param wall3   The third wall of the bedroom.
     * @param wall4   The fourth wall of the bedroom.
     * @param ceiling The ceiling of the bedroom.
     * @param bed     The bed in the bedroom.
     * @param lamp    The lamp in the bedroom.
     */
    public Bedroom(String name, Wall2 wall1, Wall2 wall2, Wall2 wall3, Wall2 wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    /**
     * Gets the lamp in the bedroom.
     *
     * @return The lamp in the bedroom.
     */
    public Lamp getLamp() {
        return lamp;
    }

    /**
     * Makes the bed in the bedroom and prints a message.
     */
    public void makeBed() {
        System.out.print("Bedroom -> Making bed | ");
        bed.make();
    }
}

