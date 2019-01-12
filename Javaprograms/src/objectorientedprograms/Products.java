package objectorientedprograms;


import java.util.Map;

import utility.Utility;

public class Products {
	private String name;
	private long price;
	private long weight;

	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public long getPrice()
	{
		return price;
	}
	public void setPrice(long price)
	{
		this.price = price;
	}
	public long getWeight()
	{
		return weight;
	}
	public void setWeight(long weight)
	{
		this.weight = weight;
	}

	
	public Products makeRiceObject()
	{
		Products rice = new Products();
		System.out.println("Enter the name");
		String n=Utility.inputString();
		rice.setName(n);
		System.out.println("Enter the price");
		long price = Utility.inputLong();
		rice.setPrice(price);
		System.out.println("Enter the weight");
		long weight = Utility.inputLong();
		rice.setWeight(weight);
		return rice;
	}
}
