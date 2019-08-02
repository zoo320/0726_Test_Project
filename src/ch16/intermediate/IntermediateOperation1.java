package ch16.intermediate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntermediateOperation1 {
	List<String> words;

	public void setUpStream() {
		Path text = Paths.get("./src/res/강남스타일.txt");
		try {
			byte[] bytes = Files.readAllBytes(text);
			String data = new String(bytes);
			words = Arrays.asList(data.split("\\b"));
			System.out.println("초기 단어 개수: " + words.size());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void filterTest() {
		System.out.println("[필터 테스트]");
		System.out.println("중복 제거 결과: " + words.stream().distinct().count());
		System.out.println("필터 결과: " + words.stream().filter(a -> {
			return a.length() > 5;
		}).count());
	}

	public void limitTest() {
		System.out.println("[자르기 테스트]");
		System.out.println("중복 제거 결과: " + words.stream().limit(5).count());
		System.out.println("필터 결과: " + words.stream().skip(5).count());
	}

	public void sortTest() {
		System.out.println("[정렬 테스트]");
		words.stream().distinct().sorted((a, b) -> {
			return a.compareTo(b)*-1;
		}).limit(3).forEach(System.out::println);
	}

	public static void main(String[] args) {
		IntermediateOperation1 ft = new IntermediateOperation1();
		ft.setUpStream();
		ft.filterTest();
		ft.limitTest();
		ft.sortTest();
		Comparator.reverseOrder();
	}
}