package ch08.enume;

enum Family {
	FATHER("아빠"), MOTHER("엄마"), SON("아들"), DAUGHTER("딸");
	private String kor;
	
	Family(String kor){
		this.kor = kor;
	}

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}
}

public class UseConstructorTest {
	public static void main(String[] args) {
		Family current = Family.MOTHER;
		System.out.printf("값 확인: %s, kor: %s%n", current, current.getKor());
		current.setKor("어머니");
		System.out.printf("값 확인: %s, kor: %s%n", current, current.getKor());
	}
}