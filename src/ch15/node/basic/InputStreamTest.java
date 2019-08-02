package ch15.node.basic;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public static void main(String[] args) {
		try (InputStream input = System.in) {
			int read = -1;
			while ((read=input.read())!=-1) {
				System.out.println("읽은 값: " + read+", 문자로: "+(char)read);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
