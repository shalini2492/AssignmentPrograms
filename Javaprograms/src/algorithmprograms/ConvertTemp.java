package algorithmprograms;

import utility.Utility;
public class ConvertTemp {
public static void main(String[] args)
{
	Utility utility = new Utility();
	

	System.out.println("Enter temperature in celsius"); //check output
	double celsius= utility.InputDouble();
	System.out.println("Enter temperature in fahreinheit");
	double fah = utility.InputDouble();
	utility.temperaturConversion(celsius, fah);
}
}