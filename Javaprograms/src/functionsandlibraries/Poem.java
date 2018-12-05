/**purpose: To replace string between % % with animal name and their respective sound using regular expressions.
 * author: Shalini
 * date: 5/12/2018
 * version: 1.0
 */
package functionsandlibraries;

import utility.Utility;

public class Poem {
public static void main(String[] args)
{
	String lyrics="Old MacDonald had a farm..... E-I-E-I-O  "
			+ " And on his farm he had some %Animal%...E-I-E-I-O  "
			+ " With a %Sound% %Sound% here and a %Sound% %Sound% there  "
			+ " Here a %Sound% There a %Sound% %Sound%  "
			+ " Everywhere a %Sound% %Sound%";
	System.out.println("Enter any animal");
	String animal="";
	animal=Utility.inputString();
	System.out.println("Enter the sound of "+animal);
	String sound = Utility.inputString();
    Utility.lyrics(animal, sound);
}
}
