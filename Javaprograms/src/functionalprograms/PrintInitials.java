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
						showPatterns("/home/hp/JavaPrograms/Javaprograms/wpattern", 1, 11);
					}
					
		case 'd':
		case 'w':
		}
	}while(inputInitial=='k' && inputInitial=='d' && inputInitial=='w');
	
}
	
	public static void showPatterns(String fileName, int startLine, int endLine) 
    {
       String str = " ";
       
       String newstr = " ";
       
       String newstr1 = " ";
       
        int currentLine = 1;

        try {
        
        	BufferedReader br = new BufferedReader (new FileReader(fileName));                
            
        	//read to startLine
            
        	while(currentLine < startLine) 
            
        	{
           
        		if (br.readLine()==null)
                
        		{
                
        			System.out.println("File too small");
                
        		}
        		
                 currentLine++;
             }        
             
        	//read until endLine
            
        	while(currentLine <= endLine) 
            
        	{
               String  line = br.readLine();
            
                 if (line == null) 
                 
                 {
                     return;
                 
                 }
                 
              //   System.out.println(line);
                 
                 currentLine++;
                 
                 str = line;
                 
               //  System.out.println(str);
                 
                 newstr = str.replaceAll("1", "*");
                 
                 newstr1 = newstr.replaceAll("0", " ");

                 System.out.println(newstr1);
             }
        	
        	
         } 
         
        catch (IOException ex) 
        
        {
        
        	System.out.println("Problem reading file.\n" + ex.getMessage());
         } 
        
   }                    
            
}



