package objectorientedprograms;
import java.io.File;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.simple.parser.JSONParser;


import utility.Utility;

import org.json.JSONObject;


@SuppressWarnings("deprecation")
public class InventoryManagement {
static Inventory inventoryObj = new Inventory();
static final String filePath = "/home/hp/JavaPrograms/Javaprograms/src/inventory.json";
public static void main(String[] args) throws Exception
{
	@SuppressWarnings("deprecation")
	JSONParser parser = new JSONParser();
	try
	{
		@SuppressWarnings("deprecation")
		Object obj=parser.parse(new FileReader(filePath));
		JSONObject object=(JSONObject) obj;
		String name=(String) object.get("name");
		System.out.println("name: "+name);
		long weight=(long) object.get("weight");
		System.out.println("weight: "+weight);
		long price=(long) object.get("price");
		System.out.println("name: "+price);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
//	
//	Products rice0 = new Products();
//	Products rice1 = new Products();
//	Products rice2 = new Products();
//	rice0.setName("Basmati");
//	rice0.setWeight(20);
//	rice0.setPrice(1000);
//	rice1.setName("Kolam");
//	rice1.setWeight(10);
//	rice1.setPrice(900);
//	
//	rice2.setName("Indrayani");
//	rice2.setWeight(12);
//	rice2.setPrice(1080);
//	
//	
//	String jsonString = Utility.convertJavaToJSON(rice0, filePath);
//	String jsonString1 = Utility.convertJavaToJSON(rice1, filePath);
//	String jsonString2 = Utility.convertJavaToJSON(rice2, filePath);
//	
//	System.out.println(jsonString);
//	System.out.println(jsonString1);
//	System.out.println(jsonString2);
}
public Products makeRiceObject()
{
	Products product = new Products();
	System.out.println("Enter the name");
	String n=Utility.inputString();
	product.setName(n);
	System.out.println("Enter the weight");
	long w=Utility.inputLong();
	product.setWeight(w);
	System.out.println("Enter the price");
	long p=Utility.inputLong();
	product.setPrice(p);
	return product;
}
}
