package algorithmprograms;

import java.util.Scanner;

import utility.Utility;
public class TaskStatus {
public static void main(String[] args)
{
	int n=10;
	String status;
	String[] dline= new String[n];
	String[] t = new String[n];
	int[] min = new int[n];
	System.out.println("Enter the tasks in the list array");
	Scanner sc = new Scanner(System.in);
	
	for(int i=0; i<n; i++)
	{
	t[i] = sc.nextLine();
	}
	
	System.out.println("Enter the deadline for task");
	for(int i=0; i<n; i++)
	{
	dline[i] = sc.nextLine();
	}
	System.out.println("Enter time in minutes to accomplish the task");
	for(int i=0; i<n; i++)
	{
	min[i] = sc.nextInt();
	}
	for(int i=0; i<n; i++)
	{
		System.out.println(t[i]+ "|" +dline[i]+ "|" +min[i]);
	}
	Utility.displayList(t, dline, min);
	sc.close();
}
}
