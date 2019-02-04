
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Ronak
 */
//Student Name: Andrew Williams
//Student #:991526881
public class CardTrick {
    public static void main(String[] args)
    {
       Card C1 = new Card();
       C1.setSuit("Hearts");
       C1.setValue(8);
       System.out.println("The card was a " + C1.getValue() + " of " + C1.getSuit() + ".");
       
       Card C2 = new Card();
       C2.setSuit("Hearts");
       C2.setValue(4);
       System.out.println("The card was a " + C2.getValue() + " of " + C2.getSuit() + ".");
    }
}
