package Functionalprograms;

import java.util.*;
import Utility.Utility;

public class Distance {
public static void main(String[] args)
{
	int x, y;
	System.out.println("Enter the coordinates");
	Scanner scanner = new Scanner(System.in);
	x = scanner.nextInt();
	y = scanner.nextInt();
	Utility utility = new Utility();
	utility.dist();
}
}
