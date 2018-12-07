/**purpose: To multiply 2D array and display output
 * author: Shalini
 * date: 6/12/2018
 * version: 1.0
 */
package functionsandlibraries;

import standardlibrary.BLStdOut;
import utility.Utility;

public class MatrixMultiplication {
public static void main(String[] args)
{
	int i, j, rowFirst, rowSecond, columnFirst, columnSecond;
	BLStdOut.print("Enter number of rows in first array..");
	rowFirst=Utility.inputInteger();
	BLStdOut.print("Enter number of columns in first array..");
	columnFirst=Utility.inputInteger();
	BLStdOut.print("Enter number of rows in second array..");
	rowSecond=Utility.inputInteger();
	BLStdOut.print("Enter number of columns in second array..");
	columnSecond=Utility.inputInteger();
	int[][] a = new int[rowFirst][columnFirst];
	int[][] b = new int[rowSecond][columnSecond];
	BLStdOut.print("Enter elements in first array");
	for(i=0; i<rowFirst; i++)
	{
		for(j=0; j<columnFirst; j++)
		{
			a[i][j]=Utility.inputInteger();
		}
	}
	BLStdOut.print("Enter elements in second array..");
	for(i=0; i<rowSecond; i++)
	{
		for(j=0; j<columnSecond; j++)
		{
			b[i][j]=Utility.inputInteger();
		}
	}
	BLStdOut.print("Arrays are: ");
	BLStdOut.print("\n");
	for(i=0; i<rowFirst; i++)
	{
		for(j=0; j<columnFirst; j++)
		{
			BLStdOut.print(a[i][j]+" ");
		}
		BLStdOut.print("\n");
	}
	for(i=0; i<rowSecond; i++)
	{
		for(j=0; j<columnSecond; j++)
		{
			BLStdOut.print(b[i][j]+" ");
		}
		BLStdOut.print("\n");
	}
	Utility.multiplyArray(a, b, rowFirst, columnFirst, rowSecond, columnSecond);
}
}
