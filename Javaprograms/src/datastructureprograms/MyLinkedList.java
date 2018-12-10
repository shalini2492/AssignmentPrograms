package datastructureprograms;

public class MyLinkedList <T> 
{
    private Node<T> first;
    private Node<T> last;
    private int count=0;
    public MyLinkedList()
    {
    	
    }
    public void add(T data)
    {
    	if(first == null)
    	{
    		first = new Node<T>(data);
    		last=first;
    		count++;
    		return;
    	}
    	Node<T> new_node=new Node<T>(data);
    	first=new_node;
    	last.next=new_node;
    	new_node=last;
    	count++;
    	return;
    }
    public void remove(T data)
    {
    	Node<T> temp=first;
    	Node<T> pre=null;
    	if(first.data == null)
    	{
    		first=first.next;
    		count--;
    		return;
    	}
    	while(temp != null)
    	{
    		if(temp.data == data)
    		{
    		    pre.next=temp.next;
    		    temp.next.pre=temp.pre.next;
    		    count--;
    		    return;
    		}
    		pre=temp;
    		temp=temp.next;
    		if(temp.next == null)
    		{
    			pre.next=null;
    			count--;
    		}
    	}
    }
    public int size()
    {
    	return count;
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
    public boolean isEmpty()
    {
    	return (count==0);
    }
    public int index(T data)
    {
    	Node<T> temp=first;
    	for(int i=0; i<size(); i++)
    	{
    		if(temp.data.equals(data))
    		{
    			return i;
    		}
    		temp=temp.next;
    	}
    	return -1;
    }
    public Node<T> getNode(int index)
    {
    	if(this.isEmpty() || index<0 || index>this.count)
    	{
    		return null;
    	}
    	int c=last.index-index;
    	Node<T> currentNode=last;
    	while(c>0)
    	{
    		currentNode=currentNode.pre;
    		count++;
    	}
    	return currentNode;
    }
    public T get(int index)
    {
    	if(index>=size())
    	{
    		throw new IndexOutOfBoundsException();
    	}
    	Node<T> currentNode=first;
    	for(int i=0; i<size(); i++)
    	{
    		currentNode=currentNode.next;
    	}
    	return currentNode.data;
    }
    public void insert(int position, T data)
    {
    	if(position>=size())
    	{
    		throw new IndexOutOfBoundsException();
    	}
    	if(position == 0)
    	{
    		first=new Node<T>(data, first);
    		last=first;
    		count++;
    		return;
    	}
    	Node<T> currentNode=first;
    	for(int i=1; i<position; i++)
    	{
    		currentNode=currentNode.next;
    	}
    		currentNode.next=new Node<T>(data);
    		count++;
    		
    }
    public void remove(int index)
    {
    	if(index>=size())
    	{
    		throw new IndexOutOfBoundsException();
    	}
    	if(index == 0)
    	{
    		first.next=null;
    		count--;
    		
    	}
    	Node<T> currentNode=first;
    	for(int i=0; i<size(); i++)
    	{
    		currentNode=currentNode.next;
    	}
    	currentNode.next=currentNode.next.next;
    	count--;
    }
    public T pop()
    {
    	Node<T> currentNode=first;
    	Node<T> pre=null;
    	while(currentNode.next != null)
    	{
    		pre=currentNode;
    		currentNode=currentNode.next;
    	}
    	T lastData=currentNode.data;
    	pre.next=null;
    	count--;
    	return lastData;
    }
    public T pop(int index)
    {
    	if(index>=size())
    	{
    		throw new IndexOutOfBoundsException();
    	}
    	if(index==0)
    	{
    		T firstData=first.data;
    		count--;
    		return firstData;
    	}
    	Node<T> temp=first;
    	for(int i=0; i<index; i++)
    	{
    		temp=temp.next;
    	}
    	T dataOfIndex=temp.next.data;
    	temp.next=temp.next.next;
    	count--;
    	return dataOfIndex;
    }
    public void display()
    {
    	Node<T> currentNode=first;
    	for(int i=0; i<size(); i++)
    	{
    		System.out.print(currentNode.data+" ");
    		currentNode=currentNode.next;
    	}
    	
    }
}
