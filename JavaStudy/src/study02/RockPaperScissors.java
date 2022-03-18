package study02;

import java.util.Scanner;

/*
 * 두 사람이 하는 가위바위보 게임을 만들어보자. 두 사람의 이름은 "철수"와 "영희"이다. 먼저 "철수 >>"을
 * 출력하고 "가위", "바위", "보" 중 하나를 문자열로 입력받는다. 그리고 "영희 >>"를 출력하고 마찬가지로
 * 입력받는다. 입력받은 문자열을 비교하여 누가 이겼는지 판별하여 승자를 출력한다.
 */
public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
		System.out.print("철수 >> ");
		String firstResult = scan.next();
		System.out.print("영희 >> ");
		String secondResult = scan.next();

		if (firstResult.equals("가위")) {
			if (secondResult.equals("가위"))
				System.out.println("비겼습니다");
			else if (secondResult.equals("바위"))
				System.out.println("영희가 이겼습니다.");
			else if (secondResult.equals("보"))
				System.out.println("철수가 이겼습니다.");
			else {
				System.out.println("잘못 입력하셨습니다.");
				return;
			}
		} else if (firstResult.equals("바위")) {
			if (secondResult.equals("가위"))
				System.out.println("철수가 이겼습니다.");
			else if (secondResult.equals("바위"))
				System.out.println("비겼습니다");
			else if (secondResult.equals("보"))
				System.out.println("영희가 이겼습니다.");
			else {
				System.out.println("잘못 입력하셨습니다.");
				return;
			}

		} else if (firstResult.equals("보")) {
			if (secondResult.equals("가위"))
				System.out.println("영희가 이겼습니다.");
			else if (secondResult.equals("바위"))
				System.out.println("철수가 이겼습니다");
			else if (secondResult.equals("보"))
				System.out.println("비겼습니다");
			else {
				System.out.println("잘못 입력하셨습니다.");
				return;
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
	}

}
