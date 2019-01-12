package designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Computer1 implements Cloneable{
private List<String> compList;
	
	public Computer1(){
		compList = new ArrayList<String>();
	}
	
	public Computer1(List<String> list){
		this.compList=list;
	}
	public void loadData(){
		//read all employees from database and put into the list
		compList.add("Server");
		compList.add("PC");
		compList.add("Laptop");
		
	}
	
	public List<String> getCompList() {
		return compList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getCompList()){
				temp.add(s);
			}
			return new Computer(temp);
	}

}
