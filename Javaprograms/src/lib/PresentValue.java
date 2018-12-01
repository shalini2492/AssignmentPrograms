package lib;

import functionsandlibraries.MathFunction;
import utility.Utility;

public class PresentValue {
public static void main(String[] args)
{
	int money;
    double rateOfinterest, duration;
    System.out.println("Enter the money you want to invest: ");
    money = Utility.inputInteger();
    System.out.println("Enter the rate of interest: ");
    rateOfinterest = Utility.InputDouble();
    System.out.println("Enter the duration: ");
    duration = Utility.InputDouble();
    MathFunction.presentValue(money, rateOfinterest, duration);
}
}
