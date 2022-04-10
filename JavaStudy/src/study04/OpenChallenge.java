package study04;

import java.util.Scanner;

public class OpenChallenge {
	private Scanner scan = new Scanner(System.in);
	private String word = "아버지";
	private Player player[];

	public OpenChallenge() {
		System.out.println("끝말잇기 게임을 시작합니다");
		System.out.println("시작하는 단어는 \"아버지\" 입니다.");
	}

	public static void main(String[] args) {
		OpenChallenge wordGameApp = new OpenChallenge();
		wordGameApp.run();
	}

	// 게임을 전체적으로 진행하는 run() 메소드
	public void run() {
		String inputWord; // 입력받은 단어를 저장할 변수
		boolean check; // 정답인지 오답인지 체크

		createPlayers(); // 참가자 생성 메소드

		for (int i = 0; i < player.length; i++) {
			inputWord = player[i].getWordFromUser(); // 사용자로부터 단어 입력 받기
			check = player[i].checkSuccess(word); // 입력받은 단어가 옳은지 체크

			if (!check) { // 단어가 유효하지 않으면 패배
				System.out.println(player[i].getName() + "이 졌습니다.");
				break;
			}

			word = inputWord; // 현재 단어를 입력받은 단어로 변경

			// 배열의 인덱스가 넘어가면 0이 되도록 i값 변경
			if (i == player.length - 1)
				i = -1;
		}
	}

	private void createPlayers() {
		System.out.print("게임에 참가하는 인원은 몇명입니까 >> ");
		int number = scan.nextInt();
		scan.nextLine(); // 버퍼 비우기

		// 참가하는 인원만큼 Player객체 배열 선언
		player = new Player[number];

		for (int i = 0; i < player.length; i++) {
			System.out.print("참가자의 이름을 입력하세요 >>");
			String name = scan.nextLine();
			player[i] = new Player(name); // 객체 생성
		}
	}
}

class Player {
	private Scanner scan = new Scanner(System.in);
	private String name;
	private String word;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getWordFromUser() {
		System.out.print(name + " >> ");
		word = scan.nextLine();
		return word;
	}

	public boolean checkSuccess(String word) {
		char lastChar = word.charAt(word.length() - 1);
		char firstChar = this.word.charAt(0);

		// 현재 단어의 끝 문자와 입력받은 단어의 첫 문자가 같으면 true, 아니면 false
		if (lastChar == firstChar)
			return true;
		else
			return false;
	}
}