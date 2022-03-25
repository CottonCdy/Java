package study03;

import java.util.Random;
import java.util.Scanner;

// 0에서 99까지의 임의의 수를 가진 카드를 한 장 숨기고 이 카드의 수를 맞추는 게임

public class CardGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 99, min = 0;
		int i = 0;

		while (true) {
			i = 0;
			max = 99;
			min = 0;
			Random r = new Random();
			int k = r.nextInt(100); // 0~99까지 임의의 정수 생성

			System.out.println("수를 결정하였습니다. 맞추어 보세요\n0~99");

			while (true) {
				System.out.print((i + 1) + " >> ");
				int number = scan.nextInt();

				if (number < k) {
					System.out.println("더 높게");
					min = number;
				} else if (number > k) {
					System.out.println("더 낮게");
					max = number;
				} else { // 숫자를 맞추면
					System.out.println("맞았습니다.");
					break;
				}

				System.out.println(min + "-" + max);
				i++;
			}

			System.out.print("다시하시겠습니까?(y/n)>> ");
			scan.nextLine();
			String str = scan.nextLine();

			if (str.equals("y") || str.equals("Y"))
				continue;
			else if (str.equals("n") || str.equals("N"))
				return;
			else {
				System.out.println("잘못 입력하셨습니다.");
				return;
			}
		}
	}

}
