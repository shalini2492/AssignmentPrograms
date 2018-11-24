package DataStructureprograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import Utility.Utility;

public class LinkLIst<T> {
Node<T> first;
T data;
Node<T> last;

int count=0;

public void LinkLIst()
{
	//to create object, default constructor is created.
}

public void add(T item)
{
	if(first == null)
	{
		first=new Node<T>(item);
		last=first;
		count++;
	}
	else
		while(last.next != null)
		{
			last.next= new Node<T>(item);
			last= last.next;
			count++;
		}
}

public int size()
{
	return count;
}

public boolean isEmpty()
{
	return(count==0);
}


/*
T a;
Node<T> n = new Node<T>(a);

Node<T> temp = head;
public String readfromFile(String file) throws Exception
{
     String[] st=new String[50];
     String l = ""; //String taken to read file.
     String readfile="/home/hp/Desktop/abcd.txt";
     BufferedReader br = new BufferedReader(new FileReader(readfile));
     while((l=br.readLine()) != null)
     {
	      System.out.println(l); //file is read
	      st=readfile.split(" ");  //file is spilt into words
     }
     br.close();
     return file;
}

public Node<T> add(String a)
{
	
	String data;
	
	Node<T> next;
	Node<T> n;
	//a.toString();
	n.data=a;
	n.next =null;
	if(head == null) //if list is empty the new element is set to head
	{
		head = n;
		ptr = n;
	}
	else
	{
		ptr.next=n; //else the new element is inserted at the rear of the list
		ptr=n;
	}
	return n;
}

public Object remove(T a, int position)
{
	
	if(head == null) //firstly list is checked if the desired item is present.
	{
		return null;  //if there is only 1 item the list is deleted.
	}
	
	
   if(position == 0)
   {
	   return head.next; //if position is 0 then head is returned.
   }
   for(int i=0; temp!=null && i<position-1; i++) //to traverse the list till we get element's position.
   {
	   n=n.next; //next element of n is set as n. Element is deleted.
	   
   }
	n.next=n.next.next; //n element's next is set as n element's next element's next.
	//means n+1's pointer will point to n+2 element.
return n.data;
}

public boolean searchItem(Node<T> head, T st)
{
	Node<T> curr = head;
	while(curr.next != null) //traversing list till current's next pointer is null.
	{
		if(curr == st)
		{
			return true; //if element is found then it will return true
		}
		else
			return false; //if element is not found it will return false.
	}
	return false;
}

public boolean isEmpty()
{
	if(head == null) //if head is null will return empty list message.
	{
		System.out.println("List is empty");
		return true;
	}
	else
		return false;
}

public int size()
{
	int c=0;  
	Node<T> n = head;
    while(n != null)   //traverse the list till last element and will increment counter.
    { 
    	c++;
    }
    n= n.next; //last element's pointer is set as n.
    return c; //counter is returned.
}

public void append(T a)
{
	Node<T> new_node = new Node<T>(a); //new node is created.
	if(head == null)
		{
			head = new_node; //if list is empty then new node is taken as head.
			return;
		}	
	else 
	{
	        new_node.next=null; //next pointer of new node is set to null as we want it to be inserted in last position.
	        Node<T> last=head; //head is set as last node.
	        while(last.next != null)//last element is taken
	        {
		          last=last.next; //last element's next pointer is set to last element
		          last.next=new_node;//new node is taken at last element's next pointer.
	        }
	}
}

public int index(T a)
{
	int pos=1;
	Node<T> curr = new Node<T>(data);
	if(curr==null)
	{
		curr = (Node<T>) a;
		return pos;
		
	}
	curr = curr.next;
	return pos;
	
}

public Node<T> insertItem(T a, int pos)
{
	int c=1;
    if(head == null)
    {
    	head = n;
    	
	}
    for(int i=0; i<pos-1; i++)
    {
    	if(i == pos)
    	{
    		n.data=a;
    		n.next=ptr.pre;
    	}
    }
    return n;
}

public void pop()
{
	int pos = 0;
if(pos == 1)
{
	//head = null;
}
else
	
	temp=(Node<T>) n.data;
	for(int i=0; i<10; i++)
	{
		if(i==0)
		{
			n.data=n.pre.data;
			n.pre.next = null;
			
		}
	}
}

public void pop(int pos)
{
	if(pos == 1)
	{
		//head=null;
	}
	for(int i=0; i<10; i++)
	{
		if(i ==pos)
		{
			n.pre.next=n.next.next.pre;
			
		}
	}
}

public void display()
{
	Node<T> n=head;
	while(n.next!=null)
	{
		System.out.println(n.data+ "->");
		n=n.next;
	}
	System.out.println(n.data);
}
public void delete(T d, int pos)
{
	Node<T> start=new Node<T>(d);
	if(pos == 0)
	{
		head =null;
		
	}
	for(int i=0; i<pos-1; i++)
	{
		if(i == pos)
		{
			start.pre= start.next;
			
		}
	}
}
public void checkIndex(int index)
{
	
}*/
}