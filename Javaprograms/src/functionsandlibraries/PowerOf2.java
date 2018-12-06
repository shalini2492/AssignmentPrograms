package functionsandlibraries;

import standardlibrary.BLStdOut;
import utility.Utility;

public class PowerOf2 {
public static void main(String[] args)
{
	int power, base=2;
    power=Integer.parseInt(args[0]);
	if(power<0)
	{
		BLStdOut.print("Invalid input..please enter a valid number");
		power=Utility.inputInteger();
	}
}
}
