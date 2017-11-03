package ch08.annotation;

public class SupressWarningTest {
	@SuppressWarnings(value="unused")
	public void method1() {
		int i = 0; // The value of the local variable i is not used
	}
	
	// @SuppressWarnings(value="unused") // 배열이지만 할당하려는 값이 하나인 경우 중괄호 생략 가능
	// @SuppressWarnings(value={"unused", "rawtypes"}) // 배열 형태의 값 할당
	@SuppressWarnings({ "unused", "rawtypes" }) // 할당하려는 속성이 하나인 경우 value 생략 가능
	public void method2() {
		int i = 0; 
		java.util.List list;
	}
}

