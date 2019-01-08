package datastructureprograms;

import utility.Utility;
public class PrimeNumberQueue {
public static void main(String[] args)
{
	MyLinkedList<Integer> list=new MyLinkedList<Integer>();
	Queue<Integer> anagram=new Queue<Integer>();
	Queue<Integer> nonanagram = new Queue<Integer>();
    for(int i=3; i<1000; i++)
    {
    	if(Utility.prime(i))
    	{
    		list.add(i);
    	}
    }
    list.display();
    for(int i=0; i<anagram.size()-1; i++)
    {
    	for(int j=1; j<anagram.size(); j++)
    	{
    		if(Utility.numAnagramCheck(list.get(i), list.get(j)))
    		{
    			if(anagram.search(list.get(i)) == false)
    			{
    				anagram.enqueue(list.get(i));
    			}
    			
    			if(anagram.search(list.get(j))==false)
    			{
    				anagram.enqueue(list.get(j));
    			}
    			if(nonanagram.search(list.get(i))==false)
    			{
    				nonanagram.enqueue(list.get(i));
    			}
    			if(nonanagram.search(list.get(j))==false)
    			{
    				nonanagram.enqueue(list.get(j));
    			}
    		}
    	}
    	anagram.show();
    	nonanagram.show();
    }
    Integer[][] anagramArray=new Integer[2][nonanagram.size()];
    int anagramQueueSize=anagram.size();
    
    for(int i=0; i<anagramQueueSize; i++)
    {
    	anagramArray[0][i] = anagram.dequeue();
    }
   //Utility.print2DArray(anagramArray);
   int nonanagramQueueSize=nonanagram.size();
   for(int j=0; j<nonanagramQueueSize; j++)
   {
	   anagramArray[1][j] = nonanagram.dequeue();
   }
   
   System.out.println("\nThe first row of array displays prime numbers which are also anagram..");
   System.out.println("The second row of array displays prime numbers which are not anagram..");
   Utility.print2DArray(anagramArray);
}
}

