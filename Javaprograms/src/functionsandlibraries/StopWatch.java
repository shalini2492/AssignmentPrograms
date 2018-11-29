/* purpose: To compute the elapsed time i.e. difference between start time and stop time.
 * author: Shalini
 * date: 27/11/2018
 * version: 1.0
 */
package functionsandlibraries;

import utility.Utility;

public class StopWatch {
public static void main(String[] args)
{
	
	long startTime=0;
	long stopTime=0;
	System.out.println("enter 1 to start the stopwatch");
	int input=Utility.inputInteger();
	Utility.stopWatch(startTime, stopTime);
}
}
