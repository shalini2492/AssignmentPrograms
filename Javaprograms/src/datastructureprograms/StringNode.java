package datastructureprograms;

import utility.Utility;
public class StringNode
{
	public String data;
	public StringNode next;
	public StringNode(String data, StringNode next) 
	{
		this.data = data;
		this.next = next;
	}
	public String toString()
	{
		return data;
	}
}

/*public class Node<T> {

T head;
T data;
Node<T> next;
Node<T> pre;


/*public T Node()
{
	
}
Node(T d)
{
	data=d;
}
public T getData()
{
	return data;
}
public void setData(T data)
{
	this.data=data;
}
public Node getNext()
{
	return next;
}
public void setNext()
{
	this.next=next;
}
}*/
