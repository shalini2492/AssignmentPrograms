package DataStructureprograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import Utility.Utility;

public class LinkLIst<T> {
Node<T> head;
T data;
Node<T> next;

int count=0;

public void LinkLIst()
{
	//to create object, default constructor is created.
}
T a;
Node<T> n = new Node(a);

Node<T> temp = head;
public String readfromFile(String file) throws Exception
{
     String[] st=new String[20];
     String l = "";
     String readfile="/home/hp/Desktop/abcd.txt";
     BufferedReader br = new BufferedReader(new FileReader(readfile));
     while((l=br.readLine()) != null)
     {
	      System.out.println(l);
	      st=readfile.split(" ");
     }
     br.close();
     return file;
}

public void add(String a)
{
	
	head.data = (T) a;
	if(n != null)
	{
		n.data = (T) a;
		//n.next=null;
	}
	else
		head.data = (T) a;
	while(n != null)
	{
		System.out.println(n.data);
		n.data = (T) a;
		//n.next=null;
	}
	System.out.println(n.data);
}

public void remove(T a)
{
	int position=0;
	if(head == a)
	{
		return;
	}
	
	if(a == null)
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

public void searchItem(T a)
{
	Node<T> curr = head;
	while(curr!=null)
	{
		curr.data = a;
		curr = curr.next;
	}
}

public int isEmpty()
{
	if(head == null);
	return 0;	
}

public int size()
{
	return count;
}

public void append(T a)
{
	Node new_node = new Node(a);
	if(head == null)
		{
			head = new Node(a);
			return;
		}	
	new_node.next=null;
	Node last=head;
	while(last.next != null)
	{
		last=last.next;
		last.next=new_node;
	}
}

public int index(String a)
{
	int pos=0;
	if(head.next==null)
	{
		return 1;
	}
	for(int i=0; i<10; i++)
	{
		if(i==pos)
		{
			return pos;
		}
	}
	return pos;
	
}

public Node<T> insertItem(T a, int pos)
{
	Node<T> da = new Node<>(a);
	da.data = a;
	da.next = null;
	if(head == null)
	{
		return da;
	}
	if(pos == 0)
	{
		da.next=head;
		head=da;
	}
		for(int i=0; i<pos; i++)
		{
			if(i == pos)
			{
				n.data=a;
				n.pre = n.pre.next;
				n.next= n.next.pre;
			}
		}
		return da;
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
	for(int i=0; i<10; i++)
	{
		System.out.println(n.data+ "->");
	}
}


}