package ch16.terminate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class MatchingTest {

	public static void main(String[] args) throws IOException {
		Path text = Paths.get("./src/res/강남스타일.txt");
		List<String> lines = Files.readAllLines(text);
		boolean result = lines.stream()
		.flatMap(line -> {
			return Arrays.stream(line.split("\\b"));
		}).distinct().filter(word -> {
			return word.trim().length() > 0;
		}).peek(System.out::println)
		.anyMatch(word -> {
			return word.length() > 5;
		});
		System.out.println("stream의 단어들에는 5글자 이상인 것이 있다? "+result);
	}
}