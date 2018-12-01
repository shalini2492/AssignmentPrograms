/* purpose: To compute day of the week that falls under the given date.
 * author: Shalini
 * date: 21/11/2018
 * version: 1.0
 */
package lib;

import utility.Utility;

public class DisplayDay {
public static void main(String[] args)
{
	//Date d1 = new Date();
	
	int year, date, month; 
	
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
