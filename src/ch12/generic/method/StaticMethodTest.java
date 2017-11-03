package ch12.generic.method;

public class StaticMethodTest<T>{
	/*public static void method(T t) {
		// do something
	}*/
	
	public static <P> P method(P p) {
		// do something
		return p;
	}
}
