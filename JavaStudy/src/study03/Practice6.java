package study03;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int unit[] = { 50000, 10000, 1000, 500, 100, 50, 10, 1 }; // 환산할 돈의 종류
		int count = 0; // 지폐 개수

		System.out.print("금액을 입력하시오 >> ");
		int money = scan.nextInt();

		for (int i = 0; i < unit.length; i++) {
			while (true) {
				// money가 환산할 돈보다 작으면 break 후 다음 index값으로 환산
				// ex) 49999 < 50000
				if (money < unit[i])
					break;

				// 지폐 개수 카운트
				// ex) 49999 / 10000 -> count = 4
				count = money / unit[i];

				// 환산 후에 money값 변경
				// ex) 49999 % 10000 -> 9999
				money %= unit[i];

				System.out.println(unit[i] + "원 짜리 : " + count + "개");
			}
		}
		scan.close();
	}
}
