package study02;

import java.util.Scanner;

public class Practice11_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("달을 입력하세요(1~12) >> ");

		int input = scan.nextInt();

		if (input >= 3 && input <= 5)
			System.out.println("봄");
		else if (input >= 6 && input <= 8)
			System.out.println("여름");
		else if (input >= 9 && input <= 11)
			System.out.println("가을");
		else if (input <= 12 && input >= 1)
			System.out.println("겨울");
		else
			System.out.println("잘못 입력");

		scan.close();
	}

}
