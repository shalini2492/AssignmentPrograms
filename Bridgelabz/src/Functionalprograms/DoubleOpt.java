package Functionalprograms;
import Utility.Utility;
public class DoubleOpt {
public static void main(String[] args)
{
	double a, b, c;
	Utility utility = new Utility();
	System.out.println("Enter the values of a, b and c");
	a = utility.InputDouble();
	b = utility.InputDouble();
	c = utility.InputDouble();
    double d = utility.doubleOpt(a, b, c);
    System.out.println(d);
}
}
