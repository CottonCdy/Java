package study03;

import java.util.Scanner;

public class ExchangeMoney {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int unit[] = { 50000, 10000, 1000, 500, 100, 50, 10, 1 }; // 환산할 돈의 종류
		int count = 0;

		System.out.print("금액을 입력하시오 >> ");
		int money = scan.nextInt();

		for (int i = 0; i < unit.length; i++) {

			while (true) {
				if (money < unit[i])
					break;

				count = money / unit[i];
				money %= unit[i];

				System.out.println(unit[i] + "원 짜리 : " + count + "개");
			}
		}

	}

}
