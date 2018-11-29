package functionalprograms;

import utility.Utility;

public class Calendar {

public static void main(String[] args)
{
	int day=1;
	int month = Integer.parseInt(args[0]);
	int year = Integer.parseInt(args[1]);
	String week[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	String months[] = {"", "January", "February", "March", "April", "May", "June", "July", "August", 
			           "September", "October", "November", "December"};
    int days[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    //check for leap year
    if(month==2 && Utility.LeapYear(year))
    	 days[month] = 29;
    
    System.out.println("   " +months[month]+ "  " +year);
    System.out.println(" S M Tu W Th F S");
    int d = Utility.calDay(month, day, year);
    for(int i=0; i<d; i++)			//print calendar
    {
    	System.out.print(" ");
    }
    for(int i=0; i<days[month]; i++)
    {
    	System.out.printf("%2d", i);
    	if(((i + d) == 7) || (i == days[month]))
        System.out.println();
    }
    
}
}
