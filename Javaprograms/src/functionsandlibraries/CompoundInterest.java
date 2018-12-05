/**purpose: To calculate compound interest given money, rate of interest and time period
 * author: Shalini
 * date: 29/11/2018
 * version: 1.0
 */
package functionsandlibraries;

import standardlibrary.BLStdOut;
import standardlibrary.MathFunction;
import utility.Utility;
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
