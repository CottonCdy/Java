package study03;

import java.util.Random;
import java.util.Scanner;

// 0에서 99까지의 임의의 수를 가진 카드를 한 장 숨기고 이 카드의 수를 맞추는 게임

public class OpenChallenge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 현재 입력한 숫자가 랜덤 숫자보다 더 낮으면 max에 현재 값 저장, 아니면 min에 저장
		int max = 99, min = 0;
		int i = 0; // 몇 번째 입력중인지 카운트

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

				if (number < k) { // 입력한 숫자가 랜덤 숫자보다 작으면
					System.out.println("더 높게");
					// min에 현재값 저장
					// ex) 현재 값이 30, 랜덤 숫자가 50일 때, 30(min)-99(max) 사이에 정답이 있다는 힌트를 준다
					min = number; //
				} else if (number > k) { // 입력한 숫자가 랜덤 숫자보다 크면
					System.out.println("더 낮게");
					// max에 현재값 저장
					// ex) 현재 값이 70, 랜덤 숫자가 50일 때, 0(min)-70(max) 사이에 정답이 있다는 힌트를 준다
					max = number;
				} else { // 숫자를 맞추면
					System.out.println("맞았습니다.");
					break;
				}

				System.out.println(min + "-" + max);
				i++; // 1번째, 2번째, 3번째 ...
			}

			System.out.print("다시하시겠습니까?(y/n)>> ");
			scan.nextLine();
			String str = scan.nextLine();

			// 게임 다시 시작 여부
			if (str.equals("y") || str.equals("Y"))
				continue; // 다시 시작
			else if (str.equals("n") || str.equals("N"))
				return; // 종료
			else {
				System.out.println("잘못 입력하셨습니다.");
				return; // 종료
			}
		}
	}

}
