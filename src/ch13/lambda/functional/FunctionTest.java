package ch13.lambda.functional;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionTest {
	private Person person;

	public void addPerson(BiFunction<String, Integer, Person> function, String name, Integer age) {
		person = function.apply(name, age);
	}

	public void printPerson(Function<String, String> function, String name) {
		System.out.println(function.apply(name));
	}

	public void printAge(ToIntFunction<String> function, String name) {
		System.out.println(name + "의 나이: " + function.applyAsInt(name));
	}

	public static void main(String[] args) {
		FunctionTest ft = new FunctionTest();
		ft.addPerson((name, age) -> {
			return new Person(name, age);
		}, "홍길동", 10);

		ft.printPerson((name) -> {
			if (ft.person.name.equals(name)) {
				return ft.person.toString();
			} else {
				return "unknown user";
			}
		}, "홍길동");

		ft.printAge((name) -> {
			if (ft.person.name.equals(name)) {
				return ft.person.age;
			} else {
				return 0;
			}
		}, "홍길동");
	}
}

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}