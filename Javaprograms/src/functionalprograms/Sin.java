package functionalprograms;

//import Utility.Utility;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Sin {
public static void main(String[] args) throws Exception
{
	double Pi=3.14519;
	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter number of terms you wish");
	int n = Integer.parseInt(read.readLine());
	System.out.println("Enter the value of theta");
	int theta = Integer.parseInt(read.readLine());
	double radians=theta*Pi/180;
	System.out.println(radians);

}
}
