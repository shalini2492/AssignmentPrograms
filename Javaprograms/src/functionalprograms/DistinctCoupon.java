/*purpose: To generate a distinct coupon number out of random numbers
 * author: Shalini
 * date: 16/11/2018
 * version: 1.0
 */
package functionalprograms;

public class DistinctCoupon {
public static void main(String[] args)
{
	char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
	int max=100000000;
    int random = (int) (Math.random()*max);	
    StringBuffer sb = new StringBuffer();
    while(random > 0)
    {
    	sb.append(chars[random % chars.length]);
    	random /= chars.length;
    }
    
    String couponcode = sb.toString();
    System.out.println("Coupon code: " +couponcode);
}
}
