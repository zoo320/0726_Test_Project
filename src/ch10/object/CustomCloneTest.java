package ch10.object;

import java.util.Arrays;

class Person implements Cloneable {
	String name;
	int age;
	int[] score;

	public Person(String name, int age, int[] score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", score=" + Arrays.toString(score) + "]"+System.identityHashCode(name);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Person cloned =  (Person)super.clone();
		cloned.score = this.score.clone();
		cloned.name = new String(this.name);
		return cloned;
	}
}

public class CustomCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person original = new Person("홍길동", 20, new int[] { 100, 90 });
		System.out.printf("원본: %s%n", original);
		Object cloned = original.clone();
		System.out.printf("복제품: %s%n", cloned);
		original.score[0] = 80;
		System.out.printf("복제품: %s%n", cloned);
		System.out.println(System.identityHashCode(original) + " : " + System.identityHashCode(cloned));
	}
}
