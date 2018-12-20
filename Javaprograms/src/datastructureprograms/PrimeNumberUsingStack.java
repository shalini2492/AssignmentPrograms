package datastructureprograms;

import utility.Utility;

public class PrimeNumberUsingStack {
	public static void main(String[] args) 
	{
		
		MyLinkedList<Integer> myList=new MyLinkedList<Integer>();
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=0; i<1000; i++)
		{
			if(Utility.prime(i))
			{
				myList.add(i);
			}
		}
		for(int i=0; i<myList.size()-1; i++)
		{
			for(int j=i+1; j<myList.size(); j++)
			{
				if(Utility.numAnagramCheck(myList.get(i), myList.get(j)))
				{
					stack.push(myList.get(i));
					stack.push(myList.get(j));
				}
			}
		}
		stack.display();
	}
}
