package ca.sheridancollege.week2.softwarefundamentals;

/**
 *
 * @author Ali Hassan
 */
public class Card {
    private String suit;
    private int value;
    
    public Card (String s, int v){
        this.suit = s;
        this.value = v;
        if (s.equals("Hearts") || s.equals("Diamonds") || s.equals("Clubs") || s.equals("Spades")) {
            System.out.println("The suit is valid.");
        } else {
            System.out.println("The suit is invalid. It must be Diamonds, Hearts, Club, or Spades");
        }
        if (value >= 1 && value <= 13) {
            System.out.println("The value is valid.");
        } else {
            System.out.println("The value is invalid. It must be creater than 0 and less than 14.");
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
