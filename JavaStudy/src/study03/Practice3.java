package study03;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("������ �Է��Ͻÿ� >> ");
		int number = scan.nextInt();

		for (int i = 0; i < number; i++) {
			for (int j = i; j < number; j++) // j���� ���� i���� ����
				System.out.print("*");

			System.out.println();
		}

		scan.close();
	}

}
