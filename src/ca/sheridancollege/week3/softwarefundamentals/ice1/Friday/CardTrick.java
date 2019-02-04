
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Daniel Morrison
 * student num 991516745
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card card=new Card();
       card.setValue(3);
       card.setSuit(card.SUITS[2]);
        System.out.println(card.getValue()+" of "+ card.getSuit());
    }
    
}
