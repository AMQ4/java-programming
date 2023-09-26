package exercises.abstraction;

import java.util.List;

/**
 * The Monster class represents a creature in a game that implements the ISaveable interface.
 * It provides methods to access and modify the monster's attributes such as name, hit points, and strength.
 * The class also implements the methods required by the ISaveable interface to write and read monster data.
 */
public class Monster implements ISaveable {
    private String name;
    private int hitPoints, strength;

    /**
     * Creates a new Monster with the specified name, hit points, and strength.
     *
     * @param name      The name of the monster.
     * @param hitPoints The initial hit points of the monster.
     * @param strength  The initial strength of the monster.
     */
    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    /**
     * Gets the name of the monster.
     *
     * @return The name of the monster.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the current hit points of the monster.
     *
     * @return The hit points of the monster.
     */
    public int getHitPoints() {
        return hitPoints;
    }

    /**
     * Gets the current strength of the monster.
     *
     * @return The strength of the monster.
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Returns a string representation of the monster object.
     *
     * @return A formatted string containing monster attributes.
     */
    @Override
    public String toString() {
        return String.format("%s{name='%s', hitPoints=%d, strength=%d}", getClass().getSimpleName(), name,
                hitPoints, strength);
    }

    /**
     * Writes the monster's data to a list of strings.
     *
     * @return A list of strings representing the monster's data.
     */
    @Override
    public List<String> write() {
        return List.of(name, Integer.toString(hitPoints), Integer.toString(strength));
    }

    /**
     * Reads and updates the monster's data from a list of strings.
     *
     * @param list A list of strings containing the monster's data.
     */
    @Override
    public void read(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            name = list.get(0);
            hitPoints = Integer.parseInt(list.get(1));
            strength = Integer.parseInt(list.get(2));
        } catch (IndexOutOfBoundsException ignored) {
        }
    }
}
