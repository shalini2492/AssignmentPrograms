package datastructureprograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintSecondString {
public static void main(String[] args) throws Exception
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String st;
	st=br.readLine();
	String[] s=st.split(" ");
	System.out.println("Splitted string...");
	for(int i=0; i<s.length; i++)
	{
		System.out.println(s[i]);
		System.out.println("last second word: "+s[s.length-2]);
	}
}
}
