package datastructureprograms;

import standardlibrary.BLStdOut;
import utility.Utility;
import java.util.Scanner;
public class Hashing {
public static void main(String[] args)
{        
	int size;
	MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
	BLStdOut.print("Enter the size of array: ");
	size=Utility.inputInteger();
	int[] array=new int[size];
	BLStdOut.print("Enter the elements: ");
	for(int i=0; i<size; i++)
	{
		array[i]=Utility.inputInteger();
	}
	BLStdOut.print("The elements are: ");
    for(int i=0; i<size; i++)
    {
    	System.out.println(array[i]);
    }
    for(int i=0; i<size; i++)
    {
    	int k;
    	k=array[i]%(size+1);
    	System.out.println("Result: " +k);
    	myList.insert(k, array[k]);
    	System.out.println("Slot " +i+" "+array[i]);
    	myList.insert(k, array[k]);
    }
    
   /* for(int i=0; i<size; i++)
    {
    	int[] kk=new int[size];
    	
    	System.out.println("Slot "+i+ " "+kk[i]);
    }*/
}
}

