package ch15.node.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest {

	public static void main(String[] args) {
		File src = new File("c:" + File.separator + "windows" + File.separator + "explorer.exe");
		File target = new File("c:" + File.separator + "Temp" + File.separator + "explorer.exe");
		try (FileInputStream input = new FileInputStream(src);
				FileOutputStream output = new FileOutputStream(target)) {
			byte[] buffer = new byte[100];
			int read = 0;
			while ((read = input.read(buffer)) > 0) {
				output.write(buffer, 0, read);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/*if(target.exists()) {
	String fileName = target.getAbsolutePath();
	String ext = fileName.substring(fileName.lastIndexOf("."), fileName.length()-1);
	target.renameTo(new File(fileName.replace(ext, "_"+System.currentTimeMillis()+ext)));
}*/