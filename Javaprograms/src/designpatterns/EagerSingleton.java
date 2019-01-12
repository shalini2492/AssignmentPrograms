package designpatterns;


import java.util.function.Function;

public class EagerSingleton {
	
	
	public static void doWork(int value,                     
            Function<Integer,Integer> func){
System.out.println(func.apply(value));
}
//	
//public static void main(String args[]){
//Function<Integer,Integer> inc = e -> e+1;
//doWork(9,inc);
//}
//    private static EagerSingleton singletonInstance;
//
//    // SingletonExample prevents any other class from instantiating
//
//    private EagerSingleton() {
//
//    }
//
//    // Providing Global point of access
//
//    public static EagerSingleton getSingletonInstance() {
//
//        if (null == singletonInstance) {
//
//            singletonInstance = new EagerSingleton();
//
//        }
//
//        return singletonInstance;
//
//    }
//
//    public void printSingleton(){
//
//        System.out.println("Inside print Singleton");
//
//    }
}
