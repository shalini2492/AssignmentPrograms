/**purpose: To calculate present value of the investment by using formula
 * author: Shalini
 * date: 28/11/2018
 * version: 1.0
 */
package functionsandlibraries;

import standardlibrary.BLStdOut;
import standardlibrary.MathFunction;
import utility.Utility;
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
