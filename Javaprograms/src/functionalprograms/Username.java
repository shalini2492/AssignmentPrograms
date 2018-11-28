package functionalprograms;

import utility.Utility;

/*******************String replace*********************/

public class Username 
{
	public static void main(String[] args)
	   {
		  String template = "Hello <<username>> ! How are you?";
          String username="";
           
          System.out.println("Enter your name");
          username = Utility.inputString();
          
          Utility.replaceString(template, username);
          //System.out.println(str);
       }
}