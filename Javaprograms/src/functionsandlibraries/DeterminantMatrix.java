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
	BLStdOut.print("Enter order of matrix..");
	int order=Utility.inputInteger();
	int[][] matrix = new int[order][order];
	BLStdOut.print("Enter elements..");
	for(int i=0; i<order; i++)
	{
		for(int j=0; j<order; j++)
		{
			matrix[i][j]=Utility.inputInteger();
		}
	}
	BLStdOut.print("Matrix: ");
	BLStdOut.print("\n");
	for(int i=0; i<order; i++)
	{
		for(int j=0; j<order; j++)
		{
			BLStdOut.print(matrix[i][j]+" ");
		}
		BLStdOut.println("\n");
	}
	int h= Utility.findDeterminant(matrix);
	System.out.println("Determinant: "+h);
}
}
