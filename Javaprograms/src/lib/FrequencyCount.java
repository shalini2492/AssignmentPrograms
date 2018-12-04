package lib;

import utility.Utility;
import java.util.Scanner;

import functionsandlibraries.BLStdOut;
import functionsandlibraries.BLStdIn;
public class FrequencyCount {
public static void main(String[] args)
{
	
    String key="";
	Scanner sc=new Scanner(System.in);
	String[] strArray=new String[100];
	int value=0;
	System.out.println("Enter a string");
	for(int i=0; i<strArray.length;i++)
	{
		strArray[i]=sc.nextLine();
	}
	String[] splitt = key.split(" ");
	for(int i=0; i<splitt.length; i++)
	{
		if(splitt[i]==splitt[i+1])
		{
			value=value+1;
		}
	}
	//BLStdOut.println(key);
	/*for(int i=0; i<strArray.length; i++)
	{
	Utility.mergeSort(strArray);
	System.out.println(strArray[i]);
	}
	System.out.println(key+ " " +value);*/
}
}
