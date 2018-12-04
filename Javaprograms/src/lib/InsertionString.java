package lib;



import utility.Utility;

public class InsertionString {
public static void main(String[] args)
{
	System.out.println("Enter the numbers of elements you want in array: ");
    int size3=Utility.inputInteger();
    String arr3[] = new String[size3];
    System.out.println("Enter "+size3+" elements as a string in an array :");
    for(int i=0;i<size3;i++)
    {
		arr3[i]=Utility.inputString();
	}
	System.out.println("The sorted list using insertion sort is:");
	for(int i=0;i<size3;i++)
	{
		Utility.insortStr(arr3);
		System.out.println(arr3[i]);
	}

}
}
