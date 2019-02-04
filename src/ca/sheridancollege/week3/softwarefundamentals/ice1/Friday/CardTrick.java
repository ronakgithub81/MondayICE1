
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *991530024
 * @author Jiahao Chen
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card c = new Card();
       Card c2 = new Card();
        
        c.setSuit("heart");
        c.setValue(1);
        
        System.out.println(c.getSuit());
        System.out.println(c.getValue());
        
    }
    
}
