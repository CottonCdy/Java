package study02;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("2자리수 정수 입력(10~99) >> ");
		int number = scan.nextInt();

		if (number < 10 || number > 99) {
			System.out.println("10~99 사이 숫자만 입력 가능합니다");
			return;
		}

		if ((number / 10) == (number % 10))
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		else
			System.out.println("10의 자리와 1의 자리가 틀립니다.");
	}

}
