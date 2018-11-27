package Functionalprograms;

import Utility.Utility;
public class RollDie {
	public static void main(String[] args)
	{
       int i=6;
       int roll = (int) (Math.random() * i) + 1;
       System.out.println(roll);
	}
}
