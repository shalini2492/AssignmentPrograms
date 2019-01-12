package designpatterns;

public class BillPughSingleton {
private BillPughSingleton()
{
}
private static class SingletonHelper
{
	private static final BillPughSingleton IN=new BillPughSingleton();
	
}
private static BillPughSingleton getInstance()
{
	return SingletonHelper.IN;
}

}
