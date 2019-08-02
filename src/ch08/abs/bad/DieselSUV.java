package ch08.abs.bad;

public class DieselSUV {
	private int curX, curY;
	
	public void reportPosition() {
		System.out.printf("현재 위치: (%d, %d)%n", curX, curY);
	}
	
	public void addFuel() {
		System.out.printf("주유소에서 급유");
	}
}
