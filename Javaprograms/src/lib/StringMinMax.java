package lib;
import functionsandlibraries.BLStdOut;

import functionsandlibraries.MathFunction;
import utility.Utility;
import java.util.Scanner;
public class StringMinMax {
public static void main(String[] args)
{
	int limit;
	Scanner sc = new Scanner(System.in);
    BLStdOut.println("Enter the size of array of strings: ");
    limit = Utility.inputInteger();
    String[] strArray = new String[limit];
    BLStdOut.println("Enter the strings");
    for(int i=0; i<limit; i++)
    {
  	  strArray[i] = sc.nextLine();
    }
    MathFunction.minStrArray(strArray, limit);
    MathFunction.maxStrArray(strArray, limit);
    sc.close();
}
}
