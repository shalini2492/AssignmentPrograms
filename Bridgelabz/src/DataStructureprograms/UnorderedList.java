package DataStructureprograms;
import java.util.ArrayList;

import Utility.Utility;
public class UnorderedList {
public static void main(String[] args)
{
	LinkLIst<String> l = new LinkLIst<String>();
	Utility utility= new Utility();
	String file = "filepath";
	String readfile = readfromFile(file);
	String noarr[]=readFile.split(" ");
	for(int i=0; i<noarr.length;i++)
	{
		l.add(noarr[i]);
	}
	l.display();
	
	int d;
	Node head;
	int range, data;
	Node next;
	System.out.println("Enter the range of linked list");
	Utility utility = new Utility();
	range=utility.inputInteger();
	System.out.println("Enter the elements in linked list");
	for(int i=0; i<range; i++)
	{
	d=utility.inputInteger();
	}
	System.out.println("Enter the data to be added");
	data = utility.inputInteger();
	
}
}
