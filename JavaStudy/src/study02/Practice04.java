package study02;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int resultNumber = 0;

		System.out.print("���� 3�� �Է� >> ");

		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();

		if (number1 >= number2) {
			if (number1 <= number3)
				resultNumber = number1;
			else if (number2 >= number3)
				resultNumber = number2;
			else
				resultNumber = number3;
		} else if (number1 < number2) {
			if (number1 >= number3)
				resultNumber = number1;
			else if (number2 <= number3)
				resultNumber = number2;
			else
				resultNumber = number3;
		}

		else if (number1 >= number3) {
			if (number1 <= number2)
				resultNumber = number1;
			else if (number2 <= number3)
				resultNumber = number2;
			else
				resultNumber = number3;
		} else if (number1 < number3) {
			if (number1 >= number2)
				resultNumber = number1;
			else if (number2 >= number3)
				resultNumber = number3;
			else
				resultNumber = number2;
		}

		else if (number2 <= number3) {
			if (number1 <= number2)
				resultNumber = number2;
			else if (number1 >= number3)
				resultNumber = number3;
			else
				resultNumber = number1;
		} else if (number2 > number3) {
			if (number1 >= number2)
				resultNumber = number2;
			else if (number1 <= number3)
				resultNumber = number1;
			else
				resultNumber = number3;
		}

		System.out.println("�߰����� " + resultNumber);
	}

}
