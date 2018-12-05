package functionalprograms;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import utility.Utility;

public class RegularExpression {
public static void main(String[] args)
{
	String name, fullName;
	
	Date d = Calendar.getInstance().getTime();
	DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
	String datetostring = df.format(d);
	String template="Hello <<user>>,we have your full name as <<fullname>> in our system. your contact number is "
			+ "91-xxxxxxxxxx. Please let us know in any case of clarification Thank you Bridgelabz <<date>>.";
	
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
