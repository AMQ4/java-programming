package challenges.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WarCardGame {
    public static void main(String[] args) {
        // Create two players, Ahmad and Tim
        Player ahmad = new Player("Ahmad"), tim = new Player("Tim");

        // Create a standard deck of cards and shuffle it
        var deck = Card.getStandardDeck();
        Collections.shuffle(deck);

        // Distribute half of the shuffled deck to each player
        ahmad.addCard(deck.subList(0, deck.size() / 2));
        tim.addCard(deck.subList(deck.size() / 2, deck.size()));

        int roundNumber = 1;
        while (ahmad.hasCards() && tim.hasCards()) {
            // Each player reveals their top card
            Card ahmadsTopCard = ahmad.revealTopCard(), timsTopCard = tim.revealTopCard();

            if (ahmadsTopCard.compareTo(timsTopCard) > 0) {
                // Ahmad wins the round and takes both cards
                ahmad.addCard(List.of(ahmadsTopCard, timsTopCard));
            } else if (ahmadsTopCard.compareTo(timsTopCard) < 0) {
                // Tim wins the round and takes both cards
                tim.addCard(List.of(timsTopCard, ahmadsTopCard));
            } else {
                // It's a tie, so a "war" is triggered
                List<Card> pile = new ArrayList<>(List.of(ahmadsTopCard, timsTopCard));
                performWar(ahmad, tim, pile);
            }

            // Increment the round number
            roundNumber++;
        }

        // Print the final results
        System.out.println(ahmad);
        System.out.println(tim);
        System.out.printf("Round %d: %s wins%n", roundNumber, ahmad.hasCards() ? ahmad.getName() : tim.getName());
    }

    // Method to handle a "war" when the top cards are equal
    public static void performWar(Player player1, Player player2, List<Card> pile) {
        int cardsToDraw = 4;
        while (cardsToDraw != 0) {
            if (!player1.hasCards()) {
                player2.addCard(pile);
                return;
            } else if (!player2.hasCards()) {
                player1.addCard(pile);
                return;
            }
            pile.add(player1.revealTopCard());
            pile.add(player2.revealTopCard());
            cardsToDraw--;
        }

        if (pile.get(pile.size() - 1).compareTo(pile.get(pile.size() - 2)) == 0) {
            // Another tie, so another "war" is triggered
            performWar(player1, player2, pile);
        } else if (pile.get(pile.size() - 1).compareTo(pile.get(pile.size() - 2)) > 0) {
            // Player 1 wins the "war" and takes the pile
            player1.addCard(pile);
        } else {
            // Player 2 wins the "war" and takes the pile
            player2.addCard(pile);
        }
    }
}
