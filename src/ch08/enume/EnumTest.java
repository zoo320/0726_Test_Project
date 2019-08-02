package ch08.enume;

enum MyEnum {
	DATE, BIRTH_DATE
}

public class EnumTest {

	public static void main(String[] args) {
		MyEnum mEnum = MyEnum.DATE;
		System.out.println(mEnum); // DATE
		System.out.println(mEnum instanceof Enum);
		System.out.println(mEnum instanceof Object);
		
		if(mEnum==MyEnum.DATE) {
			System.out.println("일반 날짜");
		}else if(mEnum==MyEnum.BIRTH_DATE) {
			System.out.println("생일");
		}
	}
}