package study03;

import java.util.Scanner;

public class ComputerRockPaperScissors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String computerString[] = { "가위", "바위", "보" };

		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

		while (true) {
			System.out.print("가위 바위 보! >> ");
			String inputString = scan.next();
			int random = (int) (Math.random() * 3);

			if (inputString.equals("그만"))
				break;

			System.out.print("사용자 = " + inputString + ", 컴퓨터 = " + computerString[random] + ", ");

			if (inputString.equals("가위")) {
				if (computerString[random].equals("가위"))
					System.out.println("비겼습니다.");
				else if (computerString[random].equals("바위"))
					System.out.println("컴퓨터가 이겼습니다.");
				else if (computerString[random].equals("보"))
					System.out.println("사용자가 이겼습니다.");
			} else if (inputString.equals("바위")) {
				if (computerString[random].equals("가위"))
					System.out.println("사용자가 이겼습니다.");
				else if (computerString[random].equals("바위"))
					System.out.println("비겼습니다.");
				else if (computerString[random].equals("보"))
					System.out.println("컴퓨터가 이겼습니다.");
			} else if (inputString.equals("보")) {
				if (computerString[random].equals("가위"))
					System.out.println("컴퓨터가 이겼습니다.");
				else if (computerString[random].equals("바위"))
					System.out.println("사용자가 이겼습니다.");
				else if (computerString[random].equals("보"))
					System.out.println("비겼습니다.");
			} else
				System.out.println("잘못 입력하셨습니다.");
		}

		scan.close();
	}

}
