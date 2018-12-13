package datastructureprograms;

import standardlibrary.BLStdOut;
import utility.Deque1;
import utility.Utility;

public class PalindromeUsingDeque <T> {	
public static void main(String[] args)
{
	Deque1<Character> deq=new Deque1<Character>();
	
	System.out.println("Enter string to check for palindrome: ");
	String string=Utility.inputString();

	for(int i=0;i<string.length();i++)
	{
		char c =string.charAt(i);
		
		deq.addToRear(c);
	}
	boolean flag=true;

	while(deq.size()>1)
	{
		if(deq.removeFront()!=deq.removeRear())
		{
			flag=false;
			break;
		}
	}
	if(flag==true)
	{
		BLStdOut.print("String is palindrome");
	}
	else
	{
		BLStdOut.println("String is not palindrome");
	}
}
}
