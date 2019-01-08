/**purpose: To perform operations on queue.
 * author: Shalini
 * date: 12/12/2018
 * version: 1.0
 */
package datastructureprograms;

import standardlibrary.BLStdOut;
import utility.Utility;
public class BankingCashCounter {
public static void main(String[] args)
{
	Queue<Integer> queue=new Queue<Integer>();
	int depositCash, withdrawCash, flag;
	BLStdOut.print("Enter the total amount of cash in bank: ");
	int totalCash=Utility.inputInteger();
	BLStdOut.print("\nEnter the number of persons in a bank: ");
	int number=Utility.inputInteger();
	for(int i=0; i<number; i++)
	{
		queue.enqueue(i);
	}
	
	for(int i=0; i<number; i++)
	{
	BLStdOut.print("\nEnter 0 to deposit cash or 1 to withdraw cash.");
	flag=Utility.inputInteger();
	if(flag==0)
	{
		BLStdOut.print("\nEnter the amount you want to deposit: ");
		depositCash=Utility.inputInteger();
		depositCash=totalCash+depositCash;
		BLStdOut.print("\nYour total balance is: "+depositCash);
		//queue.dequeue();
		BLStdOut.print("\n");
		queue.show();
	}
	else
	{
		BLStdOut.print("\nEnter the amount you want to withdraw: ");
		withdrawCash=Utility.inputInteger();
		if(withdrawCash>totalCash)
		{
			BLStdOut.print("\n You have insufficient balance..");
			BLStdOut.print("Press 1 to withdraw cash and enter amount less than "+totalCash);
			flag=Utility.inputInteger();
		}
		withdrawCash=totalCash-withdrawCash;
		BLStdOut.print("\nYour balance is: "+withdrawCash);
		//queue.dequeue();
		queue.show();
	}
	}
	queue.dequeue();
queue.show();
}
}
