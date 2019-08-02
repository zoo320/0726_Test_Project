package ch10.nested;

public class LocalInnerTest {
	int iMember = 1;
	static int cMember = 2;
	
	void method(){
		int localVar = 3;
		
		class LocalInner{
			int innerLocalVar = 4;
			void innerMethod(){
				System.out.println("외부 인스턴스 멤버 변수: "+iMember);
				System.out.println("외부 클래스 멤버 변수: "+cMember);
				System.out.println("외부 로컬 변수: "+localVar);	// JDK 8 이후 가능
				System.out.println("내부 인스턴스 멤버 변수: "+innerLocalVar);
				
				iMember++;
				cMember++;
				//localVar++;					// 여전히 편집은 불가능
				innerLocalVar ++;
			}
		}
		LocalInner lInner = new LocalInner();
		lInner.innerMethod();
	}
	
	public static void main(String[] args) {
		LocalInnerTest lit = new LocalInnerTest();
		lit.method();
	}
}