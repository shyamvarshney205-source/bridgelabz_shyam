import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Card {
    private String suit;
    private String rank;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

public class que10 {
    private List<Card> deck;

    public que10() {
        deck = new ArrayList<>();
        initializeDeck();
    }

    private void initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
        };

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public List<List<Card>> distribute(int cardsPerPlayer, int players) {
        List<List<Card>> playersCards = new ArrayList<>();

        if (cardsPerPlayer * players > deck.size()) {
            throw new IllegalArgumentException("Not enough cards to distribute");
        }

        // Initialize players' hands
        for (int i = 0; i < players; i++) {
            playersCards.add(new ArrayList<>());
        }

        // Distribute cards
        for (int cardNum = 0; cardNum < cardsPerPlayer; cardNum++) {
            for (int playerNum = 0; playerNum < players; playerNum++) {
                playersCards.get(playerNum).add(deck.remove(0));
            }
        }

        return playersCards;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeckOfCards deck = new DeckOfCards();

        System.out.print("Enter number of players: ");
        int players = scanner.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = scanner.nextInt();

        int totalCardsNeeded = players * cardsPerPlayer;
        if (totalCardsNeeded > 52) {
            System.out.println("Error: Not enough cards in the deck to distribute.");
            scanner.close();
            return;
        }

        deck.shuffle();

        List<List<Card>> playersCards = deck.distribute(cardsPerPlayer, players);

        for (int i = 0; i < playersCards.size(); i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (Card card : playersCards.get(i)) {
                System.out.println("  " + card);
            }
            System.out.println();
        }

        scanner.close();
    }
}
