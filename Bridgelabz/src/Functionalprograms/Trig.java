package Functionalprograms;
 

public class Trig {
public static void main(String[] args)
{
	double angle=90;
	
	//Utility utility = new Utility();
	//System.out.println("Enter the angle: ");
	angle = Math.toDegrees(angle);
	double a = Math.sin(Math.toRadians(angle));
	
	System.out.println("Sine value of angle " +angle+ " is " +a);
	System.out.println("Cosine value of angle " +angle+ " is " +a);
}
}
