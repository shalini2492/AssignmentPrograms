package Algorithmprograms;

import Utility.Utility;
import java.util.Scanner;

public class CheckAnagram {
public static void main(String[] args)
{
	String s1, s2;
	
	System.out.println("Enter two strings");
	Scanner scanner = new Scanner(System.in);
	s1 = scanner.nextLine();
	s2 = scanner.nextLine();
	Utility utility = new Utility();
	String str1 = utility.checkAnagram(s1, s2);
	System.out.println(str1);
}
}
