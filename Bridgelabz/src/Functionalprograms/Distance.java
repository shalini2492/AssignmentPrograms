package Functionalprograms;

import java.util.Scanner;
import Utility.Utility;

public class Distance {
public static void main(String[] args)
{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the coordinates");
	
	int i = scanner.nextInt();
	int j = scanner.nextInt();
	Utility utility = new Utility();
	utility.dist(i, j);
}
}
