package functionalprograms;



import utility.Utility;

public class WindChill {
public static void main(String[] args)
{
	double t, v;
	
	System.out.println("Enter the temperature in Fahrenheit");
	t = Utility.InputDouble();
	System.out.println("Enter the speed in miles per hour");
	v = Utility.InputDouble();

	

	double f = Utility.calTemp(t, v); //not completed.
	System.out.println("result: " +f);
}
}
