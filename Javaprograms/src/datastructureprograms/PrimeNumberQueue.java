package datastructureprograms;

import utility.Utility;
public class PrimeNumberQueue {
public static void main(String[] args)
{
	MyLinkedList<Integer> queue = new MyLinkedList<Integer>();
	Queue<Integer> list=new Queue<Integer>();
	for(int i=0; i<1000; i++)
	{
		if(Utility.prime(i))
		{
			list.enqueue(i);
		}
	}
	for(int i=0; i<list.size(); i++)
	{
		for(int j=0; j<list.size(); i++)
		{
			if(Utility.numAnagramCheck(queue.get(i), queue.get(j))==false && queue.search(queue.get(i)))
			{
				list.dequeue();
			}
			if(Utility.numAnagramCheck(queue.get(i), queue.get(j))==true && queue.search(j))
			{
				list.enqueue(j);
				list.enqueue(i);
			}
		}
	}
	list.show();
}
}

