/*purpose: To calculate the win or loss of the player by performing operations on user input
 * stake, trials and target
 * author: Shalini
 * date: 27/11/2018
 * version: 1.0
 */
package functionsandlibraries;

import utility.Utility;
import standardlibrary.BLStdOut;
public class PlayAGame {
public static void main(String[] args)
{
	int stake, target, trials;
	int times, won=0, lost=0;
	
	BLStdOut.print("\nEnter how many times you would like to play this game..!");
	times=Utility.inputInteger();
	
	BLStdOut.print("Enter the money the user have");
	stake= Utility.inputInteger();
	BLStdOut.print("Enter the target player wants to achieve");
	target = Utility.inputInteger();
	BLStdOut.println("Enter the number of trials user wish");
	trials = Utility.inputInteger();
	
	Utility.gambling(stake, trials, target, times);
	

	
	
}
}
