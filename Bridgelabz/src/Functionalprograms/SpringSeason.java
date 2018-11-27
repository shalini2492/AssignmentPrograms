package Functionalprograms;
import Utility.Utility;
public class SpringSeason {
public static void main(String[] args)
{
	int d, m;
	Utility utility = new Utility();
	System.out.println("Enter the day");     //user input day and month
	d = utility.inputInteger();
	System.out.println("Enter the month");
	m = utility.inputInteger();
	boolean result = utility.spring(d, m);  //spring() is called and its return type is boolean
	System.out.println(result);		
}
}
