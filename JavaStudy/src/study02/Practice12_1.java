package study02;

import java.util.Scanner;

public class Practice12_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("���� >> ");
		int number1 = scan.nextInt();
		String operator = scan.next();
		int number2 = scan.nextInt();

		if (operator.equals("+"))
			System.out.println(number1 + " + " + number2 + "�� ��� ����� " + (number1 + number2));
		else if (operator.equals("-"))
			System.out.println(number1 + " - " + number2 + "�� ��� ����� " + (number1 - number2));
		else if (operator.equals("*"))
			System.out.println(number1 + " * " + number2 + "�� ��� ����� " + (number1 * number2));
		else if (operator.equals("/")) {
			if (number2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�");
				return;
			}
			System.out.println(number1 + " / " + number2 + "�� ��� ����� " + (number1 / number2));
		} else
			System.out.println("��ȿ���� ���� ��");

	}

}