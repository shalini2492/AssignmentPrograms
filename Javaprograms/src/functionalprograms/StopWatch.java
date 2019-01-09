/* To calculate the elapsed time of stopwatch by calculating difference between start time and stop time.
 * author: Shalini
 * date: 26/11/2018
 * version: 1.0
 */
package functionalprograms;

import utility.Utility;

public class StopWatch {
	interface MyFunctionalInterface
	{
		public double watch(int no);
	}
public static void main(String[] args)
{
	System.out.println("enter 1 to start the stopwatch");
	int input=Utility.inputInteger();
	MyFunctionalInterface f=no->Utility.stopwatch(input);
	System.out.println(f.watch(input));
	
}
}
