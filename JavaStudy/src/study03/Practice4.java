package study03;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("�ҹ��� ���ĺ� �ϳ� �Է� >> ");
		String str = scan.next(); // ���ڿ� �ޱ�
		char c = str.charAt(0); // ASCII �ڵ� ������ ����ϱ� ���� ���ڷ� ��ȯ

		// a=97, b=98, c=99, d=100 ...
		for (int i = c; i >= 'a'; i--) {
			for (int j = 'a'; j <= i; j++)
				System.out.print((char) j); // ���ڷ� ����ϱ� ���� ����ȯ

			System.out.println();
		}

		scan.close();

	}

}
