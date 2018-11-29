/*purpose: To calculate distance between origin and user given coordinates
 * author: Shalini
 * date: 25/11/2018
 * version: 1.0
 */
package functionalprograms;

import utility.Utility;

public class Distance {
public static void main(String[] args)
{
	
	System.out.println("Enter the coordinates");
	
	int i = Utility.inputInteger();
	int j = Utility.inputInteger();
	Utility.dist(i, j);
}
}
