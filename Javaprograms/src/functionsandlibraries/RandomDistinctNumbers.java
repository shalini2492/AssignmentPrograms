package functionsandlibraries;
import java.util.Random;

import standardlibrary.BLStdOut;
import utility.Utility;
public class RandomDistinctNumbers {
public static void main(String[] args)
{
	/*BLStdOut.print("Enter the range you want random numbers from and to");
	int start=Utility.inputInteger();
	int end=Utility.inputInteger();*/
	int[] output=findDistinctRandomNumbers(1, 10);
	Utility.insertionSort(output);
	for(int i=0; i<output.length; i++)
	{
		System.out.println(output[i]);
	}
	

}
public static int[] findDistinctRandomNumbers(int start, int end)
{
	int n = end - start + 1;
	int[] a = new int[n]; //store random numbers
	for(int i=0; i<n; i++)
	{
		a[i]=i;
	}
	int[] output = new int[n]; //resultant array
	int x=n;
	Random ran=new Random();
	for(int i=0; i<n; i++)
	{
		int p = ran.nextInt(x);
		output[i]=a[p];
		a[p]=a[x-1];
		x--;
	}
	
	return output;
}
}












/*	Random random = new Random();
int[] arr=new int[10];
for(int i=0; i<10; i++)
{
	arr[i]=random.nextInt(10);
	
}
arr=Utility.insertionSort(arr);

for(int i=0; i<10; i++)
{
	for(int j=1; j>10; j++)
	{
		if(arr[i] == arr[j])
		{
			random=new Random();
			arr[i]=random.nextInt();
		}
		
	}
}
//arr=Utility.insertionSort(arr);
for(int i=0; i<10; i++)
{
System.out.println(arr[i]);
}*/
