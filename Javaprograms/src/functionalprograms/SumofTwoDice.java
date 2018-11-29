/*purpose: To compute sum of two dice
 * author: Shalini
 * date: 27/11/2018
 * version: 1.0
 */
package functionalprograms;

public class SumofTwoDice {
public static void main(String[] args)
{
	int s=6;
	int a = 1 + (int) (Math.random() * s); //2 random numbers are generated and stored in a and b.
	int b = 1 + (int) (Math.random() * s);
	int sum = a + b;                     //sum of two random numbers is calculated.
	System.out.println(sum);
}
}
