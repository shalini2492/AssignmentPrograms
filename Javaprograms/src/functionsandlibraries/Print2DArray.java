/**purpose: To print 2D arrays of type integer, double and boolean
 * author: Shalini
 * date: 6/12/2018
 * version: 1.0
 */
package functionsandlibraries;
 
import standardlibrary.BLStdOut;
import utility.Utility;

public class Print2DArray {
public static void main(String[] args)
{
	
	BLStdOut.println("1. Integer Array\n2. Double Array\n3. Boolean Array");
	BLStdOut.print("Enter the choice");
	int ch = Utility.inputInteger();
	Utility.printArray(ch);
}
}
