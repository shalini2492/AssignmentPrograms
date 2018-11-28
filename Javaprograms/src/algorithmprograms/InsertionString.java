package algorithmprograms;

import java.util.Scanner;

import utility.Utility;

public class InsertionString {
public static void main(String[] args)
{
	Utility utility=new Utility();
	String[] words = new String[5];
	for(int i=0;i<5;i++)
	{
		System.out.println("words["+i+"]: ");
		words[i]= utility.inputString();
	}
	
	System.out.println("The Sorted List is:");
	for(int i=0;i<5;i++)
	{
		Utility.sortString(words);
		System.out.println(words[i]);
	}
}
}
