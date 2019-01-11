package objectorientedprograms;


import java.util.Map;

import utility.Utility;

public class Products {
	private String name;
	private int price;
	private int weight;

	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getWeight()
	{
		return weight;
	}
	public void setWeight(int weight)
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
		int price = Utility.inputInteger();
		rice.setPrice(price);
		System.out.println("Enter the weight");
		int weight = Utility.inputInteger();
		rice.setWeight(weight);
		return rice;
	}
}
