package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Sina Maleki-Kheymehsari
 * Student #: 991512857
 */
public class CardTrick {
    public static void main(String[] args)
    {
        Card myCard = new Card();
        for (int i = 0; i < myCard.SUITS.length; i++) {
            System.out.print(myCard.SUITS[i] + " ");
        }
        myCard.setSuit("Spades");
        myCard.setValue((int)(Math.random()*(13 - 1)+1));
        System.out.print("\nPick a card: "+myCard.getSuit()); //Printing card Suit
        System.out.print("\nCard value: "+myCard.getValue()); //Printing card Value
        
        Card lastObj = new Card(); //new obj for question 7
    }
    
}
