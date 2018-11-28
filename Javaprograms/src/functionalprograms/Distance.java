package functionalprograms;



import utility.Utility;

public class Distance {
public static void main(String[] args)
{
	
	System.out.println("Enter the coordinates");
	
	int i = Utility.inputInteger();
	int j = Utility.inputInteger();
	Utility.dist(i, j);
}
}
