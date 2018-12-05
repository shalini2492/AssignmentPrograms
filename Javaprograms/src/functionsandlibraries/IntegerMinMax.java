package functionsandlibraries;

import utility.Utility;
import java.util.Scanner;

import standardlibrary.BLStdOut;
import standardlibrary.MathFunction;
public class IntegerMinMax {
public static void main(String[] args)
{
	int size;
    Scanner sc = new Scanner(System.in);
    BLStdOut.println("Enter the size of array: ");
    size = Utility.inputInteger();
    int[] a = new int[size];
    BLStdOut.println("Enter the integer elements: ");
    for(int i=0; i<size; i++)
    {
 	   a[i] = sc.nextInt();
    }
   MathFunction.maxInt(a, size);
   MathFunction.minInt(a, size);
   sc.close();
}
}
