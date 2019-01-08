package standardlibrary;
import java.util.ArrayList;
import java.util.Arrays;

public class StringFunctions {
	/*************************Check for Anagram****************************/

	/* This method will check if two strings are anagram or not. Each character of first string is compared to each
	 * character of second string and then output is generated based on true or false condition.
	 * 
	 */

	public static void checkAnagram(String str1, String str2)
	{
		ArrayList<Integer> array=new ArrayList<Integer>();
		array.add(10);
		 int len, len1, len2, i, j, found=0, not_found=0;
		 len1 = str1.length();
	        len2 = str2.length();
			
	        if(len1 == len2)
	        {
	            len = len1;
	            for(i=0; i<len; i++)
	            {
	                found = 0;
	                for(j=0; j<len; j++)
	                {
	                    if(str1.charAt(i) == str2.charAt(j))
	                    {
	                        found = 1;
	                        break;
	                    }
	                }
	                if(found == 0)
	                {
	                    not_found = 1;
	                    break;
	                }
	            }
	                if(not_found == 1)
	                {
	                	System.out.print("Given strings are not Anagram");
	                }
	                else
	                {
	                	System.out.print("Given strings are Anagram");
	                }
	        }
	        else
	        {
	            System.out.print("Both strings must of equal length to be an anagram");
	        }
	}

	/*********************************String Permutation in iterative way***************************/
	/**This method is used to return permutations of a string in an iterative way
	 * @param str user input string
	 */
	public static void perString(String str)
	{
	
		char[] temp = str.toCharArray();
	    // Step 1. Sort the string
	    Arrays.sort(temp);
	    System.out.println("String " + String.valueOf(temp));
	    int index = 0;
	    int lowest = 0;
	    while(true){
	        // Step 2. Rightmost char smallest than its neighbor
	        for(int i = 0; i < temp.length - 1; i++){
	            if(temp[i] < temp[i+1]){
	                lowest = i;               
	            }
	        }
	        // index of CHAR1
	        index = lowest;
	        // Step3. Find the ceiling of the 
	        int j = findCeiling(temp, index);
	        // Breaking condition at this juncture
	        // all permutations are printed
	        if(j == index) break;
	        
	        swap(temp, index, j);
	        String a = String.valueOf(temp);
	        // Step4. Sort the substring
	        char[] b = a.substring(index + 1).toCharArray();
	        Arrays.sort(b);
	        a = a.substring(0, index + 1) + String.valueOf(b);
	        temp = a.toCharArray();
	        System.out.println( "String " + String.valueOf(temp));
	        //}
	    }                        
	}

	/**This method is used to find the ceiling of the 'CHAR1' starting from the index of the 'CHAR1', ceiling 
	 * here means starting from the index of the 'CHAR1' you have to find the smallest character which is greater
	 * than the 'CHAR1'. Let's call this char as 'CHAR2'. If CHAR2 > CHAR1 then swap these characters and repeat the
	 * above steps to find all the permutations.
	 * @param temp character array of which we need all the permutations
	 * @param index location of an element.
	 * @return permutation of string
	 */
	public static int findCeiling(char[] temp, int index){
	    int k = index;
	    char test = temp[index];
	    while (k < temp.length - 1){
	        if(temp[index] < temp[k + 1]){
	            index = k + 1;
	            break;
	        }
	        k++;
	    }
	    k = index;
	    while (k < temp.length - 1){
	        if((temp[index] > temp[k + 1]) && (temp[k + 1] > test)){
	            index = k + 1;
	        }
	        k++;
	    }
	    return index;
	}

	/**
	 * Method used for swapping the char
	 * @param str String of which characters are swapped
	 * @param i first index
	 * @param j second index
	 */
	private static void swap(char[] str, int i, int j){
	    char temp = str[i];
	    str[i] = str[j];
	    str[j] = temp;
	}
	
	/**************************************String Permutation using recursion****************************/

	/**This method will return all the permutations of string using recursive method
	 * @param inputString user input string
	 */
	public static void permutation(String inputString) 
	{
		String permuteString="";
		permuteString(permuteString,inputString);
	   
	}

	/**This method will return all the permutations of string
	 * @param permuteString permutation of string
	 * @param inputString user input string
	 */
	public static void permuteString(String permuteString, String inputString) 
	{
		if (inputString.length() == 0) 
		{
			System.out.println(permuteString);
		} 
		else 
		{
			for (int i = 0; i < inputString.length(); i++) 
			{
				permuteString(permuteString + inputString.charAt(i),inputString.substring(0, i) + inputString.substring(i + 1, inputString.length()));
			}
	    }
	}
	
	/*********************************Check given string is palindrome****************************/

	/**This method will check if given string is palindrome or not.
	 * @param str user input string
	 */
	public static void chkPalindrome(String str)
	{
		String reverseString = "";
		int length = str.length();
		for(int i=length-1; i>=0; i--)
		{
			reverseString = reverseString + str.charAt(i);
		}
		if(str.equals(reverseString))
		{
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Given string is not palindrome");
		}
	}

	/**************************************Strings are equal**********************************/

	/**This method will return true if given two strings are equal
	 * @param string1 first input string
	 * @param string2 second input string
	 * @return boolean value
	 */
	public static boolean areEqual(String string1, String string2)
	{
		return(string1.length() == string2.length()) &&
				((string1 + string1).indexOf(string2) != -1);
	}

}
