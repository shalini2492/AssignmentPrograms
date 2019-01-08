/*purpose: To replace given string "name" with the user input name.
 * author: Shalini
 * date: 14/11/2018
 * version: 1.0
 */
package functionalprograms;


/*******************String replace*********************/

public class Username 
{
	interface MyFunctionalInterface {

		//A method with single parameter
	    public String replaceUsername(String username);
	}
	public static void main(String[] args)
	   {
		//String template = "Hello <<username>> ! How are you?";
		
		MyFunctionalInterface f = username -> username.replace("<<username>>", username);  
		String username= "Sujata";
		System.out.println(f.replaceUsername("Hello " +username+"! How are you?"));
		

       }
}