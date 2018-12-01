package lib;

import functionsandlibraries.MathFunction;
import utility.Utility;

public class CompoundInterest {
public static void main(String[] args)
{
	int cash;
    double period, roi;
    System.out.println("Enter the cash to compute compound interest: ");
    cash = Utility.inputInteger();
     System.out.println("Enter the rate of interest: ");
    roi = Utility.InputDouble();
    System.out.println("Enter the time period: ");
    period = Utility.InputDouble();
    MathFunction.futureValue(cash, roi, period);
}
}
