package lib;
import functionsandlibraries.MathFunction;
import functionsandlibraries.BLRandom;
import utility.Utility;
public class UseRandom {
public static void main(String[] args)
{
	/*long seed;
	seed=System.currentTimeMillis();
	System.out.println("Seed: " +seed);
	long s=1234567892;
	int n=10;
	BLRandom.setSeed(s);
	BLRandom.getSeed();
	
	BLRandom.uniform(n);
	double v = BLRandom.uniform();
	System.out.println("Value: " +v);
	System.out.println("Uniform number: "+n);
	double x=10, y=20;
	BLRandom.uniform(x, y);
	System.out.println("Uniform range: "+x+ " and " +y);
	double probability=-1.0;
	BLRandom.uniform();
	BLRandom.bernoulli(probability);
	System.out.println("Probability: "+probability);*/
	System.out.println("Enter total number of trials");
	int trials = Utility.inputInteger();
	System.out.println("Enter total number of successes");
	int success = Utility.inputInteger();
	//System.out.println("Enter total number of failures");
	int failure = trials - success;
	System.out.println("Total number of failures: "+failure);
	double p = 1 % 6;
	System.out.println("probability of success in one trial: "+p);
	
	double q = 5 % 6;
	System.out.println("probability of failure in one trial: "+q);
	long k = MathFunction.factorial(trials) * MathFunction.factorial(success) * (MathFunction.factorial(failure));
	double probability = k*((p*success)*(q*failure));
	System.out.println("Probability: "+probability);
    BLRandom.bernoulli(probability);
}
}
