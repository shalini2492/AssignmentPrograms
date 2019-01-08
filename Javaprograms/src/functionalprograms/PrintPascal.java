package functionalprograms;

public class PrintPascal {
public static void main(String[] args)
{
	int n=4;
	
	printPascal(n);
}
/**This method is used to calculate values and print it in array
 * @param n number of lines
 */
public static void printPascal(int n)
{
	int[][] array=new int[n][n];

	for(int line=0; line<n; line++)
	{
		for(int i=0; i<=line; i++)
		{
			if(line == i || i == 0)
			
				array[line][i]=1;
			
			else
				array[line][i]=array[line-1][i-1]+array[line-1][i];
			System.out.print(array[line][i]);
		}
		System.out.println("");
	}
}
}
