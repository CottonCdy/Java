package study03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("곱하고자 하는 두 수 입력 >> ");

			try {
				int n = scan.nextInt();
				int m = scan.nextInt();
				System.out.print(n + "x" + m + "=" + (n * m));
				break;
			} catch (InputMismatchException e) { // 정수형 변수에 정수가 아닌 값이 들어오면 예외
				System.out.println("실수는 입력하면 안됩니다.");
				// 버퍼 비우기
				// ex) int n = 2.5 3\n(엔터)를 입력
				// ---Queue---
				// enter 3 2.5 <- 큐에 2.5가 계속 남아 있어서 큐를 비우지 않으면 무한반복
				// -----------
				scan.nextLine();
			}
		}
		scan.close();
	}
}
