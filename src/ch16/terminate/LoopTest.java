package ch16.terminate;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LoopTest {

	public static void main(String[] args) {
		String[] strs = { "Hi", "C", "Java", "Zoo", "World" };
		Stream<String> fromArr = Arrays.stream(strs);
		fromArr.sorted().forEach(data -> {
			System.out.println(data + " : 길이: " + data.length());
		});
	}
}