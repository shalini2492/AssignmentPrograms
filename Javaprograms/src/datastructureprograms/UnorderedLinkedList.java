package datastructureprograms;

import java.io.BufferedReader;

import standardlibrary.BLStdOut;
import utility.Utility;
public class UnorderedLinkedList {
public static void main(String[] args) throws Exception
{
	MyLinkedList<String> myList=new MyLinkedList<String>();
	String fileName="/home/hp/JavaPrograms/Javaprograms/src/datastructureprograms/demo";
	String read=Utility.readFromFile(fileName);
	String[] splitFile=read.split(" ");
	for(int i=0; i<splitFile.length; i++)
	{
		myList.add(splitFile[i]);
	}
	BLStdOut.print("Elements of linked list: \n");
	myList.display();
	System.out.println();
	BLStdOut.print("Enter the element you want to search..");
	String searchData = Utility.inputString();
	if(! myList.search(searchData))
	{
		BLStdOut.print("The element you want to search is not in the list..");
		BLStdOut.print("\n So, we add " +searchData+ " to the list.");
		myList.add(searchData);
	}
	else
	{
		Integer deleteData=myList.index(searchData);
		myList.pop(deleteData);
	}
	BLStdOut.print("List of elements: ");
	myList.display();
}
}
