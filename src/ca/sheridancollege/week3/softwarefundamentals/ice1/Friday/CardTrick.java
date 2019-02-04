
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *991530024
 * @author Jiahao Chen
 */
public class CardTrick {
    public static void main(String[] args)
    {
       //object of card class
        Card cardObj = new Card();
        
        //setting suit and value
        cardObj.setSuit("Hearts");
        cardObj.setValue(1);
        
        //printing suit and value
        System.out.println(cardObj.getSuit());
        System.out.println(cardObj.getValue());
        //add
        
    }
    
}
