package Algorithmprograms;

import java.io.*;


import Utility.Utility;
public class WordSearch {

public static void main(String[] args) throws IOException
{

	
	String[] words=new String[5];
	Utility utility = new Utility();
	
	for(int i=0; i<5; i++)
	{
		System.out.println("words[" +i+ "]");
		words[i] = utility.inputString();
	}
	System.out.println("Enter word you want to search in file:");
	String search = utility.inputString();
	int in = utility.binSearch(search, words, 0, words.length);
	//String tr = utility.binSearch(search);
	if(in < 0)
	{
		System.out.println("word not found");
	}
	else
		System.out.println("Found at: " +in);
	//System.out.println(in);
	
	
}

}
