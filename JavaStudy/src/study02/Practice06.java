package study02;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result;
		int count = 0;

		System.out.println("1~99 ������ ������ �Է��Ͻÿ� >>> ");
		int number = scan.nextInt();

		if (number < 1 || number > 99) {
			System.out.println("������ ������ϴ�.");
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
				System.out.println("�ڼ�¦¦");
			else
				System.out.println("�ڼ�¦");
		} else
			System.out.println("3, 6, 9 ������");

	}

}
