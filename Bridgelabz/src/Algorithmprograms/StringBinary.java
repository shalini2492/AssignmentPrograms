package Algorithmprograms;

import Utility.Utility;
import java.util.*;

public class StringBinary {
public static void main(String[] args)
{
	String search;
    int start, end;
	Utility utility = new Utility();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the no. of strings in an array");
    int x = utility.inputInteger();
    String[] st = new String[x];
    System.out.println("enter strings");
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
    search = utility.inputString();
    String[] tr = utility.searchStr(st);
    System.out.println(tr);
}
}
