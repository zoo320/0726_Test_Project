package ch07.extend;

public class Test {
	public static void main(String[] args) {
		System.out.println(new Object());// 사용 불가

	}
	
	public void useJump(Object obj) {
		if(obj instanceof Person) {
			Person casted = (Person)obj;
		}
	}
}



