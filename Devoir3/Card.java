package Devoir3;

/**
 * Card class represents a playing card from a deck.  A card has a color and a value
 */

 public class Card {
  
    private final int color;   // Card's color
    private final int value;     //Card's value (1 - 13, with 1 representing ACE).

   /***
     * Codes for the colors and non-numeric cards. Cards 2 through 10 have their numerical values for their codes.
     * */
   
    public final static int CLUBS = 0;   
    public final static int DIAMONDS = 1;
    public final static int HEARTS = 2;
    public final static int SPADES = 3; 
  
    public final static int ACE = 1;     
    public final static int JACK = 11;    
    public final static int QUEEN = 12;   
    public final static int KING = 13;


    /**
     * Constrcutor, that creates a card with a specified color and value.
     * @throws IllegalArgumentException if the parameter values are not in the ranges
     */
    public Card(int value, int color) {
        if (value < 1 || value > 13 || color < 0 || color > 3) { // checks if the value and color are valid
            throw new IllegalArgumentException("Invalid card value or color."); // throws an exception if the values are not valid
        }
        this.value = value; // sets the value of the card
        this.color = color; // sets the color of the card
    }

    /**
     * Returns the color of this card.
     */
    public int getColor() {
        return this.color; // returns the color of the card
    }

    /**
     * Returns the value of this card.
     * @return the value, which is one of the numbers 1 through 13, inclusive for
     * a regular card.
     */
    public int getValue() {
       return this.value; // returns the value of the card
    }

    /**
     * Returns a String representation of the card's color.
     * @return one of the strings "Spades", "Hearts", "Diamonds", or "Clubs"
     */
    public String ColorToString() {
        switch (this.color) { // checks the color of the card
            case 0:
                return "Clubs";
            case 1:
                return "Diamonds";
            case 2:
                return "Hearts";
            case 3:
                return "Spades";
            default:
                return "Invalid color";
        }
    }

    /**
     * Returns a String representation of the card's value.
     * @return for a regular card, one of the strings "Ace", "2",
     * "3", ..., "10", "Jack", "Queen", or "King".  
     */
    public String ValueToString() {
        switch (this.value) { // checks the value of the card
            case 1:
                return "Ace";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "10";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return "Invalid value";
        }
   }

    /**
     * Returns a string representation of this card, including both
     * its color and its value.  Sample return values is: "Ace of Diamonds", 
     */
    public String toString() {
            return ValueToString() + " of " + ColorToString();
    }


} // end class Card

