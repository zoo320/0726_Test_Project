package ch15.node.basic;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriterTest {

	public static void main(String[] args) {
		try (Writer output = new OutputStreamWriter(System.out)) {
			String msg = "Hello";
			output.write(msg);
			output.append(" Java ").append("World");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}