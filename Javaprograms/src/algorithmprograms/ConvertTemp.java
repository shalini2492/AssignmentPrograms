package algorithmprograms;

import utility.Utility;
public class ConvertTemp {
	interface MyFunctionalInterface
	{
		public double convertTemperature(double val);
	}
public static void main(String[] args)
{
	System.out.println("Enter temperature in celsius"); 
	double celsius= Utility.InputDouble();
	System.out.println("Enter temperature in fahreinheit");
	double fah = Utility.InputDouble();
	MyFunctionalInterface f=val->Utility.temperaturConversion(celsius, fah);
	System.out.println(f.convertTemperature(fah));
}
}
