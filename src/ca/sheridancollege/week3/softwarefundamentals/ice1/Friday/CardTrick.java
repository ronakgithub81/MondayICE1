
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Aaron Tran 
 * 991525227
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card card1 = new Card();
       Card card2 = new Card();
       card1.setSuit(Card.SUITS[0]);
       card1.setValue(2);
       System.out.println("Suit: " + card1.getSuit());
       System.out.println("Value: " + card1.getValue());
    }
    
}
