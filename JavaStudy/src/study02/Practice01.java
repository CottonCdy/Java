package study02;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��ȭ�� �Է��ϼ���(���� ��) >> ");
		int money = scan.nextInt();
		double rate = 1100;

		double dollar = money / rate;
		System.out.println(money + "���� $" + dollar + "�Դϴ�.");
	}

}
