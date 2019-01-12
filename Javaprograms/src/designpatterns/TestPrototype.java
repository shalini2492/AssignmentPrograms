package designpatterns;

import java.util.List;

public class TestPrototype {
	public static void main(String[] args) throws CloneNotSupportedException {
		Computer comps = new Computer();
		comps.loadData();
		
		//Use the clone method to get the Employee object
		Computer compsNew = (Computer) comps.clone();
		Computer compsNew1 = (Computer) comps.clone();
		List<String> list = compsNew.getCompList();
		list.add("Desktop");
		List<String> list1 = compsNew1.getCompList();
		list1.remove("PC");
		
		System.out.println("Computer List: "+comps.getCompList());
		System.out.println("Computer updated List: "+list);
		System.out.println("Final List: "+list1);
	}
}
