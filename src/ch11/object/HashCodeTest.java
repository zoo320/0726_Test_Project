package ch11.object;

import java.util.HashSet;
import java.util.Set;

class Product {
	String sn;

	public Product(String sn) {
		this.sn = sn;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Product) {
			Product casted = (Product) obj;
			return sn.equals(casted.sn);
		}
		return false;
	}

	@Override
	public String toString() {
		return "Product [sn=" + sn + "]";
	}
	
	@Override
	public int hashCode() {
		return sn.hashCode();
	}
}

public class HashCodeTest {
	public static void testString() {
		Set<String> set = new HashSet<>();
		set.add(new String("Hello"));
		set.add(new String("Hello"));
		System.out.printf("set의 내용: %s%n", set);
	}
	public static void testProduct() {
		Set<Product> set = new HashSet<>();
		set.add(new Product("98765432109876543210"));
		set.add(new Product("98765432109876543210"));
		System.out.printf("set의 내용: %s%n", set);
	}
	public static void main(String[] args) {
		testString();
		testProduct();
	}
}