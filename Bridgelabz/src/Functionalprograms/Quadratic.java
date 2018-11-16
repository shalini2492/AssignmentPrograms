package Functionalprograms;

import java.util.*;
import Utility.Utility;
public class Quadratic {
public static void main(String[] args)
{
	double k, root1, root2;
	int a, b, c;
	String s = "delta = b*b - 4 a*c";
	System.out.println("Given quadratic equation: ax^2+bx+c");
    Scanner scanner = new Scanner(System.in);
	System.out.println("Enter value of a");
	a = scanner.nextInt();
	System.out.println("Enter value of b");
	b = scanner.nextInt();
	System.out.println("Enter value of c");
	c = scanner.nextInt();
	System.out.println("Given quadratic equation:" +a+ "x^2+ " +b+ "x+ " +c);
	
	Utility utility = new Utility();
	String s1 = utility.quad(a, b, c);
	System.out.println(s1);
	k = b ^ 2 - 4 * a * c;
}
}
