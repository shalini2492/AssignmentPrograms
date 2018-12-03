/* purpose: To perform various operations on string.
 * author: Shalini
 * date: 29/11/2018
 * version: 1.0
 */
package lib;
import functionsandlibraries.BLStdOut;
import java.util.Scanner;

import functionsandlibraries.StringFunctions;
import utility.Utility;
public class StringFunctionsMain {
public static void main(String[] args)
{
	String string1, string2;
	BLStdOut.println("Enter first string");
	string1 = Utility.inputString();
	BLStdOut.println("Enter second string");
	string2 = Utility.inputString();
	 Scanner scan = new Scanner(string1);
     Scanner sc = new Scanner(string2);
     String result = "";
     while(scan.hasNext()) {
         result += scan.next();
     }
     BLStdOut.println(result);
     String result1 = "";
     while(sc.hasNext())
     {
    	 result1 += sc.next();
     }
     System.out.println(result1);
     scan.close();
     sc.close();
	
	//System.out.println(string2);
	System.out.println("1. Check Anagram\n2. Check Palindrome\n3. String permutation using iteration\n4. String permutation using recursion\n5. Check for equal strings");
	System.out.println("Enter the choice");
	int choice = Utility.inputInteger();
	do
	{
		switch(choice)
		{
			case 1: StringFunctions.checkAnagram(result, result1);
			        break;
			case 2: StringFunctions.chkPalindrome(result);
			        break;
			case 3: StringFunctions.perString(result);
			        break;
			case 4: StringFunctions.permutation(result);
			        break;
			case 5: StringFunctions.areEqual(result, result1);
			        if(Utility.areEqual(result, result1))
			        	System.out.println("Strings are equal");
			        else
			        	System.out.println("Strings are not equal");
			        break;
	   }
   }while(choice < 1 && choice > 5);
	
}
}
