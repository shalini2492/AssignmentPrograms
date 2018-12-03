/**purpose: To find given word from a specified file
 * author: Shalini
 * date: 2/12/2018
 * version: 1.0
 */
package algorithmprograms;

import utility.Utility;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class WordSearch 
{
	public static void main(String[] args) throws Exception
	{
		int first=0;
		int last=0;
		String [] words = new String[100];
		Scanner sc = new Scanner(System.in);
		FileReader f = new FileReader("/home/hp/JavaPrograms/Javaprograms/bin/algorithmprograms/abcd.txt");
		BufferedReader br = new BufferedReader(f);
		String file;
		String[] splitArray = new String[100];
		System.out.print("Enter word to search for: ");
		String word = Utility.inputString();

		while((file=br.readLine()) != null)
		{
			System.out.println(file);
			
			splitArray = file.split(",");
			
		}
	
		for(int i=0; i<splitArray.length; i++)
		{
			System.out.println(splitArray[i]);
		}
		for(int i=0; i<splitArray.length; i++)
		{
		if(splitArray[i].contains(word))
		{
			System.out.println(word+ " Found");
		}
		else
			System.out.println();
		}
		//System.out.println("Not found");
	
		/*for(int i=0; i<5; i++) 
		{
			System.out.print("words["+i+"]: ");
			words[i] = Utility.inputString();
		}*/
		
		Utility.binSearch(splitArray, first, last);
		

	
	   
		   

     }	
}
	  



		
	
	
/*String search;
System.out.println("Enter the word you are looking for: ");
search = Utility.inputString();
FileReader fr=new FileReader("/home/hp/JavaPrograms/Javaprograms/bin/algorithmprograms/abcd.txt");
BufferedReader br=new BufferedReader(fr);
String s;
int linecount=0;
String line;
String words[]=new String[500];
	
	
 System.out.println("\n");

line=s;

System.out.println(line);

int idx=0;

StringTokenizer st= new StringTokenizer(line);

tokencount= st.countTokens();

System.out.println("\n");

System.out.println("Number of tokens found" +tokencount); 
System.out.println("\n");                                             

for (idx=0;idx<tokencount;idx++)                                                                                                    {

words[idx]=st.nextToken();

System.out.println(words[idx]);*/

	
	
	

