/**purpose: To perform operations on ordered singly linked list.
 * author: Shalini
 * date: 12/12/2018
 * version: 1.0
 */
package datastructureprograms;

import standardlibrary.BLStdOut;
import utility.Utility;

import java.io.File;
import java.util.Scanner;
public class OrderedList {
	static	MyLinkedList <Integer> list=new MyLinkedList<Integer>();
	static Scanner sc;
	public static void main(String[] args) throws Exception
	{
		String file_name="/home/hp/JavaPrograms/Javaprograms/src/datastructureprograms/demo";
		String readFile=Utility.readFromFile(file_name);
		String[] splitArray=readFile.split(" ", readFile.length());
		int count=0;
		System.out.println(readFile);
		sc=new Scanner(new File(file_name));
		
		while(sc.hasNextInt())
		{
			count++;
			// System.out.println(count);
			int s=sc.nextInt();
			//System.out.println(s);
		}
		sc = new Scanner(new File(file_name));
		int[] arr=new int[count];
		BLStdOut.print("\nElements are: ");
		for(int i=0; i<count; i++)
		{
			arr[i]=Integer.parseInt(splitArray[i]);
			list.add(arr[i]);
		}
		
		
		BLStdOut.print("\nThe sorted list is: \n");
		int[] sort=Utility.bubSort(arr);
		
		for(int i=0; i<count; i++)
		{
			System.out.println(sort[i]);
		}
		/*for(int i=1;i<arr.length;i++)
		{
			Utility.orderedList(arr[i], list);
		}*/
		//BLStdOut.print("\nLinked list elements are: ");
		//list.display();
	    
		BLStdOut.print("\nEnter a number you want to search in the list: ");
		Integer searchNo=Utility.inputInteger();
		if(! list.search(searchNo))
		{
			BLStdOut.print("The element is not in the list..so add it.");
			list.insertinSortedList(searchNo);			
		}
		else
		{
			BLStdOut.print("The element is in the list...so delete it.");
			int deletenumber = list.index(searchNo);
			list.pop(deletenumber);
			
		}
		BLStdOut.println("Linked list elements are: ");
	    list.display();
	}
}
