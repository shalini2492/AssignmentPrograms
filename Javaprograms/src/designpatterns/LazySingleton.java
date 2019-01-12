package designpatterns;

public class LazySingleton {
public static volatile LazySingleton instance;
private LazySingleton()
{
}
public static LazySingleton getInstance()
{
	if(instance == null)
	{
		instance=new LazySingleton();
	}
	return instance;
}
}
