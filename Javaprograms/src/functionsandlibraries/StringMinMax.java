/**purpose: To find minimum and maximum strings from string array
 * author: Shalini
 * date: 29/11/2018
 * version: 1.0
 */
package functionsandlibraries;
import utility.Utility;
import java.util.Scanner;

import standardlibrary.BLStdOut;
import standardlibrary.MathFunction;
public class StringMinMax {
public static void main(String[] args)
{
	int limit;
	Scanner sc = new Scanner(System.in);
    BLStdOut.println("Enter the size of array of strings: ");
    limit = Utility.inputInteger();
    String[] strArray = new String[limit];
    BLStdOut.println("Enter the strings");
    for(int i=0; i<limit; i++)
    {
  	  strArray[i] = sc.nextLine();
    }
    MathFunction.minStrArray(strArray, limit);
    MathFunction.maxStrArray(strArray, limit);
    sc.close();
	int CARDS_PER_PLAYER = 5;

    // number of players
    int PLAYERS = Integer.parseInt(args[0]);

    String[] SUITS = {
        "Clubs", "Diamonds", "Hearts", "Spades"
    };

    String[] RANKS = {
        "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "Jack", "Queen", "King", "Ace"
    };

	int n = SUITS.length * RANKS.length;

    if (CARDS_PER_PLAYER * PLAYERS > n)
        throw new RuntimeException("Too many players");



    String[] deck = new String[n];
    for (int i = 0; i < RANKS.length; i++) {
        for (int j = 0; j < SUITS.length; j++) {
            deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
        }
    }


    for (int i = 0; i < n; i++) {
        int r = i + (int) (Math.random() * (n-i));
        String temp = deck[r];
        deck[r] = deck[i];
        deck[i] = temp;
    }

    
    for (int i = 0; i < PLAYERS * CARDS_PER_PLAYER; i++) {
        System.out.println(deck[i]);
        if (i % CARDS_PER_PLAYER == CARDS_PER_PLAYER - 1)
            System.out.println();
    }
}
}
