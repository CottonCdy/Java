package study04;

import java.util.Scanner;

public class OpenChallenge {
	private Scanner scan = new Scanner(System.in);
	private String word = "�ƹ���";
	private Player player[];

	public OpenChallenge() {
		System.out.println("�����ձ� ������ �����մϴ�");
		System.out.println("�����ϴ� �ܾ�� \"�ƹ���\" �Դϴ�.");
	}

	public static void main(String[] args) {
		OpenChallenge wordGameApp = new OpenChallenge();
		wordGameApp.run();
	}

	// ������ ��ü������ �����ϴ� run() �޼ҵ�
	public void run() {
		String inputWord; // �Է¹��� �ܾ ������ ����
		boolean check; // �������� �������� üũ

		createPlayers(); // ������ ���� �޼ҵ�

		for (int i = 0; i < player.length; i++) {
			inputWord = player[i].getWordFromUser(); // ����ڷκ��� �ܾ� �Է� �ޱ�
			check = player[i].checkSuccess(word); // �Է¹��� �ܾ ������ üũ

			if (!check) { // �ܾ ��ȿ���� ������ �й�
				System.out.println(player[i].getName() + "�� �����ϴ�.");
				break;
			}

			word = inputWord; // ���� �ܾ �Է¹��� �ܾ�� ����

			// �迭�� �ε����� �Ѿ�� 0�� �ǵ��� i�� ����
			if (i == player.length - 1)
				i = -1;
		}
	}

	private void createPlayers() {
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ� >> ");
		int number = scan.nextInt();
		scan.nextLine(); // ���� ����

		// �����ϴ� �ο���ŭ Player��ü �迭 ����
		player = new Player[number];

		for (int i = 0; i < player.length; i++) {
			System.out.print("�������� �̸��� �Է��ϼ��� >>");
			String name = scan.nextLine();
			player[i] = new Player(name); // ��ü ����
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

		// ���� �ܾ��� �� ���ڿ� �Է¹��� �ܾ��� ù ���ڰ� ������ true, �ƴϸ� false
		if (lastChar == firstChar)
			return true;
		else
			return false;
	}
}