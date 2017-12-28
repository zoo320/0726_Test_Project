package ch12.set;

public class Phone {
	String number;
	Integer price;

	public Phone(String number, Integer price) {
		this.number = number;
		this.price = price;
	}

	public String toString() {
		return "전화 번호: " + number + ", 가격: " + price;
	}
}