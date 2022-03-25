package study03;

import java.util.Scanner;

public class AlphabetPrint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("소문자 알파벳 하나 입력 >> ");
		String str = scan.next();
		char c = str.charAt(0);

		for (int i = 'a'; i <= c; i++) {
			for (int j = i; j <= c; j++)
				System.out.print((char) j);

			System.out.println();
		}

		scan.close();

	}

}
