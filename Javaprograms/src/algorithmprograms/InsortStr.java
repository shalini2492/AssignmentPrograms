package algorithmprograms;

import java.util.Scanner;

import utility.Utility;

public class InsortStr {
public static void main(String[] args)
{
	int size;
	System.out.println("Enter the size");
	size = Utility.inputInteger();
	String[] st = new String[size]; /*= {"PHP", "Java", "AngularJS", "ReactJS", "Python"};*/
    Utility utility = new Utility();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter elements:");
    for(int i=0; i<size; i++)
    {
    	st[i]= sc.nextLine();
    }
    System.out.println("Elements are:");
    for(int i=0; i<size; i++)
    {
    	System.out.println(st[i]);
    }
    System.out.println("Array after sorting:");
    for(int i=0; i<size; i++)
    {
    Utility.insortStr(st); 
    System.out.println(st[i]);
    }
    sc.close();
}
}
