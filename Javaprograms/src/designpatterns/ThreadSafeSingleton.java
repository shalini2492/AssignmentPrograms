package designpatterns;

public class ThreadSafeSingleton {
public static volatile ThreadSafeSingleton instance;
public ThreadSafeSingleton()
{
}
public static ThreadSafeSingleton getInstance()
{
	if(instance == null)
	{
		synchronized (ThreadSafeSingleton.class)
		{
		instance=new ThreadSafeSingleton();
		}
	}
	return instance;
}
}
