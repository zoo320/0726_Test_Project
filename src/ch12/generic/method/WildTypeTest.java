package ch12.generic.method;

public class WildTypeTest {
	public void method1(Object obj) {}
	
	public static void main(String[] args) {
		WildTypeTest test = new WildTypeTest();
		
		test.method1(1);// Object와 형식상 동일
		test.method1("Hello");
		//test.method2(1);	// Number 타입으로 한정
		//test.method2("Hello");
		
	}

}
