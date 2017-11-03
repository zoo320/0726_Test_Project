package ch10.wrapper;

public class ParseTest {
	public static void main(String[] args) {
		//stringToPrimitive();
		stringToWrapper();
	}

	public static void stringToPrimitive() {
		String strNum = "1000.0";
		try {
			int i = Integer.parseInt(strNum);
			System.out.println(i);
		} catch (NumberFormatException e) {
			System.out.println("int로 형변환할 수 없습니다.");
		}
	}
	
	public static void stringToWrapper() {
		Integer intObj = Integer.valueOf("100");
		Integer intObj2 = new Integer("100");
	}
}
