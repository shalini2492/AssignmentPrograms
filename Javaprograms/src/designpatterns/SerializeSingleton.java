package designpatterns;

public class SerializeSingleton {
private static final long serialVersion=-7604766932017737115L;
private SerializeSingleton()
{
}
private static class SerializeHelper
{
	private static final SerializeSingleton in=new SerializeSingleton();
}
public static SerializeSingleton getInstance()
{
	return SerializeHelper.in;
}
}
