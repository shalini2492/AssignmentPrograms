package datastructureprograms;

import standardlibrary.BLStdOut;

public class MyCircularLinkedList <T> 
{
	private Node<T> first;
	private Node<T> last;
	int count=0;
	public void add(T data)
	{
		if(first == null)
		{
			BLStdOut.print("Circular linked list is empty.");
			return;
		}
		else
			
			first=new Node<T>(data);
		    first=last;
		    count++;
		    return;
	}
	public int size()
	{
		return count;
	}
	public boolean isEmpty()
	{
		return (count==-1);
	}
	public void pop()
	{
		Node<T> current_node=first;
		
	}
}
