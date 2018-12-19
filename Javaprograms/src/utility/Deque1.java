package utility;
import datastructureprograms.Deque;
import standardlibrary.BLStdOut;
public class Deque1 <E> {
    Deque<E> front;
	Deque<E> rear;
	int counter=0;
	public Deque1(){	
	}
	
	//add front
	@SuppressWarnings("null")
	public void addToFront(E c)
	{
		//if no element in list
		if(front==null) 
		{
			front.data=c;
			rear=front;
		}
		else  //if element in list
		{
			Deque<E>tNode=null;
			tNode.data=c;
			tNode.next=front;
			front.prev=tNode;
			front=tNode;
		}
		counter++;
	}
	
	//add the element in the rear 
	public void addToRear(E c)
	{
		if(front==null) //if no element in list
		{
			Deque<E> newData=new Deque<E>(c);
			front=newData;
			rear=front;
		}
		else  //if element in list
		{
			Deque<E> newData=new Deque<E>(c);
			rear.next=newData;
			newData.prev=rear;
			rear=newData;
		}
		counter++;
	}
	

	/**
	 * Function is used to remove the elements in front of the deque
	 * 
	 * @return output is the element of front in the deque
	 */
	public E removeFront()
	{
		E value=null;
		if(front==null)
		{
			System.out.println("No elements to delete");
		}
		else
		{
			value=front.data;
			front=front.next;
		}
		counter--;
		return value;
	}
	
	/**
	 * Function is used to remove the last element in the deque
	 * 
	 * @return the element which are remove in the deqeue
	 */
	public E removeRear()
	{
		E value=null;
		if(front==null)
		{
			System.out.println("No element to delete");
		}
		else
		{
			value=rear.data;
			rear=rear.prev;
			rear.next=null;
		}
		counter--;
		return value;
	}
	/**
	 * Function is used to check if deque is empty or not
	 * @return boolean value
	 */
	public boolean isEmpty()
	{
		if(front==null)
			return true;
		else
			return false;
	}
 
	/**
	 * @return the size of the element in the deque
	 */
	public int size()
	{
		return counter;
	}
}
