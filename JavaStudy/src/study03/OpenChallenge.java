package study03;

import java.util.Random;
import java.util.Scanner;

// 0���� 99������ ������ ���� ���� ī�带 �� �� ����� �� ī���� ���� ���ߴ� ����

public class OpenChallenge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ���� �Է��� ���ڰ� ���� ���ں��� �� ������ max�� ���� �� ����, �ƴϸ� min�� ����
		int max = 99, min = 0;
		int i = 0; // �� ��° �Է������� ī��Ʈ

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

				if (number < k) { // �Է��� ���ڰ� ���� ���ں��� ������
					System.out.println("�� ����");
					// min�� ���簪 ����
					// ex) ���� ���� 30, ���� ���ڰ� 50�� ��, 30(min)-99(max) ���̿� ������ �ִٴ� ��Ʈ�� �ش�
					min = number; //
				} else if (number > k) { // �Է��� ���ڰ� ���� ���ں��� ũ��
					System.out.println("�� ����");
					// max�� ���簪 ����
					// ex) ���� ���� 70, ���� ���ڰ� 50�� ��, 0(min)-70(max) ���̿� ������ �ִٴ� ��Ʈ�� �ش�
					max = number;
				} else { // ���ڸ� ���߸�
					System.out.println("�¾ҽ��ϴ�.");
					break;
				}

				System.out.println(min + "-" + max);
				i++; // 1��°, 2��°, 3��° ...
			}

			System.out.print("�ٽ��Ͻðڽ��ϱ�?(y/n)>> ");
			scan.nextLine();
			String str = scan.nextLine();

			// ���� �ٽ� ���� ����
			if (str.equals("y") || str.equals("Y"))
				continue; // �ٽ� ����
			else if (str.equals("n") || str.equals("N"))
				return; // ����
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				return; // ����
			}
		}
	}

}
