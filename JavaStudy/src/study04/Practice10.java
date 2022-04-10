package study04;

import java.util.Scanner;

public class Practice10 {
	private Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Practice10 dicApp = new Practice10();
		dicApp.run();
	}

	private void run() {
		System.out.println("�ѱ� �ܾ� �˻� ���α׷��Դϴ�.");
		while (true) {
			System.out.print("�ѱ� �ܾ�? >> ");
			String word = scan.next();

			// �׸��� �Է��ϸ� ���α׷� ����
			if (word.equals("�׸�"))
				return;

			String resultWord = Dictionary.kor2Eng(word); // �ܾ �ִ��� Ȯ��
			System.out.println(word + resultWord); // ��� ���
		}
	}
}

class Dictionary {
	private static String[] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	// �˻� �޼ҵ�
	public static String kor2Eng(String word) {
		for (int i = 0; i < kor.length; i++) {
			if (kor[i].equals(word))
				return "�� " + eng[i];
		}
		return "�� ���� ������ �����ϴ�."; // �迭�� ��ȸ�ص� ���� ������ ������ ���ڿ� ����
	}
}