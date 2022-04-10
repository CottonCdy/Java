package study04;

import java.util.Scanner;

public class Practice10 {
	private Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Practice10 dicApp = new Practice10();
		dicApp.run();
	}

	private void run() {
		System.out.println("한글 단어 검색 프로그램입니다.");
		while (true) {
			System.out.print("한글 단어? >> ");
			String word = scan.next();

			// 그만을 입력하면 프로그램 종료
			if (word.equals("그만"))
				return;

			String resultWord = Dictionary.kor2Eng(word); // 단어가 있는지 확인
			System.out.println(word + resultWord); // 결과 출력
		}
	}
}

class Dictionary {
	private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	// 검색 메소드
	public static String kor2Eng(String word) {
		for (int i = 0; i < kor.length; i++) {
			if (kor[i].equals(word))
				return "은 " + eng[i];
		}
		return "는 저의 사전에 없습니다."; // 배열을 순회해도 값이 없으면 지정된 문자열 리턴
	}
}