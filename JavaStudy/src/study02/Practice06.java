package study02;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result;
		int count = 0;

		System.out.println("1~99 사이의 정수를 입력하시오 >>> ");
		int number = scan.nextInt();

		if (number < 1 || number > 99) {
			System.out.println("범위를 벗어났습니다.");
			return;
		}

		result = number / 10;
		number %= 10;
		if ((result == 3) || (result == 6) || (result == 9)) {
			count++;
		}

		result = number / 1;
		if ((result == 3) || (result == 6) || (result == 9)) {
			count++;
		}

		if (count >= 1) {
			if (count >= 2)
				System.out.println("박수짝짝");
			else
				System.out.println("박수짝");
		} else
			System.out.println("3, 6, 9 미포함");

	}

}
