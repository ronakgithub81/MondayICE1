/*
Name: Jason Beattie
Number: 991 210 004
*/
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Ronak
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card newCard = new Card();
       Card newCard2 = new Card();
       
       newCard.setSuit("Spades");
       newCard.setValue(5);
       
       newCard.setSuit("Spades");
       newCard.setValue(10);
       
       System.out.println(newCard.getSuit());
       System.out.println(newCard.getValue());
       
       System.out.println(newCard2.getSuit());
       System.out.println(newCard2.getValue());
       
    }
    
}
