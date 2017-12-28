package ch15.node.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class EditFileTest {

	public static void main(String[] args) {
		File target = new File("c:" + File.separator + "Temp" + File.separator + "diary.txt");

		try (Scanner scanner = new Scanner(System.in);
				FileWriter writer = new FileWriter(target, true);
				FileReader reader = new FileReader(target);) {
			writer.write("\n시작 - " + new Date() + "\n");
			String str = null;
			while (true) {
				str = scanner.nextLine();
				if (str.equals("x")) {
					break;
				} else {
					writer.write(str + "\n");
				}
			}
			writer.flush();// 버퍼의 내용을 출력하고 비움

			char[] buffer = new char[10];
			int read = -1;
			while ((read = reader.read(buffer)) > 0) {
				System.out.print(String.valueOf(buffer, 0, read));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}