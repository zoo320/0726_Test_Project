package ch13.lambda;

@FunctionalInterface
interface FunctionalInterface1 {
	void methodA();
	// void methodB();//Invalid '@FunctionalInterface' annotation; FunctionalInterface1 is not a functional interface
}

public class LambdaEx1 {
	public static void useFIMethod(FunctionalInterface1 fi) {
		fi.methodA();
	}

	public static void main(String[] args) {
		useFIMethod(new FunctionalInterface1() {
			@Override
			public void methodA() {
				System.out.println("익명의 내부 클래스 형태");
			}
		});
		useFIMethod(() -> {
			System.out.println("람다 표현식 이용 1");
		});
		useFIMethod(() -> System.out.println("람다 표현식 이용 2"));
	}
}