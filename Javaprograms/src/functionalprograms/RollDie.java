/* purpose: To generate proper number of rolling dice.
 * author: Shalini
 * date: 26/11/2018
 * version: 1.0
 */
package functionalprograms;
public class RollDie {
	public static void main(String[] args)
	{
       int i, count=0;
       int array[] = {1,2,3,4,5,6};
       int total=array.length;
       for(i=0; i<total; i++)
       {
    	   int roll = (int) (Math.random() * i) + 1;
    	   count++;
       }
      
       System.out.println(count);
	}
}
