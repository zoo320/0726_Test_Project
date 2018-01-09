package ch06.product;

public class Product {
	public String name;
	public int price;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void printInfo() {
		System.out.printf("상품명: %s, 가격: %d%n", this.name, this.price);
	}
}