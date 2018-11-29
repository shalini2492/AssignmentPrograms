/* purpose: To display two-dimensional array by taking limit of array and displaying it in 2-D manner.
 * author: Shalini
 * date: 22/11/2018
 * version: 1.0
 */
package functionalprograms;

import utility.Utility;

public class TwoDArray {
public static void main(String[] args)
{
		
	System.out.println("Enter the no of rows of array");
	int row = Utility.inputInteger();
	
	System.out.println("Enter the no of columns of array");
	int column = Utility.inputInteger();
	System.out.println("Enter elements" );
	Utility.twodarr(row, column);

}
}
