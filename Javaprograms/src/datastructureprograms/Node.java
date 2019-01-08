package datastructureprograms;

public class Node<T> {

T front;
T data;
Node<T> next;
Node<T> pre;
int index;
Node(T data)
{
	
	this.data=data;
}
Node(T front, Node<T> next)
{
	this.front=front;
	this.next=next;
	
}


}
