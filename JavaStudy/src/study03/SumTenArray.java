package study03;

import java.util.Scanner;

public class SumTenArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tenArray[] = new int[10];
		int sum = 0;

		System.out.print("���� 10�� �Է� >> ");

		for (int i = 0; i < tenArray.length; i++) {
			tenArray[i] = scan.nextInt();
			sum += tenArray[i];
		}
		System.out.println("���� " + sum);

	}

}
