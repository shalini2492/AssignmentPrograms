package designpatterns;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Multiton {
public interface Creator<V>
{
	  public Object create();
	  public V cast(Object val);
}
public static abstract class TypedCreator<A> implements Creator<A>
{
	private final Class<A> tclass;
	public TypedCreator(Class<A> tclass)
	{
		this.tclass=tclass;
	}
	public final A cast(Object val)
	{
		return tclass.cast(val);
	}
	
}
public static final class SuppliedCreator<A> extends TypedCreator<A>
{
	private final SuppliedCreator<A> supplier;
	public SuppliedCreator(Class<A> tclass, SuppliedCreator<A> supplier)
	{
		super(tclass);
		this.supplier=supplier;
	}
	public Object create()
	{
		return supplier.getClass();
}
	
}
private final static ConcurrentMap<Creator<?>, Object> multitons=new ConcurrentHashMap<>();
public static <V, C extends Multiton.Creator<V>> V get(final C key)
{
	return key.cast(multitons.computeIfAbsent(key, k->k.create()));
}
}