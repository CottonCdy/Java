package study03;

import java.util.Random;
import java.util.Scanner;

// 0���� 99������ ������ ���� ���� ī�带 �� �� ����� �� ī���� ���� ���ߴ� ����

public class CardGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 99, min = 0;
		int i = 0;

		while (true) {
			i = 0;
			max = 99;
			min = 0;
			Random r = new Random();
			int k = r.nextInt(100); // 0~99���� ������ ���� ����

			System.out.println("���� �����Ͽ����ϴ�. ���߾� ������\n0~99");

			while (true) {
				System.out.print((i + 1) + " >> ");
				int number = scan.nextInt();

				if (number < k) {
					System.out.println("�� ����");
					min = number;
				} else if (number > k) {
					System.out.println("�� ����");
					max = number;
				} else { // ���ڸ� ���߸�
					System.out.println("�¾ҽ��ϴ�.");
					break;
				}

				System.out.println(min + "-" + max);
				i++;
			}

			System.out.print("�ٽ��Ͻðڽ��ϱ�?(y/n)>> ");
			scan.nextLine();
			String str = scan.nextLine();

			if (str.equals("y") || str.equals("Y"))
				continue;
			else if (str.equals("n") || str.equals("N"))
				return;
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				return;
			}
		}
	}

}
