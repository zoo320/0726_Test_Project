package ch12.generic.type;

import java.util.ArrayList;

class Toy2 {}
class Grocery2 {}

class GenericBox<T> {
	private T some;
	public T getSome() {
		return some;
	}
	public void setSome(T some) {
		this.some = some;
	}
}

public class GenericBoxTest {
	public static void main(String[] args) {
		GenericBox<Toy2> gBox1 = new GenericBox<>();
		gBox1.setSome(new Toy2());
		Toy2 toy = gBox1.getSome();
		// toy 사용
		GenericBox<Grocery2> gBox2 = new GenericBox<>();
		gBox2.setSome(new Grocery2());
		Grocery2 grocery = gBox2.getSome();
		// grocery 사용
		// gBox1.setSome(new Grocery2()); // Grocery2만 할당 가능
	}
}
