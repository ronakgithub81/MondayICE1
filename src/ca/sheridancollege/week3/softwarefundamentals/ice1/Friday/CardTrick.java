
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @Aziz Omar
 */
public class CardTrick {
    public static void   main(String[] args)
    {
       Card card = new Card();
            card.setSuit("Hearts");
                card.setValue(3);
        System.out.println(card.getValue());
         System.out.println(card.getSuit());

    }
    
}
