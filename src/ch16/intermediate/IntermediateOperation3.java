package ch16.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntermediateOperation3 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello", "Stream");
		System.out.println(list.stream().map(data -> {
			return Arrays.stream(data.split(""));
		}).count());

		list.stream().flatMap(data -> {
			return Arrays.stream(data.split(""));
		}).peek(item -> System.out.println("flat map 후 중간점검: " + item))
				.distinct()
				.peek(item -> System.out.println("distinct 후 중간점검: " + item))
				.forEach(System.out::println);
	}
}