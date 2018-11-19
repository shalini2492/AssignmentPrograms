package Functionalprograms;

import Utility.Utility;

/*******************String replace*********************/

public class Username 
{
	public static void main(String[] args)
	   {
		  String template = "Hello <<username>> ! How are you?";
          String username="";
           
          Utility utility = new Utility();
          System.out.println("Enter your name");
          username = utility.inputString();
          
          String str = utility.replaceString(template, username);
          System.out.println(str);
       }
}