package study03;

import java.util.Scanner;

public class WhileSample {
	public static void main(String[] args) {
		int count = 0; // count�� �Էµ� ������ ����
		int sum = 0; // sum�� ��

		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϰ� �������� -1�� �Է��ϼ��� : ");
		;

		int n = scan.nextInt();

		while (n != -1) // -1�� �ԷµǸ� while�� Ż��
		{
			sum += n;
			count++;
			n = scan.nextInt();
		}

		if (count == 0)
			System.out.println("�Էµ� ���� �����ϴ�");
		else {
			System.out.print("������ ������ " + count + "���̸� ");
			System.out.print("����� " + (double) sum / count + "�Դϴ�");
		}
		scan.close();
	}

}
