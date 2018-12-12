package datastructureprograms;

import standardlibrary.BLStdOut;
import utility.Utility;
import java.util.Scanner;
public class OrderedList {
	static	MyLinkedList <Integer> list=new MyLinkedList<Integer>();
	public static void main(String[] args) throws Exception
	{
		String file_name="/home/hp/JavaPrograms/Javaprograms/src/datastructureprograms/demo";
		String readFile=Utility.readFromFile(file_name);
		String[] splitArray=readFile.split(" ");
		Scanner scan = new Scanner(readFile);
		Integer[] arr=new Integer[splitArray.length];
		
		BLStdOut.print("The sorted list is: ");
		String[] str=Utility.insortStr(splitArray);
		
		for(int i=0; i<splitArray.length; i++)
		{
			list.add(arr[i]);
		}
		for(int i=1;i<arr.length;i++)
		{
			Utility.orderedList(arr[i], list);
		}
		BLStdOut.print("\nLinked list elements are:");
		list.display();
	    BLStdOut.print("\n");
		BLStdOut.print("Enter a number you want to search in the list");
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
