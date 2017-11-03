package ch07.imp;

import java.io.InputStream;	// 특정 클래스 import
import java.util.*;			// java.util 패키지의 모든 클래스 import

public class ImportTest {
	Date date;	// java.util 패키지의 클래스
	List list;	// java.util 패키지의 클래스
	
	InputStream input;
	
	java.awt.List list2;	//동일한 이름의 List를 위해 패키지 이름 사용
}
