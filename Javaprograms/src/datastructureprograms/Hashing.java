/**purpose: To display hash table with collided data with the help of linked list.
 * author: Shalini
 * date: 14/12/2018
 * version: 1.0
 */
package datastructureprograms;
import java.util.ArrayList;
import standardlibrary.BLStdOut;
import utility.Utility;
import java.util.Scanner;
public class Hashing {
public static void main(String[] args)
{        
	int size;
	ArrayList<Integer> myList = new ArrayList<Integer>();
	MyLinkedList<Integer> list=new MyLinkedList<Integer>();
	BLStdOut.print("Enter the size of array: ");
	size=Utility.inputInteger();
	int[] array=new int[size];
	BLStdOut.print("Enter the elements: ");
	for(int i=0; i<size; i++)
	{
		array[i]=Utility.inputInteger();
	}
	BLStdOut.print("The elements are: ");
    for(int i=0; i<size; i++)
    {
    	System.out.println(array[i]);
    }
    for(int i=0; i<size; i++)
    {
    	int k;
    	k=array[i]%(size+1);
    	System.out.println("Result: " +k);
    	myList.add(k, array[i]);
    	   	
    	
    	System.out.println("Slot " +i+" "+array[i]);
    	myList.add(k, array[i]);
    	//myList.display();
    }
    
    BLStdOut.print("Enter the element to search: ");
    int search=Utility.inputInteger();
    if(list.search(search))
    {
    	BLStdOut.print("The element "+search+" is present in list..So we delete it.");
    	int index=list.get(search);
    	list.pop(index);
    	list.display();
    }
    else
    {
    	BLStdOut.print("The element "+search+" is not in the list...so we add it.");
    	list.add(search);
    	list.display();
    }
   /* for(int i=0; i<size; i++)
    {
    	int[] kk=new int[size];
    	
    	System.out.println("Slot "+i+ " "+kk[i]);
    }*/
}

}

