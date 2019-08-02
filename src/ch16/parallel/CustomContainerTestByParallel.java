package ch16.parallel;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

import ch16.terminate.MyContainer;

public class CustomContainerTestByParallel {

	public static void main(String[] args) {
		String[] strs = { "Hi", "C", "Java", "Zoo", "World" };

		Supplier<MyContainer> supplier = () -> new MyContainer();

		BiConsumer<MyContainer, String> accumulator = (container, element) -> {
			container.accumulate(element);
		};
		BiConsumer<MyContainer, MyContainer> combiner = (prop1, prop2) -> {
			prop1.combine(prop2);
		};

		MyContainer custom = Arrays.stream(strs).parallel().filter(str -> {
			return str.length() >= 3;
		}).collect(supplier, accumulator, combiner);
		custom.saveToFile();
	}
}