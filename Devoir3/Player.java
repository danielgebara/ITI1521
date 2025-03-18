package Devoir3;

/**
 *The Player class should be able to represent the set of cards a player has in hand.
 * The player class must allow to take a card from the deck and put it in the hand, 
 * count the points of the cards in hand...
 **/
import java.util.ArrayList;

public class Player {
     private ArrayList<Card>  hand;   // The cards in the plyaer's hand.
 
     /*Constructor*/
 Player(){
       hand = new ArrayList<Card>(); // creates a new array list of cards
    }  
 
 /*Accessor*/
 public ArrayList<Card> getHand() {
        return hand; // returns the hand of the player
    }
 
 /**
     * Remove all cards from the hand, leaving it empty.
  */
    public void clear() {
       hand.clear(); // clears the hand of the player
    }

    /**
     * Add a card to the hand.  It is added at the end of the current hand.
     * @param card the non-null card to be added.
     * @throws NullPointerException if the parameter card is null.
     */
    public void add(Card card) {
        if(card == null) { // checks if the card is null
            throw new NullPointerException("Can't add a null card to a hand."); // throws an exception if the card is null
        }
        hand.add(card); // adds the card to the hand
    }

    /**
     * Remove a card from the hand, if present.
     * @param card the card to be removed.  If card is null or if the card is not in 
     * the hand, then nothing is done.
     */
    public void remove(Card card) {
        if(card != null) { // checks if the card is not null
            hand.remove(card); // removes the card from the hand
        }
    }

    /**
     * Remove the card in a specified position from the hand.
     * @param position the position of the card that is to be removed, where
     * positions are numbered starting from zero.
     * @throws IllegalArgumentException if the position does not exist in
     * the hand, that is if the position is less than 0 or greater than
     * or equal to the number of cards in the hand.
     */
    public void remove(int position) {
        if(position < 0 || position >= hand.size()) { // checks if the position is valid
            throw new IllegalArgumentException("Position does not exist in hand: " + position); // throws an exception if the position is not valid
        }
        hand.remove(position); // removes the card at the specified position
    }

    /**
     * Returns the number of cards in the hand.
     */
    public int totalCards() {
        return hand.size(); // returns the number of cards in the hand
    }

    /**
     * Gets the card in a specified position in the hand.  (Note that this card
     * is not removed from the hand!)
     * @param position the position of the card that is to be returned
     * @throws IllegalArgumentException if position does not exist in the hand
     */
    public Card getCard(int position) {
        if(position < 0 || position >= hand.size()) { // checks if the position is valid
            throw new IllegalArgumentException("Position does not exist in hand: " + position); // throws an exception if the position is not valid
        }
        return hand.get(position); // returns the card at the specified position
    }

   /**
     * Computes and returns the total value of this hand in the game
     */
    public int getHandTotal () {
        int total = 0;
        int aceCount = 0;
        for (Card c : hand) {
            int val = c.getValue();
            if (val >= 2 && val <= 9) {
                total += val;
            } else if (val == 10 || val == Card.JACK || val == Card.QUEEN || val == Card.KING) {
                total += 10;
            } else if (val == Card.ACE) {
                total += 1;
                aceCount++;
            }
        }
        // If there's at least one ace and adding 10 does not exceed 21, treat one ace as 11.
        if (aceCount > 0 && total + 10 <= 21) {
            total += 10;
        }
        return total;
    }  
    
    /**
     * Sorts the cards in the hand so that cards of the same color are
     * grouped together, and within a color the cards are sorted by value.
     * Note that aces are considered to have the lowest value, 1.
     */
    public void sortByColor() {
        hand.sort((c1, c2) -> {
            if (c1.getColor() != c2.getColor()) {
                return c1.getColor() - c2.getColor();
            } else {
                return c1.getValue() - c2.getValue();
            }
        });
    }

    /**
     * Sorts the cards in the hand so that cards of the same value are
     * grouped together.  Cards with the same value are sorted by color.
     * Note that aces are considered to have the lowest value, 1.
     */
    public void sortByValue() {
        hand.sort((c1, c2) -> {
            if (c1.getValue() != c2.getValue()) {
                return c1.getValue() - c2.getValue();
            } else {
                return c1.getColor() - c2.getColor();
            }
        });
    }
} 
