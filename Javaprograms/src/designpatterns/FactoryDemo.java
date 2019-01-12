package designpatterns;

import designpatterns.Factory.Computer;

public class FactoryDemo {
public static void main(String[] args)
{
	ComputerFactory cf=new ComputerFactory();
	Computer c1=cf.getComp("Server");
	c1.show();
	Computer c2=cf.getComp("PC");
	c2.show();
	Computer c3=cf.getComp("Laptop");
	c3.show();
}
}
