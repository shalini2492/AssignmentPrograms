package datastructureprograms;

import standardlibrary.BLStdOut;

public class MyCircularLinkedList <T> 
{
	private Node<T> first;
	private Node<T> last;
	int count=0;
	public void addToFront(T data)
	{
		Node<T> newNode = new Node<T>(data);
		if(first == null)
		{
			first=newNode;
			count++;
			return;
		}
		else
			
			first=new Node<T>(data);
		    first=last;
		    count++;
		    return;
	}
	public void addAtEnd(T data)
	{
		Node<T> newNode = new Node<T>(data);
		if(first == null)
		{
			first = newNode;
			count++;
			return;
		}
		else
			last=last.next;
		if(last.next == first.pre)
		{
			last=newNode;
			first=newNode.next;
			last.next=newNode.pre;
			count++;
			return;
		}
	}
	public void deleteAtFirst(T data)
	{
		Node<T> temp=first;
		temp = first.next;
		last.next=first.next.pre;
		count--;
		return;
	}
	public void deleteAtEnd(T data)
	{
		Node<T> temp=first;
		while(last.next != null)
		{
			temp=temp.next;
		}
		temp.pre.next=first.pre;
		temp.pre=null;
		count--;
		return;
	}
	public int size()
	{
		return count;
	}
	public boolean isEmpty()
	{
		return (count==0);
	}
	public void pop()
	{
		Node<T> current_node=first;
		while(last.next != current_node)
		{
			current_node=current_node.next;
		}
		current_node.pre=current_node.next.next;
		current_node.pre.next=current_node.next.pre;
		count--;
		return;
		
	}
	  public boolean search(T data)
	    {
	    	Node<T> temp=first;
	    	for(int i=0; i<size(); i++)
	    	{
	    		if(temp.data == data)
	    		{
	    			return true;
	    		}
	    	}
	    	return false;
	    }
	public void show()
	{
		Node<T> currentNode = first;
		for(int i=0; i<size(); i++)
		{
		    BLStdOut.println(currentNode+" ");
			currentNode=currentNode.next;
		}
	}
}
