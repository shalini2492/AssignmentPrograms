/*purpose: To print the star pattern for the given initials.
 * author: Shalini
 * date: 28/11/2018
 * version: 1.0
 */
package functionalprograms;
import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import utility.Utility;

public class PrintInitials 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String str=br.readLine();
		char inputInitial=0;
		str=" "+str;
		int length=str.length();
		char[] temporary = new char[length];
		for (int i=0; i<length; i++)
		{
			char t = str.charAt(i);
			if(t == ' ')
			{
				temporary[i]=str.charAt(i+1);
				System.out.println(temporary[i]+ " ");
			}
		}
		do
		{
		switch(inputInitial)
		{
		case 'k':
					String kPattern;
					while((kPattern=br.readLine()) != null)
					{
						Utility.showPatterns("/home/hp/JavaPrograms/Javaprograms/initials", 1, 11);
						
					}
					break;
		case 'd':
			String dPattern;
			while((dPattern=br.readLine()) != null)
			{
				Utility.showPatterns("/home/hp/JavaPrograms/Javaprograms/initials", 13, 23);
				
			}
			break;
		case 'w':
			String wPattern;
			while((wPattern=br.readLine()) != null)
			{
				Utility.showPatterns("/home/hp/JavaPrograms/Javaprograms/initials", 25, 34);
				
			}
			break;
		}
	}while(inputInitial=='k' && inputInitial=='d' && inputInitial=='w');
	
}
	
	
            
}



