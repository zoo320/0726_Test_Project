package ch11.string;

public class RegexpTest {

	public static void main(String[] args) {
		String str =  "Hello Java World";
		String [] splitResult = str.split("[a ]");
		for(int i=0; i<splitResult.length; i++) {
			System.out.println(i+" : "+splitResult[i]);
		}
		String nameRule = "[a-zA-Z가-힣]{2,5}";
		System.out.println("Hello Java".matches(nameRule));
		System.out.println("홍길동".matches(nameRule));
		System.out.println("홍길동2".matches(nameRule));
	}
}