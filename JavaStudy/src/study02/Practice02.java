package study02;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("2�ڸ��� ���� �Է�(10~99) >> ");
		int number = scan.nextInt();

		if (number < 10 || number > 99) {
			System.out.println("10~99 ���� ���ڸ� �Է� �����մϴ�");
			return;
		}

		if ((number / 10) == (number % 10))
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else
			System.out.println("10�� �ڸ��� 1�� �ڸ��� Ʋ���ϴ�.");
	}

}
