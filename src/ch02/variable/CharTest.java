package ch02.variable;

public class CharTest {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = '\u0041';

		// \t(탭)와 \n(새줄) 삽입
		System.out.print(c1 + '\t' + c2 + '\n');

		int i = 'A' + 1;
		System.out.println(i + " : " + (char) i);
	}

}
