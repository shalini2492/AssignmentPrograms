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
	int i, j, row, column;
	BLStdOut.print("Enter number of rows in array..");
	row=Utility.inputInteger();
	BLStdOut.print("Enter number of columns in array..");
	column=Utility.inputInteger();
	int[][] a = new int[row][column];
	int[][] b = new int[row][column];
	BLStdOut.print("Enter elements in first array");
	for(i=0; i<row; i++)
	{
		for(j=0; j<column; j++)
		{
			a[i][j]=Utility.inputInteger();
		}
	}
	BLStdOut.print("Enter elements in second array..");
	for(i=0; i<row; i++)
	{
		for(j=0; j<column; j++)
		{
			b[i][j]=Utility.inputInteger();
		}
	}
	BLStdOut.print("Arrays are: ");
	BLStdOut.print("\n");
	for(i=0; i<row; i++)
	{
		for(j=0; j<column; j++)
		{
			BLStdOut.print(a[i][j]+" ");
		}
		BLStdOut.print("\n");
	}
	for(i=0; i<row; i++)
	{
		for(j=0; j<column; j++)
		{
			BLStdOut.print(b[i][j]+" ");
		}
		BLStdOut.print("\n");
	}
	Utility.multiplyArray(a, b, row, column);
}
}
