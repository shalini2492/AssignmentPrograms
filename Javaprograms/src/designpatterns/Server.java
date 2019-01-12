package designpatterns;

import designpatterns.Factory.Computer;

public class Server implements Computer
{

	@Override
	public void show() {
		System.out.println("Server added.");
	}
	
}
