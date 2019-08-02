package ch15.processing.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) throws IOException {
		File src = new File("c:/Temp/streamtest.dat");
		// 데이터 쓰기
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(src))) {
			dos.writeUTF("홍길동");
			dos.writeInt(30);
			dos.writeDouble(170.5);
		}
		// 데이터 읽기
		try (DataInputStream dis = new DataInputStream(new FileInputStream(src))) {
			String name = dis.readUTF();
			int age = dis.readInt();
			double weight = dis.readDouble();
			System.out.println(name + " : " + age + " : " + weight);
		}
	}
}