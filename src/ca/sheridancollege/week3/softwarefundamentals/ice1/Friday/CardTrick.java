
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Mason Pelletier 991524171
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card card = new Card("Hearts", 4);
        
        System.out.println("The suit is " + card.getValue() + " and the value is " + card.getSuit());
    }
    
}
