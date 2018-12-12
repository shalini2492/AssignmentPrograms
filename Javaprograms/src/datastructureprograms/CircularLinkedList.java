package datastructureprograms;

import standardlibrary.BLStdOut;
import utility.Utility;

public class CircularLinkedList
{
	static MyCircularLinkedList<String> circularLinkedList = new MyCircularLinkedList<String>();
	public static void main(String[] args) throws Exception
	{
		String fileName="/home/hp/JavaPrograms/Javaprograms/src/datastructureprograms/demo";
		String k = Utility.readFromFile(fileName);
		String[] splitFile=k.split(" ");
		for(int i=0; i<splitFile.length; i++)
		{
			circularLinkedList.addAtEnd(splitFile[i]);
		}
		BLStdOut.print("\nEnter the element you want to add in the beginning ");
		String addElement=Utility.inputString();
		circularLinkedList.addToFront(addElement);
		circularLinkedList.show();
		BLStdOut.print("\nEnter the element you want to add at the end ");
		String add=Utility.inputString();
		circularLinkedList.addAtEnd(add);
		circularLinkedList.show();
		BLStdOut.print("\nEnter the element you want to search in the list..");
		String searchNumber=Utility.inputString();
		if(! circularLinkedList.search(searchNumber))
		{
			BLStdOut.print("\nThe element "+searchNumber+" is not in the list, so we add it in the list.");
			circularLinkedList.addAtEnd(searchNumber);
			circularLinkedList.show();
		}
		else
		{
			BLStdOut.print("\nThe element is present in the list, so we delete it.");
			circularLinkedList.pop();
			circularLinkedList.show();
		}
}
}
