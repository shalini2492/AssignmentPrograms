/*purpose: To return whether the given day and month comes in spring season or not.
 * author: Shalini
 * date: 29/11/2018
 * version: 1.0
 */
package functionalprograms;
import utility.Utility;
public class SpringSeason {
public static void main(String[] args)
{
	int day, month;
	
	day = Integer.parseInt(args[0]);
	month = Integer.parseInt(args[1]);
	
	Utility.springSeason(day, month);
	boolean isSpring = Utility.springSeason(day, month);
	if(isSpring)
	{
		System.out.println("Spring season...");
	}
	else
		System.out.println("not spring season..");
}
}
