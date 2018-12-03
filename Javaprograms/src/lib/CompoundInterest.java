package lib;

import functionsandlibraries.MathFunction;
import utility.Utility;
import functionsandlibraries.BLStdOut;
public class CompoundInterest {
public static void main(String[] args)
{
	int cash;
    double period, roi;
    BLStdOut.println("Enter the cash to compute compound interest: ");
    cash = Utility.inputInteger();
    BLStdOut.println("Enter the rate of interest: ");
    roi = Utility.InputDouble();
    BLStdOut.println("Enter the time period: ");
    period = Utility.InputDouble();
    MathFunction.futureValue(cash, roi, period);
}
}
