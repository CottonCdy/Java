package study02;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("���� 3���� �Է��Ͻÿ� >> ");

		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();

		if ((number1 + number2) > number3)
			System.out.println("�ﰢ���� �˴ϴ�.");
		else if ((number1 + number3) > number2)
			System.out.println("�ﰢ���� �˴ϴ�.");
		else if ((number2 + number3) > number1)
			System.out.println("�ﰢ���� �˴ϴ�.");
		else
			System.out.println("�ﰢ���� �ȵ˴ϴ�");

		scan.close();
	}

}
