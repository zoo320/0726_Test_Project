package ch15.node.basic;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest2 {

	public static void main(String[] args) {
		byte [] buffer = new byte[10];
		try (InputStream input = System.in) {
			int read = -1;
			while ((read=input.read(buffer))>0) {
				System.out.println("읽은 개수: " + read+", 문자열로: "+new String(buffer, 0, read));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
