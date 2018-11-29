package algorithmprograms;

import utility.Utility;
public class PaymentCal {
public static void main(String[] args)
{
	int pr, y;
	double r;
	pr = Integer.parseInt(args[0]);
	y = Integer.parseInt(args[1]);
	r = Double.parseDouble(args[2]);
	
	Utility.monthlyPayment(pr, r, y);
	
	
}
}
