package Functionalprograms;

import java.util.*;
import Utility.Utility;

	public class FlipCoin {
		public static void main(String[] args)
		{
			Utility utility = new Utility();
			System.out.println("Enter no. of times to flip a coin");
			int n = utility.InputInteger();
			utility.HeadorTail(n);
		}
	}

