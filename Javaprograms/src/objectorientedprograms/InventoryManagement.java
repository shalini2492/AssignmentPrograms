package objectorientedprograms;
import java.io.FileReader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import utility.Utility;

import org.json.JSONObject;

public class InventoryManagement {
static Inventory inventoryObj = new Inventory();
static final String filePath = "/home/hp/JavaPrograms/Javaprograms/src/inventory.json";
public static void main(String[] args) throws Exception
{
	System.out.println("Enter number of rice");
	int numberRice=Utility.inputInteger();
	Products rice = new Products();
	for(int i=0; i<numberRice; i++)
	{
		rice.makeRiceObject();
		inventoryObj.getRiceDetails().add(rice);
	}
	
	System.out.println("Enter number of wheat");
	int numberWheat=Utility.inputInteger();
	Products wheat=new Products();
	for(int i=0; i<numberWheat; i++)
	{
		wheat.makeRiceObject();
		inventoryObj.getWheatDetails().add(wheat);
	}
	System.out.println("Enter number of pulses");
	int numberPulses=Utility.inputInteger();
	Products pulses=new Products();
	for(int i=0; i<numberPulses; i++)
	{
		pulses.makeRiceObject();
		inventoryObj.getPulsesDetails().add(pulses);
	}
	Utility.convertJavaToJSON(inventoryObj, filePath);
	JSONParser parser=new JSONParser();
	Object obj=parser.parse(new FileReader(filePath));
	JSONObject jsonObj = (JSONObject) obj;
	JSONArray riceArray=(JSONArray) jsonObj.get("riceDetails");
	long totalRiceCost = (long) 0;
	for(int i=0; i<riceArray.length(); i++)
	{
		JSONObject obj1 = (JSONObject) riceArray.get(i);
		totalRiceCost=totalRiceCost+(long) obj1.get("weight")*(long) obj1.getLong("price");
	}
	JSONArray wheatArray=(JSONArray) jsonObj.get("wheatDetails");
	long totalWheatCost=(long) 0;
	for(int i=0; i<wheatArray.length(); i++)
	{
		JSONObject obj2=(JSONObject) wheatArray.get(i);
		totalWheatCost=totalWheatCost+(long) obj2.get("weight")*(long) obj2.get("price");
	}
	JSONArray pulsesArray=(JSONArray) jsonObj.get("pulsesDetails");
	long totalPulsesCost=(long) 0;
	for(int i=0; i<pulsesArray.length(); i++)
	{
		JSONObject obj3=(JSONObject) pulsesArray.get(i);
		totalPulsesCost=totalPulsesCost+(long) obj3.get("weight")*(long) obj3.get("price");
		
	}
	System.out.println("Total Cost of Rice: "+totalRiceCost);
	System.out.println("Total Cost of Wheat: "+totalWheatCost);
	System.out.println("Total Cost of Pulses: "+totalPulsesCost);
	
	
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
}
