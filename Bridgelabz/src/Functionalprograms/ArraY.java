package Functionalprograms;
 import Utility.Utility;
public class ArraY {
public static void main(String[] args)
{
	int[] arr = new int[100];
	Utility utility = new Utility();
	boolean c = utility.findRepeatedNo(arr);
	System.out.println(c);
}
}
