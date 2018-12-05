/**purpose: To register a user by accepting user details and validating them using regular expressions.
 * author: Shalini
 * date: 5/12/2018
 * version: 1.0
 */
package functionsandlibraries;

import utility.Utility;

public class RegistrationUser {
public static void main(String[] args)
{
	String firstName, lastName, companyName, userID, password;
	String emailID = "";
	String contact="";
	
	System.out.println("Enter the first name of user");
	firstName=Utility.inputString();
	if(Utility.validateFirstName(firstName))
	{
		System.out.println("Valid first name..");
	}
	else
		System.out.println("Invalid first name..");
	if(Utility.validateFirstName(firstName))
	{
	System.out.println("Enter the last name of user");
	lastName=Utility.inputString();
	if(Utility.validateLastName(lastName))
	{
		System.out.println("Valid last name..");
	}
	else
		System.out.println("Invalid last name..");
	if(Utility.validateLastName(lastName))
	{
	    System.out.println("Enter email address");
		emailID = Utility.inputString();
		if(Utility.validateEmailAddress(emailID))
		{
			System.out.println("Valid email address..");
		}
		else
			System.out.println("Invalid email address..");
		if(Utility.validateEmailAddress(emailID))
		{
		    System.out.println("Enter the user ID");
		    userID = Utility.inputString();
		    if(Utility.validUserID(userID))
		    {
		    	System.out.println("Valid userID..");
		    }
		    else
		    System.out.println("Invalid userID..");
		    if(Utility.validUserID(userID))
		    {
		    System.out.println("Enter the password");
		    password=Utility.inputString();
		    if(Utility.validPassword(password))
		    {
		    	System.out.println("Valid password..");
		    }
		    else
		    	System.out.println("Invalid password..");
		    if(Utility.validPassword(password))
		    {
			System.out.println("Enter contact number with country code");
			contact=Utility.inputString();
			if(Utility.validContactNumber(contact))
			{
				System.out.println("Valid contact number");
			}
			else
				System.out.println("Invalid contact number");
		    }
		    System.out.println("Enter company name");
		    companyName=Utility.inputString();
		    System.out.println(companyName);
		    }
		    
		}
	}
}
}
}
