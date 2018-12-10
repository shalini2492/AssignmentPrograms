/*purpose: To print three names in reverse order from the given input
 * author: Shalini
 * date: 28/11/2018
 * version: 1.0
 */
package functionalprograms;
import utility.Utility;
import java.util.Scanner;
public class PrintThreeNames {
public static void main(String[] args)
{
	/*String name1, name2, name3;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter three names");
	name1=Utility.inputString();
	name2 = Utility.inputString();
	name3 = Utility.inputString();
	String[] order = name1.split("");
	for(int i=0; i<order.length; i++)
	{
		order[i] = sc.nextLine();
	}
	for(int i=order.length-1; i>=0; i--)
	{
		System.out.println(order[i]);
	}
	sc.close();*/
	String firstName, secondName, thirdName;
	System.out.println("Enter the first name");
	firstName = Utility.inputString();
	System.out.println("Enter the second name");
	secondName = Utility.inputString();
	System.out.println("Enter the third name");
	thirdName = Utility.inputString();
	
	
	
	Utility.reversePrint(firstName, secondName, thirdName); //reversePrint() method is called.
 
}
}
