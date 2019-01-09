package algorithmprograms;

import utility.Utility;

public class CheckAnagram {
	interface MyFunctionalInterface
	{
		public String checkA(String str);
	}
public static void main(String[] args)
{
	

		String str1;
     String str2;
     System.out.print("Enter First String : ");
     str1 = Utility.inputString();
     System.out.print("Enter Second String : ");
     str2 = Utility.inputString();
     MyFunctionalInterface f=str->Utility.checkAnagram(str1,str2);
     System.out.println(f.checkA(str1));
}
}
