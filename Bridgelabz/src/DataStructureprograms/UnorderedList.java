package DataStructureprograms;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import Utility.Utility;
public class UnorderedList {
public static void main(String[] args) throws Exception
{
	String w;
	LinkLIst<String> l = new LinkLIst<String>();
	Utility utility= new Utility();
	String file = "/home/hp/Desktop/abcd.txt";
	String readfile = l.readfromFile(file);
	
	String noarr[]=readfile.split(" ");
	for(int i=0; i<noarr.length; i++)
	{
		l.add(noarr[i]);
	}
	l.display();
	System.out.println("Elements in linked list are:");
    l.display();
	System.out.println("Enter the word to search in file");
	w=utility.inputString();
	l.searchItem(w);
	for(int i=0; i<noarr.length; i++)
	{
		if(noarr[i] == w)
		{
			l.remove(w);
		}
		else
			l.add(w);
		
	}
}


}
