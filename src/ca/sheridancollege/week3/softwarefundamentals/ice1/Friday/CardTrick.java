
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Ronak
 * @modifier GuoXing Zheng 991472414
 */
public class CardTrick {
    public static void main(String[] args)
    {
           Card obj = new Card();//create Card obj
        
        obj.setSuit("hello");
        obj.setValue(1);
        
        System.out.println(obj.getSuit());
        System.out.println(obj.getValue());
        
        Card obj2 = new Card();
        
           
    }
    
}
