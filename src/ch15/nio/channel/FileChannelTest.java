package ch15.nio.channel;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelTest {

	public static void main(String[] args) {
		FileChannelTest fct = new FileChannelTest();
		fct.writeToFile();
		fct.copyFile();
	}

	public void writeToFile() {
		Path srcPath = Paths.get("c:/Temp/byChannel.txt");
		Charset utf8 = Charset.forName("utf-8");
		try (FileChannel writeChannel = FileChannel.open(srcPath, StandardOpenOption.CREATE, StandardOpenOption.WRITE);) {
			String src = "안녕 FileChannel. 일반 I/O 대비 쉽나요?";
			ByteBuffer bBuffer = utf8.encode(src);

			int byteCnt = writeChannel.write(bBuffer);
			System.out.println(byteCnt + "byte 출력 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void copyFile() {
		Path srcPath = Paths.get("c:/Temp/byChannel.txt");
		Path targetPath = Paths.get("c:/Temp/byChannel2.txt");
		try (FileChannel readChannel = FileChannel.open(srcPath, StandardOpenOption.READ);
			 FileChannel writeChannel = FileChannel.open(targetPath, StandardOpenOption.CREATE, StandardOpenOption.WRITE);) {
			int read = -1;
			ByteBuffer readBuffer = ByteBuffer.allocate(20);
			while ((read = readChannel.read(readBuffer)) > 0) {
				readBuffer.flip();// position을 다시 0으로 변경 필요
				writeChannel.write(readBuffer);
				readBuffer.clear();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
