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
	int deckofCards[]= {1,2,3,4,5,6,7,8,9};
	String[] deck= {"Clubs", "Diamonds", "Spades", "Hearts"};
	
	BLRandom.shuffle(deckofCards);
	for(int i=0; i<9; i++)
	{
	BLStdOut.print("deckofCards: " +deckofCards[i]+"\n");
	}
	
	

	
}
}
