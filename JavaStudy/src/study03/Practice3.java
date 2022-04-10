package study03;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("정수를 입력하시오 >> ");
		int number = scan.nextInt();

		for (int i = 0; i < number; i++) {
			for (int j = i; j < number; j++) // j값에 현재 i값을 저장
				System.out.print("*");

			System.out.println();
		}

		scan.close();
	}

}
