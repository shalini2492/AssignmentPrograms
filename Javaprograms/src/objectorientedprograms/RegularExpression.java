/**purpose: To replace specific names with user input names in a string using regular expressions.
 * author: Shalini
 * date: 5/12/2018
 * version: 1.0
 */
package objectorientedprograms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import utility.Utility;

public class RegularExpression {
public static void main(String[] args)
{
	String name, fullName;
	
	LocalDate d = LocalDate.now();
	DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
	String datetostring = df.format(d);
		
	System.out.println("Enter user name");
	name=Utility.inputString();
	System.out.println("User name: "+name);
	System.out.println("Enter your full name");
	fullName=Utility.inputString();
	System.out.println("Full name: "+fullName);
	System.out.println("Enter your phone number");
	String phoneNumber=Utility.inputString();
	System.out.println("Phone number: "+phoneNumber);
	System.out.println("Current date: "+d);
    Utility.replaceString(name, fullName, phoneNumber, datetostring);
   
}
}
