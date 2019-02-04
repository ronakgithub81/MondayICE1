
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
       
       Card card2 = new Card(); // object created
       card.setSuit("Diamonds");
       card.setValue(8);
       
       
        
       System.out.println("Card: " + card.getSuit() + " Value: " + card.getValue());
    }
    
}
