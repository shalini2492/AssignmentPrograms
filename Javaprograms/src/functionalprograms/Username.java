/*purpose: To replace given string "name" with the user input name.
 * author: Shalini
 * date: 14/11/2018
 * version: 1.0
 */
package functionalprograms;

import utility.Utility;

/*******************String replace*********************/

public class Username 
{
	interface MyFunctionalInterface {

		//A method with single parameter
	    public String replaceUsername(String user);
	}
	public static void main(String[] args)
	   {
		String template = "Hello <<username>> ! How are you?";
		System.out.println("Original String is: "+template);
		System.out.println("Enter username");
		String username= Utility.inputString();
		MyFunctionalInterface f = user -> Utility.replaceString(template, username);
		System.out.println(f.replaceUsername(username));
//		System.out.println("String after replacement: ");
//		System.out.println(f.replaceUsername("Hello " +username+"! How are you?"));
//		

       }
}