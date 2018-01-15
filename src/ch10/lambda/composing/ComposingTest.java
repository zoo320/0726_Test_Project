package ch10.lambda.composing;

import java.util.function.DoubleConsumer;
import java.util.function.Function;

public class ComposingTest {

	public static void main(String[] args) {

		DoubleConsumer con1 = num -> System.out.println(Math.pow(num, 2));
		DoubleConsumer con2 = num -> System.out.println(num + num);
				
		DoubleConsumer andThen = con1.andThen(con2);
		andThen.accept(10);
		
		Function<String, String> func1 = name -> "Hello " + name;
		Function<String, String> func2 = data -> "returned : "+data;

		Function<String, String> func3 = func1.andThen(func2);
		System.out.println(func3.apply("홍길동"));

		Function<String, String> func4 = func1.compose(func2);
		System.out.println(func4.apply("장길산"));

	}

}
