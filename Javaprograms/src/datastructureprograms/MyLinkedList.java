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
    
    /**This method is used to delete data from head of the linked list.
     * @param data data to be deleted.
     */
    public void removeAtFirst(T data)
    {
    	Node<T> temp = first;
    	first=first.next;
    	temp.next=null;
    	count--;
    }
    /**This method is used to delete last node from linked list
     * @param data data to be deleted
     */
    public void removeAtLast(T data)
    {
    	Node<T> last=first;
    	Node<T> previous=null;
    	while(last.next != null)
    	{
    		previous=last;
    		last=last.next;
    	}
    	previous=last;
    	previous.next=null;
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
    
    /**This method is used to insert user input in after sorting in list
     * @param data user input
     * @return node
     */
    public Node<T> insertinSortedList(T data)
    {
    	Node<T> newNode=new Node<T>(data);
    	if(first == null)
    	{
    		return newNode;
    	}
    	Node<T> current=first;
    	Node<T> temp=null;
    	while(current != null && current.data.toString().compareTo((String) newNode.data) < 0)
    	{
    		temp=current;
    		current=current.next;
    	}
    	newNode.next=current;
    	temp.next=newNode;
    	return first;
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
    
    /**This method will return the index of node
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
    	if(position>size() || position<1)
    	{
    		System.out.println("Invalid position.");
    	}
    	Node<T> newNode=new Node<T>(data);
    	Node<T> previous=first;
    	if(position == 1)
    	{
    		
    		first=newNode;
    		count++;
    		return;
    	}
    	
    	for(int i=1; i<=position; i++)
    	{
    		previous=previous.next;
    	}
    	Node<T> currentNode=previous.next;
    	newNode.next=currentNode;
    	previous.next=newNode;
    	count++;
    	return;
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
    
    
    /**This method is used to pop data from last index in list
     * @return node
     */
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
    
    /**This method is used to pop data using index as input
     * @param index user input 
     * @return node
     */
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
    
    /**This method is used to display linked list
     * 
     */
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
