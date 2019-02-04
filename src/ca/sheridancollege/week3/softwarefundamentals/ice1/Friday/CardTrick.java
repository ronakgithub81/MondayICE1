
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 * 
 * @author Ronak
 * @modifier Fabrizio Violante, 991430666
 */
public class CardTrick {
    public static void main(String[] args) {
       Card violantf = new Card();
        violantf.setSuit("Hearts");
        violantf.setValue(7);
        
        System.out.println("Suit: " + violantf.getSuit() + "\nValue: " + violantf.getValue());
    }
    
}
