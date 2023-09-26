package exercises.abstraction;

import java.util.List;

/**
 * The Player class represents a character in a game that implements the ISaveable interface.
 * It provides methods to access and modify the player's attributes such as name, hit points, strength, and weapon.
 * The class also implements the methods required by the ISaveable interface to write and read player data.
 */
public class Player implements ISaveable {
    private String name, weapon;
    private int hitPoints, strength;

    /**
     * Creates a new Player with the specified name, hit points, and strength. The default weapon is set to "Sword".
     *
     * @param name     The name of the player.
     * @param hitPoint The initial hit points of the player.
     * @param strength The initial strength of the player.
     */
    public Player(String name, int hitPoint, int strength) {
        this.name = name;
        this.hitPoints = hitPoint;
        this.strength = strength;
        weapon = "Sword";
    }

    /**
     * Gets the name of the player.
     *
     * @return The name of the player.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the weapon currently equipped by the player.
     *
     * @return The weapon of the player.
     */
    public String getWeapon() {
        return weapon;
    }

    /**
     * Gets the current hit points of the player.
     *
     * @return The hit points of the player.
     */
    public int getHitPoints() {
        return hitPoints;
    }

    /**
     * Gets the current strength of the player.
     *
     * @return The strength of the player.
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Sets the name of the player.
     *
     * @param name The new name for the player.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the weapon currently equipped by the player.
     *
     * @param weapon The new weapon for the player.
     */
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    /**
     * Sets the current hit points of the player.
     *
     * @param hitPoints The new hit points for the player.
     */
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    /**
     * Sets the current strength of the player.
     *
     * @param strength The new strength for the player.
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * Returns a string representation of the player object.
     *
     * @return A formatted string containing player attributes.
     */
    @Override
    public String toString() {
        return String.format("%s{name='%s', hitPoints=%d, strength=%d, weapon='%s'}", getClass().getSimpleName(), name,
                hitPoints, strength, weapon);
    }

    /**
     * Writes the player's data to a list of strings.
     *
     * @return A list of strings representing the player's data.
     */
    @Override
    public List<String> write() {
        return List.of(name, Integer.toString(hitPoints), Integer.toString(strength), weapon);
    }

    /**
     * Reads and updates the player's data from a list of strings.
     *
     * @param list A list of strings containing the player's data.
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
            weapon = list.get(3);
        } catch (IndexOutOfBoundsException ignored) {
        }
    }
}
