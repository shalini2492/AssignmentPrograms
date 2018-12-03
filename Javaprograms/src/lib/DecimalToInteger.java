package lib;

import java.text.DecimalFormat;

import utility.Utility;

public class DecimalToInteger {
public static void main(String[] args)
{
	
	//double val;
	double decimalNumber= Math.random();
	String string1=Double.toString(decimalNumber);
	System.out.println("Before converting to Integer....."+decimalNumber);
	String[] decString = string1.split("\\.");
	String withoutDp = decString[0]+decString[1];
	System.out.println("Decimal converted to integer...." +withoutDp);
	//convertInt(decimalNumber);
	/*Double dd = new Double(0.234323);
			dd.intValue();
	int count=0;
	int intNumber;
	String index="";
	while(index.contains("\\."))
	{
		count=count++;
		
	}
	    
		intNumber=(int) decimalNumber*10000000;
	
	System.out.println("Decimal to integer: "+intNumber);*/
}
/*
public static void convertInt(String decimalString)
{
	/*DecimalFormat DForm = new DecimalFormat("decimalNumber");
    String stringValue = DForm.format(value * 1000000000);
    stringValue.replaceAll(".", "");
    System.out.println("Converted to integer: "+stringValue);*/
    /*String converted = "";
    if (decimalString.indexOf("\\.") >= 0){
    String firstPart = decimalString.substring(0,
    decimalString.indexOf("\\."));
    String lastPart =
    decimalString.substring(decimalString.indexOf("\\."));
    if (lastPart.length() > 0) 
    	lastPart = lastPart.substring(1);
    converted = firstPart + lastPart;
    System.out.println("Converted: "+converted);
}*/

}
