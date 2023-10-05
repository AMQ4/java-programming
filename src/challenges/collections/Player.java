package challenges.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Represents a player in a card game.
 */
public class Player {
    private String name;
    Queue<Card> cards;

    /**
     * Initializes a new player with the given name and an empty stack of cards.
     *
     * @param name The name of the player.
     */
    Player(String name) {
        this.name = name;
        cards = new LinkedList<>();
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
     * Adds a card to the player's stack of cards.
     *
     * @param card The card to be added.
     * @return True if the card was added successfully, false otherwise.
     */
    public boolean addCard(Card card) {
        return cards.add(card);
    }

    /**
     * Adds a list of cards to the player's stack of cards.
     *
     * @param cards The list of cards to be added.
     * @return True if the cards were added successfully, false otherwise.
     */
    public boolean addCard(List<Card> cards) {
        return this.cards.addAll(cards);
    }

    /**
     * Checks if the player has any cards.
     *
     * @return True if the player has cards, false otherwise.
     */
    public boolean hasCards() {
        return !cards.isEmpty();
    }

    /**
     * Gets the number of remaining cards in the player's stack.
     *
     * @return The number of remaining cards.
     */
    public int remainCards() {
        return cards.size();
    }

    /**
     * Reveals and removes the top card from the player's stack of cards.
     *
     * @return The top card, or null if the player's stack is empty.
     */
    public Card revealTopCard() {
        if (cards.isEmpty()) {
            System.out.println("Can't reveal top card from an empty stack of cards.");
            return null;
        }
        return cards.poll();
    }

    /**
     * Returns a string representation of the player's name and the number of cards they have.
     *
     * @return A string in the format "PlayerName Cards: [cards] Total Cards: [totalCards]".
     */
    @Override
    public String toString() {
        return name + " Cards: " + cards + "\nTotal Cards: " + cards.size();
    }
}
