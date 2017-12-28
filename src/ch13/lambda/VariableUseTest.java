package ch13.lambda;

@FunctionalInterface
interface FunctionalInterface4 {
	String methodB(String msg);
}

public class VariableUseTest {
	private int instanceMember = 10;

	public void useFIMethod(FunctionalInterface4 fi) {
		System.out.println(fi.methodB("홍길동"));
	}
	
	public void lambdaTestMethod() {
		int localVar = 20;
		
		useFIMethod((String msg) -> {
			System.out.println("this: " + this);
			System.out.println("외부클래스.this: " + VariableUseTest.this);
			System.out.println("변수 참조: " + localVar + " : " + instanceMember);
			// localVar++;	// 로컬 변수 수정은 불가
			return "람다 표현식 이용 : " + msg + ", " + (instanceMember++);
		});

		useFIMethod(new FunctionalInterface4() {
			@Override
			public String methodB(String msg) {
				System.out.println("this: " + this);
				System.out.println("외부클래스.this: " + VariableUseTest.this);
				System.out.println("변수 참조: " + localVar + " : " + instanceMember);
				// localVar++;	// 로컬 변수 수정은 불가
				return "익명의 내부 클래스 이용 : " + msg + (instanceMember++);
			}
		});
	}

	public static void main(String[] args) {
		VariableUseTest vut = new VariableUseTest();
		vut.lambdaTestMethod();
	}
}