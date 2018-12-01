package lib;

import functionsandlibraries.MathFunction;
import utility.Utility;
import java.util.Scanner;
public class IntegerMinMax {
public static void main(String[] args)
{
	int size;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    size = Utility.inputInteger();
    int[] a = new int[size];
    System.out.println("Enter the integer elements: ");
    for(int i=0; i<size; i++)
    {
 	   a[i] = sc.nextInt();
    }
   MathFunction.maxInt(a, size);
   MathFunction.minInt(a, size);
   sc.close();
}
}
