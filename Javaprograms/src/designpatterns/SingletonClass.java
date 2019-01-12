package designpatterns;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonClass extends Singleton{
	private static final Multiton.Creator<SingletonClass> KEY= new Multiton.SuppliedCreator<>(SingletonClass.class, SingletonClass::new);

	    public final static SingletonClass getInstance() {
	        SingletonClass k=Multiton.get(KEY);
	        return k;
	    }

	    private final String name;

	    private SingletonClass() {

	        try {
	            Thread.sleep(200);
	            name = "Instance " + System.currentTimeMillis();
	            System.out.println("Slow Instance: " + name);
	            Thread.sleep(200);
	        } catch (InterruptedException e) {
	            throw new IllegalStateException("Interrupted ", e);
	        }
	    }

	    public String toString() {
	        return name;
	    }

	    public static void main(String[] args) {
	        ExecutorService service = Executors.newFixedThreadPool(8);
	        for (int i = 0; i < 20; i++) {
	            service.execute(() -> {System.out.println(SingletonClass.getInstance());});
	        }
}
}
