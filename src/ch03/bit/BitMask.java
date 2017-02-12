package ch03.bit;

public class BitMask {

	public static void main(String[] args) {
		int homeElecStatus = 0;
		int tv = 0b1;
		String result = "";
		result = (homeElecStatus & tv) > 0 ? "켜짐" : "꺼짐";
		System.out.println("tv 상태 : " + result);

		// tv 켜기
		homeElecStatus |= tv;
		result = (homeElecStatus & tv) > 0 ? "켜짐" : "꺼짐";
		System.out.println("tv 상태(켜기) : " + result);

		// tv 상태 반전
		homeElecStatus ^= tv;
		result = (homeElecStatus & tv) > 0 ? "켜짐" : "꺼짐";
		System.out.println("tv 상태(반전) : " + result);

		// tv 끄기
		homeElecStatus &= ~tv;
		result = (homeElecStatus & tv) > 0 ? "켜짐" : "꺼짐";
		System.out.println("tv 상태(끄기) : " + result);

	}

}
