package study02;

import java.util.Scanner;

public class Practice11_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("���� �Է��ϼ���(1~12) >> ");

		int input = scan.nextInt();

		switch (input) {
		case 3, 4, 5:
			System.out.println("��");
			break;
		case 6, 7, 8:
			System.out.println("����");
			break;
		case 9, 10, 11:
			System.out.println("����");
			break;
		case 12, 1, 2:
			System.out.println("�ܿ�");
			break;
		default:
			System.out.println("�߸� �Է�");
		}

		scan.close();
	}

}
