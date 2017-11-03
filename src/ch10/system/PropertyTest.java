package ch10.system;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertyTest {

	public static void main(String[] args) {
		Properties props = System.getProperties();
		Set<Object> keys = props.keySet();
		for(Object key: keys) {
			System.out.printf("key: %s, value: %s%n", key, props.get(key));
		}
		String ls = System.getProperty("java.io.tmpdir");
		System.out.println("사용자 임시 디렉토리 경로: "+ls);
		
		Map<String, String> envs = System.getenv();
		Set<String> envKeys = envs.keySet();
		for(String key: envKeys) {
			System.out.printf("key: %s, value: %s%n", key, envs.get(key));
		}
		String userName = System.getenv("USERNAME");
		System.out.println("사용자 명: "+userName);
	}
}