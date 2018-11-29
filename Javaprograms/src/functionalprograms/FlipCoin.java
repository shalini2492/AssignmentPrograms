/*purpose: To compute the percentage of head vs tails
 * author: Shalini
 * date: 14/11/2018
 * version: 1.0
 */
package functionalprograms;

import utility.Utility;

	public class FlipCoin {
		public static void main(String[] args)
		{
			
			System.out.println("Enter no. of times to flip a coin");
			int n = Utility.inputInteger();
			System.out.println(n);
			Utility.HeadorTail(n);
		}
	}

