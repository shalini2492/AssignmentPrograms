package uti;

import DataStructureprograms.StringNode;
import java.util.*;
import java.io.*;

public class Utility {
	Scanner sc=new Scanner(System.in);
	public String data;
	public StringNode next;
	public void StringNode(String data, StringNode next) 
	{
		this.data = data;
		this.next = next;
	}
	public String toString()
	{
		return data;
	}
	public String readListFile(String file) throws Exception
	{
	     String[] st=new String[50];
	     String l = ""; //String taken to read file.
	     String readfile="/home/hp/Desktop/abcd.txt";
	     BufferedReader br = new BufferedReader(new FileReader(readfile));
	     while((l=br.readLine()) != null)
	     {
		      System.out.println(l); //file is read
		      st=readfile.split(" ");  //file is spilt into words
	     }
	     br.close();
	     return file;
	}
	public String inputString()
	{
		return sc.nextLine();
	}
}
