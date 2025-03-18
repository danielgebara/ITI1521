package Devoir3;

/**
 *  Deck represents a deck of playing cards and contains 52 regular cards.
 */
public class Deck {

    private Card[] deck;  // an array of 52 cards.  
    private int number;  //the number of cards that have been dealt from the deck

    /**
     * Constructs a regular 52-card poker deck.  Initially, the cards
     * are in a sorted order.  
     */
    public Deck() {
        deck = new Card[52]; // creates an array of 52 cards
        int index = 0; // initializes the index to 0
        for (int color = 0; color <= 3; color++) { // loops through the colors
            for (int value = 1; value <= 13; value++) { // loops through the values
                deck[index] = new Card(value, color); // creates a new card with the value and color
                index++; // increments the index
            }
        }
        number = 0; // initializes the number of cards dealt to 0
 }


    /**
     * Put all the used cards back into the deck (if any), and
     * shuffle the deck into a random order.
     */
    public void shuffle() {
        number = 0; // resets the number of cards dealt to 0
        for (int i = 51; i > 0; i--) { // loops through the deck
            int rand = (int)(Math.random()*(i+1)); // generates a random number
            Card temp = deck[i]; // stores the card at index i
            deck[i] = deck[rand]; // swaps the card at index i with the card at index rand
            deck[rand] = temp; // swaps the card at index rand with the card stored in temp
        }
    }

    /**
     * Returns the number of cards left in the deck.  
     */
    public int numberLeft() {
        return 52 - number; // returns the number of cards left in the deck
    }

    /**
     * Removes the next card from the deck and return it.  It is illegal
     * to call this method if there are no more cards in the deck.  You can
     * check the number of cards remaining by calling the numberLeft() function.
     * @return the card which is removed from the deck.
     * @throws IllegalStateException if there are no cards left in the deck
     */
    public Card take() {
        if (number == 52) { // checks if there are no cards left in the deck
            throw new IllegalStateException("No cards are left in the deck."); // throws an exception if there are no cards left in the deck
        }
        number++; // increments the number of cards dealt
        return deck[number - 1]; // returns the card that was dealt
    }
} // end class Deck
