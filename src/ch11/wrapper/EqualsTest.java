package ch11.wrapper;

public class EqualsTest {

	public static void main(String[] args) {
		Integer iObj1 = new Integer(1000);
		Integer iObj2 = new Integer(1000);
		System.out.println(iObj1==iObj2);
		System.out.println(iObj1.equals(iObj2));
		System.out.println(iObj1==1000);
	}
}