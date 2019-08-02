package ch16.terminate;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class FindTest {

	public static void main(String[] args) {
		String[] strs = { "Hi", "C", "Java", "Zoo", "World" };
		Stream<String> fromArr = Arrays.stream(strs);
		Optional<String> first = fromArr.findAny();
		System.out.println(first.orElse("none"));
	}

}
