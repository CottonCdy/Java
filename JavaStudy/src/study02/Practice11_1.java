package study02;

import java.util.Scanner;

public class Practice11_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("���� �Է��ϼ���(1~12) >> ");

		int input = scan.nextInt();

		if (input >= 3 && input <= 5)
			System.out.println("��");
		else if (input >= 6 && input <= 8)
			System.out.println("����");
		else if (input >= 9 && input <= 11)
			System.out.println("����");
		else if (input <= 12 && input >= 1)
			System.out.println("�ܿ�");
		else
			System.out.println("�߸� �Է�");

		scan.close();
	}

}
