package functionalprograms;

import utility.Utility;

public class Permutation {
static int count=0;
	public static void main(String[] args)
 {
	
		System.out.println("Enter the string: ");
		String inputString = Utility.inputString();
		Utility.permutation(inputString);
 }
}
