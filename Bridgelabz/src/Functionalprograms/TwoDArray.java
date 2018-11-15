package Functionalprograms;

import java.util.*;
import Utility.Utility;

public class TwoDArray {
public static void main(String[] args)
{
	public int[2][2] a = new int[2][2];
	public double[2][2] b = new double[2][2];
	public boolean[2][2] c = new boolean[2][2];
	
	
	
	for(int i=0; i<5; i++)
	{
		for(int j=0; j<5; j++)
		{
			System.out.println(a[i][j]);
		}
	}
	for(int i=0; i<5; i++)
	{
		for(int j=0; j<5; j++)
		{
			
			System.out.println(b[i][j]);
		}
	}
	for(int i=0; i<5; i++)
	{
		for(int j=0; j<5; j++)
		{
			
			System.out.print(c[i][j]);
		}
	}
Utility utility = new Utility();
utility.twodarr();
}
}
