/* purpose: To compute the elapsed time i.e. difference between start time and stop time.
 * author: Shalini
 * date: 27/11/2018
 * version: 1.0
 */
package lib;

import utility.Utility;
import functionsandlibraries.BLStdOut;
public class StopWatch {
public static void main(String[] args)
{
	
	long startTime=0;
	long stopTime=0;
	BLStdOut.println("enter 1 to start the stopwatch");
	int input=Utility.inputInteger();
	Utility.stopWatch(startTime, stopTime);
}
}
