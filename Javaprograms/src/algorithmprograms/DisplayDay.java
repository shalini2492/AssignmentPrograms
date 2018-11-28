package algorithmprograms;

import java.util.Date;

import utility.Utility;

public class DisplayDay {
public static void main(String[] args)
{
	//Date d1 = new Date();
	
	int x, year, date, month; //validate inputs (negative input should be asked for inputs again.
	double d0, m0, y0;
    	System.out.println("Enter day");

    date = Utility.inputInteger();
    System.out.println("Enter month");
    month = Utility.inputInteger();
    System.out.println("Enter year");
    year = Utility.inputInteger();
    String week[]= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    int out = Utility.calDay(date, month, year);
   System.out.println("The day of the week that comes under date " +date+"/"+month+"/"+year+ " is: " +week[out]);
	//utility.calDay(d1);
	}
}
