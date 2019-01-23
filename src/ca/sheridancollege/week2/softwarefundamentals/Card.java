package ca.sheridancollege.week2.softwarefundamentals;

/**
 *
 * @author Ali Hassan
 */
public class Card {
    private String suit;
    private int value;
    
    public Card (String s, int v){
        suit = s;
        value = v;
        if (s.equals("Hearts") || s.equals("Diamonds") || s.equals("Clubs") || s.equals("Spades")) {
            System.out.println("The suit is valid.");
        } else {
            System.out.println("The suit is invalid");
        }
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
    
}
