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
	public static void main(String[] args)
	   {
		  String template = "Hello <<username>> ! How are you?";
          String username="";
           
          System.out.println("Enter your name");
          username = Utility.inputString();
          
          Utility.replaceString(template, username);
          //System.out.println(str);
       }
}