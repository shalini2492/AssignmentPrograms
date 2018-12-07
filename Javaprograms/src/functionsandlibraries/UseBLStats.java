/**purpose: To utilize methods defined in BLStats utility class.
 * author: Shalini
 * date: 7/12/2018
 * version: 1.0
 */
package functionsandlibraries;
import standardlibrary.BLStats;
import standardlibrary.BLStdOut;
import utility.Utility;
public class UseBLStats {
public static void main(String[] args)
{
	int choice;
	BLStdOut.print("1. Maximum value\n2. Minimum value\n3. Mean\n4. Variance\n5. Standard deviation\n"
			+ "6. Median\n7. Plot points\n8. Plot lines\n9. Plot bars");
	BLStdOut.print("\nEnter input choice");
	choice=Utility.inputInteger();
	BLStdOut.print("Enter the size of array..");
    int size=Utility.inputInteger();
    double[] array=new double[size];
    BLStdOut.print("Enter the elements of type double..");
    for(int i=0; i<size; i++)
    {
    	array[i]=Utility.InputDouble();
    }
    BLStdOut.print("Elements in array: ");
    for(int i=0; i<size; i++)
    {
    	System.out.println(array[i]);
    }
	switch(choice)
	{
	case 1: 
		    
	        double maximumElement=UseBLStats.max(array, size);
	        BLStdOut.print("Maximum element in array: "+maximumElement);
	        break;
	case 2: 
		    
		    double minimumElement=UseBLStats.min(array, size);
		    BLStdOut.print("Minimum element in array: "+minimumElement);
		    break;
	case 3: 
		    double d = UseBLStats.mean(array);
		    BLStdOut.print("Mean: "+d);
		    break;
	case 4: 
		    double g=UseBLStats.variance(array);
		    BLStdOut.print("Variance: "+g);
		    break;
	case 5:
		    double k=UseBLStats.standardDeviation(array);
		    BLStdOut.print("Standard deviation: "+k);
		    break;
	case 6: 
		    double f=UseBLStats.median(array);
		    BLStdOut.print("Median is: "+f);
		    break;
	case 7: 
		    UseBLStats.plotPoints(array);
		    break;
	case 8: 
		    UseBLStats.plotLines(array);
		    break;
	case 9: 
		    UseBLStats.plotBars(array);
		    break;
	}
}
public static double max(double[] a, int s)
{
	double max=BLStats.max(a);
	
	return max;
}
public static double min(double[] d, int l)
{
	double min=BLStats.min(d);
	return min;
}
public static double mean(double[] t)
{
	double result=BLStats.mean(t);
	return result;
}
public static double variance(double[] p)
{
	double output=BLStats.var(p);
	return output;
}
public static double standardDeviation(double[] a)
{
	double r=BLStats.stddev(a);
	return r;
}
public static double median(double[] a)
{
	double o=BLStats.median(a);
	return o;
}
public static void plotPoints(double[] a)
{
	BLStats.plotPoints(a);
	
}
public static void plotLines(double[] a)
{
	BLStats.plotLines(a);
}
public static void plotBars(double[] a)
{
	BLStats.plotBars(a);
}
}
