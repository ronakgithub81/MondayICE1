
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;


/**
 *
 * @author Ronak
 */
public class CardTrick {
    public static void main(String[] args)
    {
       
        Card OwenBarrington = new Card();
        //Student number is 991393649
        
        OwenBarrington.setSuit("Spades");
        OwenBarrington.setValue(9);
        
        System.out.println("your card is: " + OwenBarrington);
        
        Card newCard = new Card();
        
        newCard.setValue(7);
        newCard.setSuit("Clubs");

        
    }
      
}
