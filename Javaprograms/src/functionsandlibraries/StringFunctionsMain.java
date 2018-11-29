/* purpose: To perform various operations on string.
 * author: Shalini
 * date: 29/11/2018
 * version: 1.0
 */
package functionsandlibraries;
 
import utility.Utility;
public class StringFunctionsMain {
public static void main(String[] args)
{
	String string1, string2;
	System.out.println("Enter first string");
	string1 = Utility.inputString();
	System.out.println("Enter second string");
	string2 = Utility.inputString();
	System.out.println("1. Anagram\n2. Palindrome\n3. String permutation using iterative method\n4. String permutation using recursive method\n5. String arrays are equal");
	
	System.out.println("Enter choice");
	int choice = Utility.inputInteger();
	
	switch(choice)
	{
	case 1: StringFunctions.checkAnagram(string1, string2);
	        break;
	case 2: StringFunctions.chkPalindrome(string1);
	        break;
	case 3: StringFunctions.perString(string1);
	        break;
	case 4: StringFunctions.permutation(string1);
	        break;
	case 5: StringFunctions.areEqual(string1, string2);
	        if(Utility.areEqual(string1, string2))
	        	System.out.println("Strings are equal");
	        else
	        	System.out.println("Strings are not equal");
	        break;
	}
}
}
