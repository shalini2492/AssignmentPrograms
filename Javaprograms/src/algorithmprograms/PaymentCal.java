package algorithmprograms;

import utility.Utility;
public class PaymentCal {
	interface MyFunctionalInterface
	{
		public double pay(int a);
	}
public static void main(String[] args)
{
	int pr, y;
	double r;
	pr = Integer.parseInt(args[0]);
	y = Integer.parseInt(args[1]);
	r = Double.parseDouble(args[2]);
	
	MyFunctionalInterface f=a->Utility.monthlyPayment(pr, r, y);
	System.out.println(f.pay(y));
	
}
}
