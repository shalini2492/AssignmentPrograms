package Functionalprograms;

import Utility.Utility;
import java.util.Scanner;

public class WindChill {
public static void main(String[] args)
{
	double t, v;
	Utility utility = new Utility();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the temperature in Fahrenheit");
	t = scanner.nextDouble();
	System.out.println("Enter the speed in miles per hour");
	v = scanner.nextDouble();

	

	double f = utility.calTemp(t, v);
	System.out.println("result: " +f);
}
}
