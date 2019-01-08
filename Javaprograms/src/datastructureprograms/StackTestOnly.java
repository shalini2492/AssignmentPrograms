package datastructureprograms;

public class StackTestOnly {
public static void main(String[] args)
{
	Stack<Integer> st=new Stack<Integer>();
	MyLinkedList<Integer> list=new MyLinkedList<Integer>();
	list.add(10);
	list.add(12);
	list.add(13);
	list.add(14);
	list.add(16);
	list.add(18);
	list.add(22);
	list.add(43);
	list.add(33);
	list.add(53);
	list.add(65);
	list.add(76);
	list.insert(6, 77);
	list.removeAtFirst(12);
	list.removeAtLast(76);
	//st.push(9);
	
	list.insertinSortedList(45);
	System.out.println(list.size());
	System.out.println(list);
	//list.pop(5);
	list.display();
}
}
