package datastructureprograms;

public class MyLinkedList <T> 
{
    private Node<T> first;
    private Node<T> last;
    private int count=0;
    public MyLinkedList() //default constructor to create instance of class
    {
    	
    }
    
    /**This method is used to add elements to the linked list.
     * @param data user input data
     */
    public void add(T data)
    {
    	if(first == null)
    	{
    		first = new Node<T>(data);
    		last=first;
    		count++;
    		return;
    	}
    	last.next=new Node<T>(data);
    	last=last.next;
    	count++;
    	return;
    }
    
    /**This method is used to delete data from the linked list.
     * @param data data to be deleted.
     */
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
    
    /**This method is used to return the total number of elements in linked list.
     * @return size of linked list
     */
    public int size()
    {
    	return count;
    }
    
    /**This method is used to search if user input number is present in linked list or not
     * @param data user input number
     * @return true if number is present in list else false.
     */
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
    
    /**This method will check if the list is empty or not
     * @return true if list is empty and false if list is not empty
     */
    public boolean isEmpty()
    {
    	return (count==0);
    }
    
    /**This method will return the index value of given data to user
     * @param data data of which index is calculated
     * @return index value
     */
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
    
    /**This method will return node which user wants at given index
     * @param index index of node
     * @return node
     */
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
    
    /**This method will return the index
     * @param index index of node
     * @return index
     */
    public T get(int index)
	{
		if(index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		Node<T> temp=first;
		for(int i=0;i<index;i++)
		{
			temp=temp.next;
		}
		return temp.data;
	}
	
	/**This method is used to add data at a specified location in list
	 * @param position index value
	 * @param data data to be added
	 */
	public void insert(int position, T data)
    {
    	
    	if(position == 0)
    	{
    		first=new Node<T>(data, first);
    		count++;
    		return;
    	}
    	Node<T> currentNode=first;
    	for(int i=1; i<position; i++)
    	{
    		currentNode=currentNode.next;
    	}
    		currentNode.next=new Node<T>(data, currentNode.next);
    		count++;
    		
    }
    
    /**This method will delete the data from a specified location in list
     * @param index index value of data
     */
    public void remove(int index)
    {
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
