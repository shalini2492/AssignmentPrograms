/*purpose: To compute harmonic number of given number

 * author: Shalini
 * date: 6/12/2018
 * version: 1.0
 */
package functionsandlibraries;

import utility.Utility;
import standardlibrary.BLStdOut;
public class HarmonicNo {
public static void main(String[] args)
{
	double[][] result= new double[10][10];
	double output=0.0;
	int count=0;
	System.out.println("Enter a positive number to calculate harmonic series");
	int number=Utility.inputInteger();
	double ha=Utility.harmonicNumber(number);
	BLStdOut.println();
	for(int i=0; i<2; i++)
	{
		for(int j=0; j<2; j++)
		{
			BLStdOut.print(ha+" ");
		}
		BLStdOut.println();
	}
	
   
}

}
