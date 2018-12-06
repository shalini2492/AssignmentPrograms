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
	
	
    while(number>0)
    {
    	output= output + (double) 1/number;
    	number--;
    	count++;
    	 BLStdOut.print(" "+output);
    	 BLStdOut.print(" ");
       
    }
   
   
    for(int i=0; i<count; i++)
    {
    	for(int j=0; j<i; j++)
    	{
    		result[i][j]=output;
    		BLStdOut.print(result[i][j]+ " ");
    	}
    	BLStdOut.print(" ");
    }
}

}
