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
