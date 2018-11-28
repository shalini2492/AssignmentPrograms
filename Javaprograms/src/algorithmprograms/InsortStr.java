package algorithmprograms;

import java.util.Scanner;

import utility.Utility;

public class InsortStr {
public static void main(String[] args)
{
	String[] st = new String[5]; /*= {"PHP", "Java", "AngularJS", "ReactJS", "Python"};*/
    Utility utility = new Utility();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter elements:");
    for(int i=0; i<5; i++)
    {
    	st[i]= sc.nextLine();
    }
    System.out.println("Elements are:");
    for(int i=0; i<4; i++)
    {
    	System.out.println(st[i]);
    }
    System.out.println("Array after sorting:");
    String[] s = utility.insortStr(st); 
    System.out.println(s);
}
}
