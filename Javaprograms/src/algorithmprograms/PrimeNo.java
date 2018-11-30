package algorithmprograms;

import utility.Utility;

public class PrimeNo {
public static void main(String[] args)
{
	Utility utility = new Utility();
	for(int i=2; i<1000; i++)
	{
		if(utility.prime(i))
		{
			System.out.println(i);
		}
	}
}
}
