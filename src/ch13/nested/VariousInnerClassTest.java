package ch13.nested;

interface InfoPrintable {
	public void printInfo();
}

public class VariousInnerClassTest {
	public void useInnerClass(InfoPrintable inner) {
		inner.printInfo();
	}

	public void useSpeakerTest() {
		useInnerClass(new InfoPrintable() {
			@Override
			public void printInfo() {
				System.out.println("익명의 내부 클래스");
			}
		});
		class EngSpeaker implements InfoPrintable {
			@Override
			public void printInfo() {
				System.out.println("로컬 내부 클래스");
			}
		}
		useInnerClass(new EngSpeaker());
		useInnerClass(new InstanceInnerClass());
	}

	class InstanceInnerClass implements InfoPrintable {

		@Override
		public void printInfo() {
			System.out.println("인스턴스 내부 클래스 이용");
		}
	}
}

class SomeClass implements InfoPrintable {

	@Override
	public void printInfo() {
		System.out.println("같은 파일에 있을 뿐 일반 클래스");
	}
}