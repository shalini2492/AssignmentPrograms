/* purpose: To perform trigonometric functions sine and cosine values of given angles
 * author: Shalini
 * date: 28/11/2018
 * version: 1.0
 */
package functionalprograms;

import utility.Utility;

public class Trig {
public static void main(String[] args)
{
	double angle; 
	
	//Utility utility = new Utility();
	System.out.println("Enter the angle: ");
	angle = Utility.InputDouble();
	Utility.trigOperations(angle);
}
}
