package ch06.overloading;

public class OverloadingTest2 {
	long add(long a, int b) { // ①
		return a + b;
	}

	long add(int a, long b) {// ②
		return a + b;
	}
	public static void main(String[] args) {
		OverloadingTest2 olt = new OverloadingTest2();
		//The method add(long, int) is ambiguous for the type OverloadingTest2
		//System.out.println(olt.add(3, 4));
	}
}
