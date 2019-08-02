package ch15.processing;

import java.io.UnsupportedEncodingException;

public class EncodingTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String data = "안녕";
		byte [] bytes = data.getBytes("utf-8");
		String redata = new String(bytes, "ms949");
		System.out.println("ms949: "+redata);	//ms949: �븞�뀞
		
		redata = new String(bytes, "utf-8");
		System.out.println("utf-8: "+redata); //utf-8: 안녕
	}
}
