package study03;

import java.util.Scanner;

public class Practice14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String course[] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score[] = { 95, 88, 76, 62, 55 };

		while (true) {
			System.out.print("���� �̸� >>> ");
			String inputString = scan.next();

			// �Է¹��� ���� "�׸�"�� ��� ���α׷� ����
			if (inputString.equals("�׸�"))
				return;

			for (int i = 0; i < course.length; i++) {
				// �Է¹��� ���� course�迭 �ȿ� ������ ���� ���
				if (inputString.equals(course[i])) {
					System.out.println(course[i] + "�� ������ " + score[i]);
					break;
				}

				// course �迭�� ������ ��� ���
				// ex) course.length = 3
				// course.length - 1 = 2, i = 2
				if (course.length - 1 == i)
					System.out.println("���� �����Դϴ�.");
			}
		}
	}
}
