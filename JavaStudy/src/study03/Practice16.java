package study03;

import java.util.Scanner;

public class Practice16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String computerString[] = { "가위", "바위", "보" };

		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

		while (true) {
			System.out.print("가위 바위 보! >> ");
			String inputString = scan.next();
			int random = (int) (Math.random() * 3); // 컴퓨터가 가위, 바위, 보를 랜덤하게 낸다

			// 그만을 입력 받을경우 프로그램 종료
			if (inputString.equals("그만"))
				return;

			System.out.print("사용자 = " + inputString + ", 컴퓨터 = " + computerString[random] + ", ");

			// 사용자에게 가위를 입력받았을 경우
			if (inputString.equals("가위")) {
				if (computerString[random].equals("가위"))
					System.out.println("비겼습니다.");
				else if (computerString[random].equals("바위"))
					System.out.println("컴퓨터가 이겼습니다.");
				else if (computerString[random].equals("보"))
					System.out.println("사용자가 이겼습니다.");
			}
			// 사용자에게 바위를 입력받았을 경우
			else if (inputString.equals("바위")) {
				if (computerString[random].equals("가위"))
					System.out.println("사용자가 이겼습니다.");
				else if (computerString[random].equals("바위"))
					System.out.println("비겼습니다.");
				else if (computerString[random].equals("보"))
					System.out.println("컴퓨터가 이겼습니다.");
			}
			// 사용자에게 보를 입력받았을 경우
			else if (inputString.equals("보")) {
				if (computerString[random].equals("가위"))
					System.out.println("컴퓨터가 이겼습니다.");
				else if (computerString[random].equals("바위"))
					System.out.println("사용자가 이겼습니다.");
				else if (computerString[random].equals("보"))
					System.out.println("비겼습니다.");
			} else
				System.out.println("잘못 입력하셨습니다.");
		}
	}

}
