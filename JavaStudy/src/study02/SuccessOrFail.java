package study02;

import java.util.Scanner;

public class SuccessOrFail {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.printf("������ �Է��Ͻÿ� : ");
		int score = scan.nextInt();

		if (score >= 80)
			System.out.println("�����մϴ�! �հ��Դϴ�.");

		scan.close();
	}

}
