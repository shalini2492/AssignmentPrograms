package datastructureprograms;

import standardlibrary.BLStdOut;

public class Stack <T> {
	MyLinkedList <T> list = new MyLinkedList<T>();
	public Stack()
	{
		
	}
	public void push(T data)
	{
		list.add(data);
	}
	public T pop()
	{
		int index=list.size()-1;
		T removeData=list.get(index);
		list.remove(removeData);
		return removeData;
	}
	public T peek()
	{
		return list.get(list.size()-1);
	}
	public int size()
	{
		return list.size();
	}
	public boolean isEmpty()
	{
		int top=-1;
		return (top==-1);
	}
}