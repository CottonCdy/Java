package study02;

import java.util.Scanner;

public class Practice12_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("���� >> ");
		int number1 = scan.nextInt();
		String operator = scan.next();
		int number2 = scan.nextInt();

		switch (operator) {
		case "+":
			System.out.println(number1 + " + " + number2 + "�� ��� ����� " + (number1 + number2));
			break;
		case "-":
			System.out.println(number1 + " - " + number2 + "�� ��� ����� " + (number1 - number2));
			break;
		case "*":
			System.out.println(number1 + " * " + number2 + "�� ��� ����� " + (number1 * number2));
			break;
		case "/":
			System.out.println(number1 + " / " + number2 + "�� ��� ����� " + (number1 / number2));
			break;
		default:
			System.out.println("��ȿ���� ���� ��");

		}

	}

}
