package Functionalprograms;

import java.util.*;
import Utility.Utility;

public class Permutation {
 public static void main(String[] args)
 {
	 String str;
	 int currentindex;
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter the string for permutation");
	 str = scanner.nextLine();
	 Utility utility = new Utility();
	 String st = utility.permutations(str, currentindex);
	 System.out.println(st);
 }
}
