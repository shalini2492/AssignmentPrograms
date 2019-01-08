package functionalprograms;

public class PascalTriangle {
	
	/**This method will print array of result returned from binomialCoeff() method.
	 * @param n number of lines to print
	 */
	static void printPascal(int n) 
    { 
          
     
     
    for (int line = 0; line < n; line++) 
    { 
          
         
        for (int i = 0; i <= line; i++) 
        System.out.print(binomialCoeff 
                        (line, i)+" "); 
                          
        System.out.println(); 
    } 
    } 
      
     
     
  /**This method will calculate values and return result
 * @param n line number
 * @param k number of array 
 * @return result
 */
static int binomialCoeff(int n, int k)
  {
	  int res=1;
	  k=(n-k);
	  for(int i=0; i<k; i++)
	  {
		  res*=(n-i);
		  res/=(i+1);
	  }
	  return res;
  }
      
     
    public static void main(String args[]) 
    { 
    int n = 7; 
    printPascal(n); 
    } 
} 
