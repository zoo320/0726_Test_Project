package ch16.terminate;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class MyContainer {
	Properties prop = new Properties();

	public void accumulate(String element) {
		prop.setProperty(element, element.length() + "");
	}

	public void combine(MyContainer other) {
		prop.putAll(other.prop);
	}

	public void saveToFile() {
		try (FileWriter writer = new FileWriter("c:/Temp/fromStream.txt")) {
			prop.store(writer, "from stream");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}