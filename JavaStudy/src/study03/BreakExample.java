package study03;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("exit�� �Է��ϸ� �����մϴ�.");

		while (true) {
			System.out.print(">>");
			String text = scan.nextLine(); // �� ���� �б�

			if (text.equals("exit")) // "exit"�� �ԷµǸ� �ݺ� ����
				break; // while ���� ���
		}

		System.out.println("�����մϴ�.");

		scan.close();

	}

}
