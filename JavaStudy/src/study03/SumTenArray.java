package study03;

import java.util.Scanner;

public class SumTenArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tenArray[] = new int[10];
		int sum = 0;

		System.out.print("숫자 10개 입력 >> ");

		for (int i = 0; i < tenArray.length; i++) {
			tenArray[i] = scan.nextInt();
			sum += tenArray[i];
		}
		System.out.println("합은 " + sum);

	}

}
