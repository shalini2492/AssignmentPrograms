package Functionalprograms;

import Utility.Utility;

public class TwoDArray {
public static void main(String[] args)
{
	Utility utility = new Utility();
	
	System.out.println("Enter the no of rows of array");
	int row = utility.InputInteger();
	
	System.out.println("Enter the no of columns of array");
	int column = utility.InputInteger();
	System.out.println("Library array is:" );
	utility.twodarr(row, column);

}
}
