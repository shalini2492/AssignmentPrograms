package Functionalprograms;
import Utility.Utility;

/*******************String replace*********************/

public class Username {
	public static void main(String[] args)
	{
		  String template="Hello <<username>> ! How are you?";
  String username="";

  Utility utility= new Utility();
  utility.InputString();
  utility.InputInteger();
  utility.replaceString(template, username);
  }
}