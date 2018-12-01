package algorithmprograms;

import java.util.Scanner;


import utility.Utility;

public class StringBinary {
public static void main(String[] args) 
{
	String search="";
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the no. of strings in an array");
    int x = Utility.inputInteger();
    String[] st = new String[x];
    System.out.println("Enter strings");
    for(int i=0; i<x; i++)
    {
    	st[i] = scanner.nextLine();
    }
    System.out.println("Strings: ");
    for(int i=0; i<x; i++)
    {
    	System.out.println(st[i]);
    }
    System.out.println("Enter string to be searched");
    search = Utility.inputString();
    Utility.searchStr(st, x);
    scanner.close();
    //System.out.println(tr);
}
}
