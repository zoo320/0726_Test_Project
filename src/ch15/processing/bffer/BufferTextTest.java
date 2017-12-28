package ch15.processing.bffer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferTextTest {

	public static void main(String[] args) {
		File src = new File("./pom.xml");
		try (BufferedReader br = new BufferedReader(new FileReader(src));) {
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}