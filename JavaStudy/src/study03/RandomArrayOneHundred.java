package study03;

import java.util.Scanner;

public class RandomArrayOneHundred {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int array[];
		int count = 0;

		System.out.print("���� �? ");
		int inputNumber = scan.nextInt();

		if (inputNumber > 100 || inputNumber <= 1) {
			System.out.println("1~100 ������ ���ڸ� �Է� �����մϴ�");
			return;
		}

		array = new int[inputNumber];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100 + 1);
			System.out.print(array[i] + " ");
			count++;

			if (count % 10 == 0)
				System.out.println();
		}
	}

}
