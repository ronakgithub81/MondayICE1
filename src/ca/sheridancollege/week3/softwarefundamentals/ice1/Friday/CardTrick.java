
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Ronak , Graham
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card card = new Card(); // object created
       card.setSuit("Hearts");
       card.setValue(7);
        
       System.out.println("Card: " + card.getSuit() + " Value: " + card.getValue);
    }
    
}
