package datastructureprograms;
import datastructureprograms.MyLinkedList;
public class OrderedForTestOnly {
public static void main(String[] args)
{
	MyLinkedList<Integer> order=new MyLinkedList<Integer>();
	order.add(12);
	order.add(13);
	order.add(33);
	order.add(34);
	order.add(54);
	order.add(65);
	order.add(64);
	order.add(23);
	order.add(26);
	order.add(56);
	order.add(86);
	order.add(97);
	System.out.println("Elements before pop operation: ");
	order.display();
	//order.pop();
    order.pop(4);
	System.out.println("\nElements after pop: ");
	order.display();
}
}
