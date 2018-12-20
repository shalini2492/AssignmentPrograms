/**purpose: To implement a generic queue

 * author: Shalini
 * date: 12/12/2018
 * version: 1.0
 */
package datastructureprograms;

import standardlibrary.BLStdOut;

public class Queue <T> {

MyLinkedList<T> myList = new MyLinkedList<T>();
public Queue()  // default constructor to create instance of class 
{
	               
}
/**This method is used to add element to the rear of queue
 * @param data input element
 */
public void enqueue(T data)
{
	myList.add(data);
}
/**This method is used to remove element from front of queue
 * @return element to be deleted
 */
public T dequeue()
{
	if(myList.isEmpty())
	{
		BLStdOut.print("Queue underflow.");
	}
	T deleteData = myList.get(0);
	myList.remove(0);
	return deleteData;
}
/**This method will check whether the queue is empty or not
 * @return true if queue is empty else false
 */
public boolean isEmpty()
{
	return myList.size()==0;
}
/**This method will return number of elements in queue
 * @return size of queue
 */
public int size()
{
	return myList.size();
}
/**This method is used to display elements in queue
 * 
 */
public void show()
{
	myList.display();
}
public boolean search(T data)
{
	return myList.search(data);
}
}

