package Functionalprograms;
import Utility.Utility;
public class PrintThreeNames {
public static void main(String[] args)
{
	String fname, sname, tname;
	/*User input is taken three names */
	System.out.println("Enter first name");
	Utility utility = new Utility();
	fname = utility.inputString();
	System.out.println("Enter second name");
	sname = utility.inputString();
	System.out.println("Enter third name");
	tname = utility.inputString();
	//in print statement hi is concatenated and names are displayed.
	System.out.println("Hi " +fname +", " +sname+ "and " +tname);
}
}
