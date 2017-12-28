package ch13.lambda.ref;

import java.util.function.Function;

public class MethodReference2 {

	public static void main(String[] args) {
		Function<String, Integer> f0 = (str) -> {return Integer.parseInt(str);};
		System.out.println(f0.apply("100"));
		
		Function<String, Integer> f1 = str -> Integer.parseInt(str);
		System.out.println(f1.apply("200"));

		Function<String, Integer> f2 = Integer::parseInt;
		System.out.println(f2.apply("300"));
	}
}