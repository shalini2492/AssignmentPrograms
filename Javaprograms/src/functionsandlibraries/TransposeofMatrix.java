package functionsandlibraries;

import standardlibrary.BLStdOut;
import utility.Utility;

public class TransposeofMatrix {
public static void main(String[] args)
{
	int row, column;
	BLStdOut.print("Enter the number of rows of matrix");
	row=Utility.inputInteger();
	BLStdOut.print("Enter the number of columns of matrix");
	column=Utility.inputInteger();
	int[][] matrix=new int[row][column];
	BLStdOut.print("Enter the integer elements");
	for(int i=0; i<row; i++)
	{
		for(int j=0; j<column; j++)
		{
		matrix[i][j]=Utility.inputInteger();
		}
	}
	BLStdOut.print("Original matrix: ");
	System.out.println("\n");
	for(int i=0; i<row; i++)
	{
		for(int j=0; j<column; j++)
		{
			BLStdOut.print(matrix[i][j]+" ");
		}
		BLStdOut.print("\n");
	}
	int[][] result=Utility.transposeMatrix(matrix, row, column);
	BLStdOut.print("Transpose of matrix...\n");
	for(int i=0; i<row; i++)
	{
		for(int j=0; j<column; j++)
		{
			BLStdOut.print(result[j][i]+" ");
		}
		BLStdOut.print("\n");
	}
}
}
