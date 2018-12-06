/**purpose: To print palindrome number which are also prime numbers in an array
 * author: Shalini
 * date: 6/12/2018
 * version: 1.0
 */
package functionsandlibraries;

import utility.Utility;

public class PrimePalindromeNumber {
public static void main(String[] args)
{
	int n=0, m=100;
	String[][] primeNo = new String[10][30];
	for(int i=0; i<10; i++)
	{
		for(int j=0; j<30; j++)
		{
			primeNo[i][j]=" ";
		}
	}
	int column=0;
	for(int row=0; row<1; row++)
	{
		for(int i=n; i<=m; i++)
		{
			if(Utility.primdrome(i))
			{
				primeNo[row][column++]=i+"";
			}
		}
		/*if(n<=900 && m<=1000)
		{
			n=n+100;
			m=m+100;
			column=0;
		}*/
	}
	Utility.print2DArray(primeNo);
}
}
