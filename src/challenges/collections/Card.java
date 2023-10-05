package challenges.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a playing card with a suit, face value, and rank.
 */
public record Card(Suit suit, String face, int rank) implements Comparable<Card> {

    /**
     * Enumeration representing the possible card suits: CLUB, DIAMOND, HEART, SPADE.
     */
    public enum Suit {
        CLUB, DIAMOND, HEART, SPADE;

        /**
         * Gets the Unicode character for the suit symbol.
         *
         * @return The Unicode character representing the suit symbol.
         */
        public char getImage() {
            return (new char[]{9827, 9830, 9829, 9824})[this.ordinal()];
        }
    }

    /**
     * Returns a string representation of the card.
     *
     * @return A string in the format "2♣(2)" representing the card.
     */
    @Override
    public String toString() {
        int index = face.equals("10") ? 2 : 1;
        String faceString = face.substring(0, index);
        return "%s%c(%d)".formatted(faceString, suit.getImage(), rank);
    }

    /**
     * Compares this card to another card based on their ranks.
     *
     * @param card The card to compare to.
     * @return An integer representing the comparison result.
     */
    @Override
    public int compareTo(Card card) {
        return this.rank - card.rank;
    }

    /**
     * Creates a numeric card with the specified suit and card number.
     *
     * @param suit       The suit of the card.
     * @param cardNumber The numeric value of the card (2-10).
     * @return A Card object representing the numeric card.
     */
    public static Card getNumericCard(Suit suit, int cardNumber) {
        if (cardNumber > 1 && cardNumber < 11) {
            return new Card(suit, String.valueOf(cardNumber), cardNumber - 2);
        }
        System.out.println("Invalid Numeric card selected");
        return null;
    }

    /**
     * Creates a face card (Jack, Queen, King, Ace) with the specified suit and abbreviation.
     *
     * @param suit    The suit of the card.
     * @param abbrev  The abbreviation of the face card ('J', 'Q', 'K', 'A').
     * @return A Card object representing the face card.
     */
    public static Card getFaceCard(Suit suit, char abbrev) {
        int charIndex = "JQKA".indexOf(abbrev);
        if (charIndex > -1) {
            return new Card(suit, "" + abbrev, charIndex + 9);
        }
        System.out.println("Invalid Face card selected");
        return null;
    }

    /**
     * Creates a standard deck of 52 cards.
     *
     * @return A list of Card objects representing a standard deck.
     */
    public static List<Card> getStandardDeck() {
        List<Card> deck = new ArrayList<>(52);
        for (Suit suit : Suit.values()) {
            for (int i = 2; i <= 10; i++) {
                deck.add(getNumericCard(suit, i));
            }
            for (char c : new char[]{'J', 'Q', 'K', 'A'}) {
                deck.add(getFaceCard(suit, c));
            }
        }
        return deck;
    }

    /**
     * Prints the given deck of cards.
     *
     * @param deck The list of Card objects to be printed.
     */
    public static void printDeck(List<Card> deck) {
        printDeck(deck, "Current Deck", 4);
    }

    /**
     * Prints the given deck of cards with a specified description and number of rows.
     *
     * @param deck        The list of Card objects to be printed.
     * @param description A description to be displayed before the deck.
     * @param rows        The number of rows in which the deck should be printed.
     */
    public static void printDeck(List<Card> deck, String description, int rows) {
        System.out.println("---------------------------");
        if (description != null) {
            System.out.println(description);
        }
        int cardsInRow = deck.size() / rows;
        for (int i = 0; i < rows; i++) {
            int startIndex = i * cardsInRow;
            int endIndex = startIndex + cardsInRow;
            deck.subList(startIndex, endIndex).forEach(c -> System.out.print(c + " "));
            System.out.println();
        }
    }
}
