package study03;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int unit[] = { 50000, 10000, 1000, 500, 100, 50, 10, 1 }; // ȯ���� ���� ����
		int count = 0; // ���� ����

		System.out.print("�ݾ��� �Է��Ͻÿ� >> ");
		int money = scan.nextInt();

		for (int i = 0; i < unit.length; i++) {
			while (true) {
				// money�� ȯ���� ������ ������ break �� ���� index������ ȯ��
				// ex) 49999 < 50000
				if (money < unit[i])
					break;

				// ���� ���� ī��Ʈ
				// ex) 49999 / 10000 -> count = 4
				count = money / unit[i];

				// ȯ�� �Ŀ� money�� ����
				// ex) 49999 % 10000 -> 9999
				money %= unit[i];

				System.out.println(unit[i] + "�� ¥�� : " + count + "��");
			}
		}
		scan.close();
	}
}
