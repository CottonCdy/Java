package study03;

import java.util.Scanner;

public class DrawStar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("정수를 입력하시오 >> ");
		int number = scan.nextInt();

		for (int i = 0; i < number; i++) {
			for (int j = i; j < number; j++)
				System.out.print("*");

			System.out.println();
		}

		scan.close();
	}

}
