package Functionalprograms;

//import Utility.Stopwatch;
import Utility.Utility;

public class StopWatch {
public static void main(String[] args)
{
    int ch, elapsedTime, diff;
    StopWatch s1 = new StopWatch();
	StopWatch s2 = new StopWatch();
    int startTime=0;
    int stopTime = 0;
	System.out.println("Enter 1 to start the timer and 0 to stop the timer");
	Utility utility = new Utility();
	ch = utility.inputInteger();
	startTime = utility.inputInteger();
	stopTime = utility.inputInteger();
    utility.stopWatch(startTime, stopTime);
}
}
