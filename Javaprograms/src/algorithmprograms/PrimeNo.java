package algorithmprograms;

import utility.Utility;

public class PrimeNo {
	interface MyFunctionalInterface
	{
		public boolean forPrime(int a);
	}
public static void main(String[] args)
{
	
	for(int i=2; i<1000; i++)
	{
		
		if(Utility.prime(i))
		{
			System.out.println(i);
		}
	}

}
}
