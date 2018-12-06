/*purpose: To calculate the win or loss of the player by performing operations on user input
 * stake, trials and target
 * author: Shalini
 * date: 27/11/2018
 * version: 1.0
 */
package functionalprograms;

import utility.Utility;

public class PlayAGame {
public static void main(String[] args)
{
	int stake, target, trials;
	System.out.println("Enter the money the user have");
	stake= Utility.inputInteger();
	System.out.println("Enter the target player wants to achieve");
	target = Utility.inputInteger();
	System.out.println("Enter the number of trials user wish");
	trials = Utility.inputInteger();
	
	Utility.gambler(stake, trials, target);
}
}
