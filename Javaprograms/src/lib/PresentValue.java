package lib;

import functionsandlibraries.MathFunction;
import utility.Utility;
import functionsandlibraries.BLStdOut;
public class PresentValue {
public static void main(String[] args)
{
	int money;
    double rateOfinterest, duration;
    BLStdOut.println("Enter the money you want to invest: ");
    money = Utility.inputInteger();
    BLStdOut.println("Enter the rate of interest: ");
    rateOfinterest = Utility.InputDouble();
    BLStdOut.println("Enter the duration: ");
    duration = Utility.InputDouble();
    MathFunction.presentValue(money, rateOfinterest, duration);
}
}
