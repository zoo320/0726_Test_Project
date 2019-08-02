package ch15.node.basic;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderTest {

	public static void main(String[] args) {
		char [] buffer = new char[10];
		try (Reader reader = new InputStreamReader(System.in)) {
			int read = -1;
			while ((read=reader.read(buffer))>0) {
				System.out.println("읽은 개수: " + read+", 문자열로: "+new String(buffer, 0, read));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}