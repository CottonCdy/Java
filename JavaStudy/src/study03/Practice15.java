package study03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("���ϰ��� �ϴ� �� �� �Է� >> ");

			try {
				int n = scan.nextInt();
				int m = scan.nextInt();
				System.out.print(n + "x" + m + "=" + (n * m));
				break;
			} catch (InputMismatchException e) { // ������ ������ ������ �ƴ� ���� ������ ����
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				// ���� ����
				// ex) int n = 2.5 3\n(����)�� �Է�
				// ---Queue---
				// enter 3 2.5 <- ť�� 2.5�� ��� ���� �־ ť�� ����� ������ ���ѹݺ�
				// -----------
				scan.nextLine();
			}
		}
		scan.close();
	}
}
