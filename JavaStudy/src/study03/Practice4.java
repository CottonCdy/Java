package study03;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("소문자 알파벳 하나 입력 >> ");
		String str = scan.next(); // 문자열 받기
		char c = str.charAt(0); // ASCII 코드 값으로 계산하기 위해 문자로 변환

		// a=97, b=98, c=99, d=100 ...
		for (int i = c; i >= 'a'; i--) {
			for (int j = 'a'; j <= i; j++)
				System.out.print((char) j); // 문자로 출력하기 위해 형변환

			System.out.println();
		}

		scan.close();

	}

}
