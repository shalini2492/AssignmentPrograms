package Algorithmprograms;

import Utility.Utility;
import java.util.Date;

public class DisplayDay {
public static void main(String[] args)
{
	Date d1 = new Date();
	
	int x, y, d, m;
	double d0, m0, y0;
	System.out.println("Please enter date");
    Utility utility = new Utility();
    d = utility.inputInteger();
    System.out.println("Enter month");
    m = utility.inputInteger();
    System.out.println("Enter year");
    y = utility.inputInteger();
    System.out.println("The day of the week that comes under date: " +d+"/"+m+"/"+y+ " is: " +d1);
	utility.calDay(d1);
	}
}
