package datastructureprograms;

import standardlibrary.BLStdOut;
import utility.Utility;
import java.util.Scanner;
public class OrderedList {
	static	MyLinkedList <Integer> list=new MyLinkedList<Integer>();
	static Scanner sc;
	public static void main(String[] args) throws Exception
	{
		String file_name="/home/hp/JavaPrograms/Javaprograms/src/datastructureprograms/demo";
		String readFile=Utility.readFromFile(file_name);
		//String[] splitArray=readFile.split(" ");
		
		int count=0;
		//int[] p = new int[splitArray.length];
		sc=new Scanner(readFile);
		while(sc.hasNextInt())
		{
			count++;
			int s=sc.nextInt();
		}
		sc = new Scanner(readFile);
		int[] arr=new int[count];
		BLStdOut.print("Elements are: ");
		for(int i=0; i<count; i++)
		{
			System.out.print(arr[i]+ " ");
			list.add(arr[i]);
			
		}
		
		
		BLStdOut.print("The sorted list is: ");
		int[] sort=Utility.bubSort(arr);
		
		for(int i=0; i<count; i++)
		{
			System.out.println(sort[i]);
		}
		/*for(int i=1;i<arr.length;i++)
		{
			Utility.orderedList(arr[i], list);
		}*/
		BLStdOut.print("\nLinked list elements are:");
		list.display();
	    BLStdOut.print("\n");
		BLStdOut.print("Enter a number you want to search in the list: ");
		Integer searchNo=Utility.inputInteger();
		if(list.search(searchNo))
		{
			int deletenumber = list.index(searchNo);
			list.pop(deletenumber);
		}
		else
		{
			Utility.orderedList(searchNo, list);
		}
		BLStdOut.println("Linked List Numbers are :");
	    list.display();
	}
}
