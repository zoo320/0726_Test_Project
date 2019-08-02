package ch15.node.basic;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest {

	public static void main(String[] args) {
		try (OutputStream output = System.out) {
			String msg = "Hello 자바";
			output.write(msg.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}