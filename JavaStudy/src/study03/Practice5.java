package study03;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number[] = new int[10];
		System.out.print("���� ���� 10���� �Է��Ͻÿ� >> ");

		for (int i = 0; i < number.length; i++)
			number[i] = scan.nextInt(); // 10���� ������ number �迭�� �ϳ��� ����

		System.out.print("3�� ����� ");

		// forEach�� ���
		for (int value : number) {
			if (value % 3 == 0) // 3�� ����� ���ϴ� ���ǹ�
				System.out.print(value + " ");
		}
	}
}