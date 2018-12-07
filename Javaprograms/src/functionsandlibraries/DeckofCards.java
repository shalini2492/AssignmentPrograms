/**purpose: To deal randomly 9 cards among 4 players and display them.
 * author: Shalini
 * date: 6/12/2018
 * version: 1.0
 */
package functionsandlibraries;

import standardlibrary.BLRandom;
import standardlibrary.BLStdOut;

public class DeckofCards {
	
public static void main(String[] args)
{
	
	String[] SUITS = {
	        "Clubs", "Diamonds", "Hearts", "Spades"
	    };

	    String[] RANKS = {
	        "2", "3", "4", "5", "6", "7", "8", "9", "10",
	        "Jack", "Queen", "King", "Ace"
	    };

	    // initialize deck
	    int n = SUITS.length * RANKS.length;
	    String[] deck = new String[n];
	    for (int i = 0; i < RANKS.length; i++) {
	        for (int j = 0; j < SUITS.length; j++) {
	            deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
	        }
	    }

	    // shuffle
	    for (int i = 0; i < n; i++) {
	        int r = i + (int) (Math.random() * (n-i));
	        String temp = deck[r];
	        deck[r] = deck[i];
	        deck[i] = temp;
	    }
	  // print shuffled deck
	    for (int i = 0; i < 4; i++) {
	        for (int j = 0; j < 5; j++)
	        System.out.println(deck[i]);
	    }

	
	
	
	
	
	
	
	
	
	
	
	
	/*String deckofCards[]= {"2","3","4","5","6","7","8","9","10"};
	String[] suits= {"Clubs", "Diamonds", "Spades", "Hearts"};
	int a = suits.length * deckofCards.length;
	String[] deck = new String[a];
	for(int i=0; i<deckofCards.length; i++)
	{
		for(int j=0; j<suits.length; j++)
		{
		      deckofCards[suits.length * i + j] = deckofCards[i] + " of " + suits[j];
		}
	}
	//shuffle deck
	for(int i=0; i<a; i++)
	{
		int card = i + (int) (Math.random()*(a-i));
		String temp = deck[card];
		deck[card] = deck[i];
		deck[i] = temp;
	}
	//print shuffled deck dealt among 4 players..
	for(int i=0; i<4; i++)
	{
		BLStdOut.print("** Person " + (i+1) + "**");
	
	for(int j=0; j<5; j++)
	{
		BLStdOut.print(deck[i + j * 4]+ "(Card " + i + j * 4 + ")");
	}
	}*/
	
	/*
	BLRandom.shuffle(deckofCards);
	for(int i=0; i<9; i++)
	{
	BLStdOut.print("deckofCards: " +deckofCards[i]+"\n");
	}
	*/
	

	
}
}
