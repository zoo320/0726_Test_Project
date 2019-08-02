package ch08.generic.type;

class SomeBox<T>{}

public class RawTypeVsGenericType {
	public static void method1(SomeBox<Object> s) {}
	
	public static void method2(SomeBox s) {}

	public static void main(String[] args) {
		SomeBox<Object> s = new SomeBox();
		method1(new SomeBox<Object>());
		//method1(new SomeBox<String>());
		
		method2(new SomeBox());
		method2(new SomeBox<String>());
	}

}
