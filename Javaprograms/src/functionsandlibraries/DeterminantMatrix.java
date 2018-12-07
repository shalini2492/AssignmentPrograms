/**purpose: To compute the determinant of 3X3 matrix.
 * author: Shalini
 * date: 7/12/2018
 * version: 1.0
 */
package functionsandlibraries;

import standardlibrary.BLStdOut;
import utility.Utility;

public class DeterminantMatrix {
public static void main(String[] args)
{
	int row, column;
	BLStdOut.print("Enter the number of rows for matrix..");
	row=Utility.inputInteger();
	BLStdOut.print("Enter the number of columns for matrix..");
	column=Utility.inputInteger();
	int[][] matrix = new int[row][column];
	BLStdOut.print("Enter integer elements..");
	for(int i=0; i<row; i++)
	{
		for(int j=0; j<column; j++)
		{
			matrix[i][j]=Utility.inputInteger();
		}
	}
	BLStdOut.print("Matrix: ");
	for(int i=0; i<row; i++)
	{
		for(int j=0; j<column; j++)
		{
			BLStdOut.print(matrix[i][j]+" ");
		}
		BLStdOut.println("\n");
	}
	Utility.findDeterminant(matrix, row, column);
}
}
