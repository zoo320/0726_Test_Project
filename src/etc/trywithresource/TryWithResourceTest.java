package etc.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceTest {

	public static void main(String[] args) throws IOException {
		TryWithResourceTest trt = new TryWithResourceTest();
		trt.tryWithResourcesByJava9();
	}

	void tryWithResourcesByJava7() throws IOException {
		BufferedReader reader1 = new BufferedReader(new FileReader("test.txt"));
		try (BufferedReader reader2 = reader1) {
			// do something
		}
	}

	void tryWithResourcesByJava9() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
		try (reader) {
			// do something
		}
	}
}