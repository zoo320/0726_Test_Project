package ch10.wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		Object [] objs = new Object[2];
		objs[0] = "Hello";
		objs[1] = new Integer(100);
		
		if(objs[1] instanceof Integer) {
			int num = ((Integer)objs[1]).intValue();
			System.out.println("값: "+num);
		}
	}
}