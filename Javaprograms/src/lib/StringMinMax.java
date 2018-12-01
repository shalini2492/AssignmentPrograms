package lib;

import functionsandlibraries.MathFunction;
import utility.Utility;
import java.util.Scanner;
public class StringMinMax {
public static void main(String[] args)
{
	int limit;
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array of strings: ");
    limit = Utility.inputInteger();
    String[] strArray = new String[limit];
    System.out.println("Enter the strings");
    for(int i=0; i<limit; i++)
    {
  	  strArray[i] = sc.nextLine();
    }
    MathFunction.minStrArray(strArray, limit);
    MathFunction.maxStrArray(strArray, limit);
    sc.close();
}
}
