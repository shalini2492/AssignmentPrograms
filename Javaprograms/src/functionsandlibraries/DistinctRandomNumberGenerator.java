package functionsandlibraries;
import java.util.Random;

import utility.Utility;
public class DistinctRandomNumberGenerator {
public static void main(String[] args)
{
	int array[]= {1,2,3,4,5,6,7,8,9};
	int  i, j, min, max, temp;
	min=0; 
	max=min+9;
	for(i=0; i<=9; i++)
	{
		temp=(int) Math.random()%10+min;
		for(j=0; j<=i-1; j++)
		{
			if(temp == array[j])
			break;
		}
		if(i == j)
		{
			array[i]=temp;
		}
		else
			i--;
	}
	for(i=0; i<=9; i++)
	{
		System.out.println(" "+array[i]);
	}
}
}
