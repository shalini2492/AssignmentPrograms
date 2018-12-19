package datastructureprograms;

public class Stack <T> {
MyLinkedList<T> list = new MyLinkedList<T>();
	
	public Stack() //default constructor to create instance of stack class.
	{
		
	}
	/**This method is used to insert element in stack
	 * @param element user input element
	 */
	public void push(T element)
	{
		list.add(element);
	}
	/**This method is used to remove element from top of the stack
	 * @return element that is to be deleted
	 */
	public T pop()
	{
		//T top=null;
		//list.remove(top);
		int index=list.size()-1;
		T deleteData=list.get(index);
		list.remove(deleteData);
		return deleteData;
	}
	/**This method will return element from the top without deleting it.
	 * @return top element
	 */
	public T peek()
	{
		return list.get(list.size()-1);
	}
	/**This method will check if stack is empty or not
	 * @return true if stack is empty else false
	 */
	public boolean isEmpty()
	{
		return list.size()==0;
	}
	/**This method will return number of elements in stack i.e. size of stack
	 * @return size of stack
	 */
	public int size()
	{
		return list.size();
	}
	/**This method will display stack elements
	 * 
	 */
	public void display()
	{
		for(int i=list.size()-1; i>=0; i--)
		{
			System.out.println(list.get(i));
		}
	}
}