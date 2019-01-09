package algorithmprograms;

import java.util.Date;

import utility.Utility;

public class DisplayDay {
	interface MyFunctionalInterface
	{
		public int day(int d);
	}
public static void main(String[] args)
{
	//Date d1 = new Date();
	
	int x, year, date, month; //validate inputs (negative input should be asked for inputs again.
	double d0, m0, y0;
    	System.out.println("Enter day");

    date = Utility.inputInteger();
    
//    
//    if(date<1)
//    {
//    	System.out.println("Invalid date..");
//    	System.out.println("Enter valid date");
//    	date=Utility.inputInteger();
//    }
    
    System.out.println("Enter month");
    month = Utility.inputInteger();
//    if(month<1)
//    {
//    	System.out.println("Invalid month..");
//    	System.out.println("Enter valid month");
//    	month=Utility.inputInteger();
//    }
    System.out.println("Enter year");
    year = Utility.inputInteger();
//    if(year<1582 || year<1)
//    {
//    	System.out.println("Invalid year..");
//    	System.out.println("Enter valid year");
//    	year=Utility.inputInteger();
//    }
    String week[]= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    MyFunctionalInterface f=d-> Utility.calDay(date, month, year);
   System.out.println("The day of the week that comes under date " +date+"/"+month+"/"+year+ " is: " +week[f.day(date)]);
	//utility.calDay(d1);
	}
}
