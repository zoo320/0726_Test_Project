package ch15.node.piped;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedTest {

	public static void main(String[] args) throws IOException {
		PipedReader pReader = new PipedReader();
		PipedWriter pWriter = new PipedWriter();
		pReader.connect(pWriter);

		new ReadThread(pReader).start();
		new WriteThread(pWriter).start();
	}
	static class WriteThread extends Thread{
		PipedWriter pWriter;
		
		public WriteThread(PipedWriter writer) {
			this.pWriter = writer;
		}
		public void run() {
			try{
				pWriter.write(Thread.currentThread().getName()+"에서 출력함");
				pWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	static class ReadThread extends Thread {
		PipedReader pReader;
		
		public ReadThread(PipedReader reader) {
			this.pReader = reader;
		}
		public void run() {
			char [] buffer = new char[20];
			int read = -1;
			try {
				while((read = pReader.read(buffer))>0) {
					System.out.println("입력 받음: "+new String(buffer, 0, read));
				}
				pReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
