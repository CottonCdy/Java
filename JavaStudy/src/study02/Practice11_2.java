package study02;

import java.util.Scanner;

public class Practice11_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("달을 입력하세요(1~12) >> ");

		int input = scan.nextInt();

		switch (input) {
		case 3, 4, 5:
			System.out.println("봄");
			break;
		case 6, 7, 8:
			System.out.println("여름");
			break;
		case 9, 10, 11:
			System.out.println("가을");
			break;
		case 12, 1, 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못 입력");
		}

		scan.close();
	}

}
