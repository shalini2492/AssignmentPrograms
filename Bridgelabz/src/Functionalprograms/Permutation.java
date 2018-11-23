package Functionalprograms;

import java.util.*;
import Utility.Utility;

public class Permutation {
 public static void main(String[] args)
 {
	 String ch[] = new String[10];
	 int currentindex=0;
	 Utility utility = new Utility();
	 System.out.println("Enter the string for permutation");
	String str = utility.inputString();
	System.out.println("Permutations for string " +str+ " are:" );
	 String[] st = utility.per(ch, currentindex);
	for(int i=0; i<currentindex; i++)
	{
	 System.out.println(st);
	}
 }
}
