package designpatterns;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;



import designpatterns.Factory.Computer;

public class ComputerFactory {
	
	  final static Map<String, Supplier<Computer>> map = new HashMap<>();

	  static {

	    map.put("SERVER", Server::new);

	    map.put("PC", PC::new);
	    
	    map.put("LAPTOP", Laptop::new);

	  }   

	  public Computer getComp(String computerType){

	     Supplier<Computer> shape = map.get(computerType.toUpperCase());

	     if(shape != null) {

	       return shape.get();

	     }

	     throw new IllegalArgumentException("No such shape " + computerType.toUpperCase());

	  }
//public Computer getComputer(String computerType)
//{
//	if(computerType == null)
//	{
//		return null;
//	}
//	if(computerType.equalsIgnoreCase("Server"))
//	{
//		return new Server();
//	}
//	if(computerType.equalsIgnoreCase("PC"))
//	{
//		return new PC();
//	}
//	if(computerType.equalsIgnoreCase("Laptop"))
//	{
//		return new Laptop();
//	}
//	return null;
//}
}
