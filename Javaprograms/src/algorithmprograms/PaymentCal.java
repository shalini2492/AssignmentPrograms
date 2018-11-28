package algorithmprograms;

import utility.Utility;
public class PaymentCal {
public static void main(String[] args)
{
	int pr, y;
	double r;  //make command line....
	Utility utility = new Utility();
	System.out.println("Enter value of p");
	pr = utility.inputInteger();
	System.out.println("Enter value of y");
	y = utility.inputInteger();
	System.out.println("Enter value of r");
	r = utility.InputDouble();
	utility.monthlyPayment(pr, r, y);
	
	
}
}
