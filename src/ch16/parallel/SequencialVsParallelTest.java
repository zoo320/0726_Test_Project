package ch16.parallel;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SequencialVsParallelTest {

	public static void main(String[] args) {
		String[] strs = { "Hello", "Java", "World" };
		Predicate<String> pred = str -> {
			System.out.println(Thread.currentThread().getName() + ":" + str);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return str.length() >= 4;
		};

		Stream<String> sStream = Arrays.stream(strs);
		long cnt1 = sStream.filter(pred).count();
		System.out.println("순차: " + cnt1);

		Stream<String> pStream = Arrays.stream(strs).parallel();
		long cnt2 = pStream.filter(pred).count();
		System.out.println("병렬: " + cnt2);
	}
}