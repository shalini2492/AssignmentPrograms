/*purpose: To compute the percentage of head versus tails
 * author: Shalini
 * date: 14/11/2018
 * version: 1.0
 */
package functionalprograms;

import utility.Utility;

	public class FlipCoin {
		interface MyFunctionalInterface
		{
			public int coinPercen(int per);
		}
		public static void main(String[] args)
		{
			
			System.out.println("Enter no. of times to flip a coin");
			int number = Utility.inputInteger();
			MyFunctionalInterface f=per->Utility.HeadorTail(number);
			System.out.println(f.coinPercen(number));
		}
	}

