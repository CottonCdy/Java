package study02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("2개의 정수 입력 : ");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();

		int sum = number1 + number2;
		System.out.println(sum);
	}

}
