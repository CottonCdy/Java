package study02;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("정수 3개를 입력하시오 >> ");

		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();

		if ((number1 + number2) > number3)
			System.out.println("삼각형이 됩니다.");
		else if ((number1 + number3) > number2)
			System.out.println("삼각형이 됩니다.");
		else if ((number2 + number3) > number1)
			System.out.println("삼각형이 됩니다.");
		else
			System.out.println("삼각형이 안됩니다");

		scan.close();
	}

}
