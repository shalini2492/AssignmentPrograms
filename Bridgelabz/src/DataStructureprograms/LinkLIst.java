package DataStructureprograms;

import Utility.Utility;

public class LinkLIst<T> {
Node<T> head;
Node<T> data;
int count=0;

Node<T> n = new Node();
public void add(T data)
{
	
	head = a;
	if(n != null)
	{
		n = a;
		n = null;
	}
	else
		head = a;
	while(n != null)
	{
		System.out.println(n.data);
	}
	System.out.println(n.data);
	}
public void remove(Node a)
{
	int position=0;
	if(head == a)
	{
		return;
	}
	Node temp = head;
	if(a.next == null)
	{
		return;
	}
   if(position == 0)
   {
	   head =temp.next;
   }
   for(int i=0; temp!=null && i<position-1; i++)
   {
	   temp = temp.next;
	   
   }
	
}

}
