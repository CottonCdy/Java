package study02;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("������ �Է��ϼ��� : ");
		int time = scan.nextInt(); // ���� �Է�
		int second = time % 60; // 60���� ���� ������ ��
		int minute = (time / 60) % 60; // 60���� ���� ���� �ٽ� 60���� ���� �������� ��
		int hour = (time / 60) / 60; // 60���� ���� ���� �ٽ� 60���� ���� ���� �ð�)

		System.out.print(time + "�ʴ� ");
		System.out.print(hour + "�ð� ");
		System.out.print(minute + "�� ");
		System.out.print(second + "�� �Դϴ�.");
		scan.close();
	}

}
