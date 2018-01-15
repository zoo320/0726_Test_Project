package ch10.lambda;

@FunctionalInterface
interface FunctionalInterface3 {
	String methodB(String msg) throws Exception;
}

public class LambdaEx3 {
	public static void useFIMethod(FunctionalInterface3 fi) {
		try {
			System.out.println(fi.methodB("홍길동"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		useFIMethod((String msg) -> {
			return "람다 표현식 이용 1: " + msg;
		});
		useFIMethod(msg -> "람다 표현식 이용 2: " + msg);
	}
}