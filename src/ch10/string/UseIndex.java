package ch10.string;

public class UseIndex {
	public static void main(String[] args) {
		String ssn = "000518-3111111";
		char gender = ssn.charAt(7);	// -다음의 문자 추출
		if(gender=='1' || gender=='3') {
			System.out.println("남성입니다.");
		}else if(gender=='2' || gender=='4') {
			System.out.println("여성입니다.");
		}else {
			System.out.println("주민등록번호의 형식이 잘못되었습니다.");
		}
		
		String email = "abc@gmail,com";
		if(email.indexOf('@')<0 || email.indexOf('.')<0){
			System.out.println("잘못된 이메일 형식입니다.");
		}
	}
}