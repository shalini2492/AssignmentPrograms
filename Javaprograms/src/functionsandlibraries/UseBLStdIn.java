package functionsandlibraries;
import standardlibrary.BLStdIn;
import standardlibrary.BLStdOut;
public class UseBLStdIn {
public static void main(String[] args)
{
	boolean is=true;
	String s = "";
	BLStdOut.println("Enter a string");
	BLStdIn.readLine();
	BLStdOut.println(s);
	BLStdIn.readBoolean();
	BLStdOut.print(s);
}
}
