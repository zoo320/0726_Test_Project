package ch13.nested;

interface SomeInterface {
	void printInfo();
}

public class AnonymousInnerTest {
	int iMember = 1;
	static int cMember = 2;

	void method(SomeInterface si) {
		si.printInfo();
	}

	public static void main(String[] args) {
		AnonymousInnerTest lit = new AnonymousInnerTest();
		int localVar = 3;
		lit.method(new SomeInterface() {
			@Override
			public void printInfo() {
				//System.out.println("외부 인스턴스 멤버 변수: " + iMember);
				System.out.println("외부 클래스 멤버 변수: " + cMember);
				System.out.println("외부 로컬 변수: " + localVar); // JDK 8 이후 가능

				cMember++;
				//localVar++; // 여전히 편집은 불가능
			}
		});
	}
}