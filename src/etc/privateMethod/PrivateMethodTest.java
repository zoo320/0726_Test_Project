package etc.privateMethod;

interface SomeInterface {
	static void methodA() {
		internalCommonMethod();
	}

	static void methodB() {
		internalCommonMethod();
	}

	private static void internalCommonMethod() {
		// 공통 처리
	}
}

public class PrivateMethodTest {

	public static void main(String[] args) {
		SomeInterface.methodA();
		SomeInterface.methodB();
	}
}