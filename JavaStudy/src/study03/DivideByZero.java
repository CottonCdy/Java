package study03;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dividend; // ������
		int divisor; // ������

		System.out.print("�������� �Է��Ͻÿ� : ");
		dividend = scan.nextInt(); // ������ �Է�
		System.out.print("�������� �Է��Ͻÿ� : ");
		divisor = scan.nextInt(); // ������ �Է�

		System.out.println(dividend + "�� " + divisor + "�� ������ ���� " + dividend / divisor + "�Դϴ�");
		scan.close();
	}

}
