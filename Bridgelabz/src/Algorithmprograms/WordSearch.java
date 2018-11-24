package Algorithmprograms;

import java.io.*;


import Utility.Utility;
public class WordSearch {

public static void main(String[] args) throws IOException
{

	String search;
	Utility utility = new Utility();
	System.out.println("Enter word you want to search in file");
	search=utility.inputString();
	String tr = utility.binSearch(search);
	System.out.println(tr);
	
	
}

}
