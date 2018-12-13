package datastructureprograms;

public class Deque <T> {
	public Deque<T> next;
	public Deque<T> prev;
	public T data;
	public Deque()
	{
		this.next=null;
		this.prev=null;
	}
	public Deque(T element)
	{
		this.data=element;
		this.next=null;
		this.prev=null;
	}
}
