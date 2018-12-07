/**purpose: To utilize methods defined in BLRandom utility class.
 * author: Shalini
 * date: 7/12/2018
 * version: 1.0
 */
package functionsandlibraries;
import standardlibrary.BLRandom;
import standardlibrary.BLStdOut;
import standardlibrary.MathFunction;
import utility.Utility;
public class UseRandom {
public static void main(String[] args)
{
	BLStdOut.print("1. setSeed method\n2. Uniform method for integer\n3. Uniform method for low and high"
			+ "\n4. Bernoulli distribution\n5. Gaussian distribution\n6. Discrete distribution\n");
	BLStdOut.print("Enter the choice");
	int ch = Utility.inputInteger();
	do
	{
		switch(ch)
		{
		
		case 1: 
					long seed;
					seed=System.currentTimeMillis();
					System.out.println("Seed: " +seed);
					long s=1234567892;
					int n=10;
					BLRandom.setSeed(s);
					BLRandom.getSeed();
		            break;
		case 2:     
					BLRandom.uniform();
					double v = BLRandom.uniform();
					System.out.println("Value: " +v);
					System.out.println("Uniform number: "+v);
					break;
		case 3:
					double x=10, y=20;
					BLRandom.uniform(x, y);
					System.out.println("Uniform range: "+x+ " and " +y);
					BLRandom.uniform();
		            break;
		case 4: 
					System.out.println("Enter total number of trials");
					int trials = Utility.inputInteger();
					System.out.println("Enter total number of successes");
					int success = Utility.inputInteger();
					
					double pro = UseRandom.deriveBernoulli(trials, success);
					BLStdOut.print("Probability using Bernoulli distribution..");
					System.out.println(pro);
	                break;	
		case 5:
				   BLStdOut.print("Enter the value of mu");
				   double mu=Utility.InputDouble();
				   BLStdOut.print("Enter the value of sigma");
				   double sigma=Utility.InputDouble();
				   double stddev=UseRandom.gaussian(mu, sigma);
				   BLStdOut.print("The result of standard deviation...");
				   System.out.println(stddev);
				   break;
		case 6:
				   double[] probabilities = new double[10];
			       double prob=UseRandom.discrete(probabilities);
			       System.out.println(prob);
			       break;
		case 7:
				   double arr[] = null;
				   UseRandom.shuffle(arr);
				   break;
	    default: BLStdOut.print("Invalid input...");
	             BLStdOut.print("Please enter a valid input.");
	             ch=Utility.inputInteger();
		}
		

	}while(ch!=0 && ch<7);
}
public static double deriveBernoulli(int trials, int successes)
{
	int failure = trials - successes;
	double probability=0.0;
	System.out.println("Total number of failures: "+failure);
	double p = 1 % 6;
	double q = 5 % 6;
	System.out.println("probability of failure in one trial: "+q);
	double k = MathFunction.factorial(trials) * MathFunction.factorial(successes) * (MathFunction.factorial(failure));
	probability = k*((p*successes)*(q*failure));
	
	return probability;
}
public static double gaussian(double mu, double sigma)
{
	
    double g=BLRandom.gaussian(mu, sigma);
	return g;
}
public static double discrete(double[] probabilities)
{
	double pro=0.0;
	BLStdOut.print("Enter size of array of double type...");
	int size=Utility.inputInteger();
	for(int i=0; i<size; i++)
	{
		System.out.println("Enter total number of trials");
		int trials = Utility.inputInteger();
		System.out.println("Enter total number of successes");
		int success = Utility.inputInteger();
		
		pro = UseRandom.deriveBernoulli(trials, success);
		BLStdOut.print("Probability using Bernoulli distribution..");
		System.out.println(pro);
	}
	BLRandom.discrete(probabilities);
	return pro;
}
public static void shuffle(double[] array)
{
	BLStdOut.print("Enter the range of array..");
	int size=Utility.inputInteger();
	array= new double[size];
	BLStdOut.print("Enter elements of type double..");
	for(int i=0; i<size; i++)
	{
		array[i]=Utility.InputDouble();
	}
	BLStdOut.print("Array before shuffle...");
	for(int i=0; i<size; i++)
	{
		System.out.println(array[i]);
	}
	
	BLStdOut.print("Array after shuffle...");
	BLRandom.shuffle(array);
	
}
}
