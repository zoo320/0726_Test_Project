package ch16.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntermediateOperation2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello", "Stream");
		// String -> char []
		list.stream().map(item -> item.toCharArray()).forEach(data -> {
			System.out.println(data.length);
		});
		// String -> int
		IntStream is = IntStream.range(3, 5);
		is.mapToObj(num -> {
			return "제곱: " + num * num;
		}).forEach(System.out::println);
	}
}