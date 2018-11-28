package functionalprograms;
import utility.Utility;
public class DoubleOpt {
public static void main(String[] args)
{
	double a, b, c;
	
	System.out.println("Enter the values of a, b and c");
	a = Utility.InputDouble();
	b = Utility.InputDouble();
	c = Utility.InputDouble();
    double d = Utility.doubleOpt(a, b, c);
    System.out.println(d);
}
}
