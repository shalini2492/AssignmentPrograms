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
	String firstName, lastName="", companyName, userID, password="";
	String emailID = "";
	String contact="";
	
	System.out.println("Enter the first name of user");
	firstName=Utility.inputString();
	System.out.println("Enter the last name of user");
	lastName=Utility.inputString();
	System.out.println("Enter valid email address");
	emailID=Utility.inputString();
	System.out.println("Enter a valid password");
	password=Utility.inputString();
	System.out.println("Enter contact number of user");
	contact=Utility.inputString();
	System.out.println("Enter company name");
	companyName = Utility.inputString();
	  
		
	if(Utility.validateFirstName(firstName))
	{
		System.out.println(firstName);
	}
	else
		System.out.println("Invalid first name...Please enter a valid first name");
	    firstName=Utility.inputString();
	if(Utility.validateLastName(lastName))
	{
		System.out.println(lastName);
	}
	else
		System.out.println("Invalid last name...Please enter a valid last name");
	lastName=Utility.inputString();
	if(Utility.validateEmailAddress(emailID))
	{
		System.out.println(emailID);
	}
	else
		System.out.println("Invalid email address...Please enter a valid email address");
	emailID=Utility.inputString();
	if(Utility.validPassword(password))
	{
		System.out.println(password);
	}
	else
		System.out.println("Invalid password...Please enter a valid password");
	password=Utility.inputString();
	if(Utility.validContactNumber(contact))
	{
		System.out.println(contact);
	}
	else
		System.out.println("Invalid contact number...Please enter a valid contact number");
	    contact = Utility.inputString();
	    System.out.println(companyName);
	    
	}  
}

