package ch15.nio.buffer;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

public class BufferTest {

	public static void main(String[] args) {
		BufferTest bt = new BufferTest();
		bt.bufferCreateTest();
		bt.useBufferTest();
		bt.bufferChange();
		bt.bufferChange2();
	}
	public void bufferCreateTest() {
		CharBuffer cUdBuffer = CharBuffer.allocate(1024 * 1024);
		int [] ints = { 1, 2, 3, 4, 5, 6 };
		IntBuffer iUdBuffer = IntBuffer.wrap(ints);
		ByteBuffer bDBuffer = ByteBuffer.allocateDirect(1024 * 1024);
		CharBuffer cDBuffer = bDBuffer.asCharBuffer();
	}
	
	public void useBufferTest() {
		ByteBuffer buffer = ByteBuffer.allocate(10);
		printBufferInfo("최초 생성",buffer);
		buffer.put(new byte[] {1,2, 3, 4, 5});// 상대적 추가
		printBufferInfo("상대적 추가",buffer);
		buffer.put(7, (byte)7);	// 절대적 추가
		buffer.put(0, (byte)11);// 절대적 추가 - 업데이트
		printBufferInfo("절대적 추가",buffer);
		System.out.println(buffer.get(7));
		System.out.println(buffer.get(1));
		buffer.flip();
		printBufferInfo("flip",buffer);
		System.out.println(buffer.get(2)); // 절대적 읽기
		System.out.println(buffer.get());	// 상대적 읽기
		buffer.mark();
		printBufferInfo("조회", buffer);
		byte [] dest = new byte[3];
		buffer.get(dest);
		System.out.println(Arrays.toString(dest));
		printBufferInfo("조회", buffer);
		buffer.reset();
		printBufferInfo("reset", buffer);
		buffer.get(dest);
		System.out.println(Arrays.toString(dest));
		printBufferInfo("조회", buffer);
		buffer.rewind();
		printBufferInfo("rewind", buffer);
		buffer.clear();
		printBufferInfo("clear", buffer);
		buffer.put(dest);
		buffer.put(dest);
		buffer.put(dest);
		printBufferInfo("put", buffer);
	}
	public void bufferChange() {
		int [] src = {1024, 2048, 3072};
		System.out.println("전송 전: "+Arrays.toString(src));
		IntBuffer iBuffer = IntBuffer.wrap(src);
		ByteBuffer bBuffer = ByteBuffer.allocate(iBuffer.capacity() * 4);
		for(int i=0; i< iBuffer.capacity(); i++) {
			bBuffer.putInt(iBuffer.get(i));
		}
		// Channel을 통해 전송 후
		bBuffer.rewind();
		IntBuffer iBuffer2 = bBuffer.asIntBuffer();
		int [] target = new int[iBuffer2.capacity()];
		iBuffer.get(target);
		System.out.println("복원 결과: "+Arrays.toString(target));//복원 결과: [1024, 2048, 3073]
	}
	
	public void bufferChange2() {
		String src = "안녕 Java World";
		Charset charset = Charset.forName("utf-8");
		ByteBuffer bBuffer = charset.encode(src);
		CharBuffer cBuffer = charset.decode(bBuffer);
		System.out.println(new String(cBuffer.array()));//안녕 Java World
	}
	public void printBufferInfo(String action, Buffer buffer) {
		System.out.println(action+" : "+buffer.capacity()+" : "+buffer.limit()+" : " +buffer.position());
	}
}
