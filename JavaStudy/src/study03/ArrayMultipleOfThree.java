package study03;

import java.util.Scanner;

public class ArrayMultipleOfThree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number[] = new int[10];
		System.out.print("���� ���� 10���� �Է��Ͻÿ� >> ");

		for (int i = 0; i < number.length; i++)
			number[i] = scan.nextInt();

		System.out.print("3�� ����� ");

		for (int value : number) {
			if (value % 3 == 0)
				System.out.print(value + " ");
		}

	}

}
