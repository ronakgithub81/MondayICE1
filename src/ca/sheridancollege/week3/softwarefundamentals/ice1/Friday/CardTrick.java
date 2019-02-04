
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
    }
}
