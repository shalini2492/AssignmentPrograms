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
	
	Utility.gambling(stake, trials, target);
}
}
