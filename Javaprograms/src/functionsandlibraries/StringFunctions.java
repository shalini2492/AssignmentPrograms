package functionsandlibraries;

import java.util.Arrays;

public class StringFunctions {
	/*************************Check for Anagram****************************/

	/* This method will check if two strings are anagram or not. Each character of first string is compared to each
	 * character of second string and then output is generated based on true or false condition.
	 * 
	 */

	public static void checkAnagram(String str1, String str2)
	{
		/*if(s1.replaceAll(" ", "").length() == s2.replaceAll(" ", "").length())
		  {
		            char[] char1 = s1.toLowerCase().toCharArray();
			        char[] char2 = s2.toLowerCase().toCharArray();
		
		            Arrays.sort(char1);
		            Arrays.sort(char2);
		
	   if(Arrays.equals(char1, char2))
	   	     {
			       System.out.println("Given strings are anagram");
		     }
	   else 
		           System.out.println("Given strings are not anagram");
			
	     }
		return s1;*/
		
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

	/**
	 * 
	 * @param temp
	 * @param index
	 * @return
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
	 * @param str
	 * @param i
	 * @param j
	 */
	private static void swap(char[] str, int i, int j){
	    char temp = str[i];
	    str[i] = str[j];
	    str[j] = temp;
	}
		
		
		
	    /* char[] a = s.toCharArray();
	      int n = s.length();
	      char[] st = new char[n];
	      int i=1;
	      while(i<n)
	      {
		      if(st[1] < i)
		      {
			       int j = ((i % 2) == 0) ? 0 : st[i];
			       swap(s, i, j);
			       System.out.println(join(s));
			       st[i]++;
			       i = 1;
		      }
		      else
		      {
		    	  st[i]=0;
		    	  i++;
		      }
	      }
	}
	public static String join(char[] s)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		return sb.toString();
	}

	public static void swap(char[] a, int i, int j)
	{
		String temp="";
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}*/
	
	/**************************************String Permutation using recursion****************************/

	public static void permutation(String inputString) 
	{
		String permuteString="";
		permuteString(permuteString,inputString);
	   
	}

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

	public static boolean areEqual(String string1, String string2)
	{
		return(string1.length() == string2.length()) &&
				((string1 + string1).indexOf(string2) != -1);
	}

}
