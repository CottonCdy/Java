package study03;

import java.util.Scanner;

public class TwoArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String course[] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score[] = { 95, 88, 76, 62, 55 };

		while (true) {
			System.out.print("���� �̸� >>> ");
			String inputString = scan.next();

			if (inputString.equals("�׸�"))
				break;

			for (int i = 0; i < course.length; i++) {
				if (inputString.equals(course[i])) {
					System.out.println(course[i] + "�� ������ " + score[i]);
					break;
				}

				if (course.length - 1 == i)
					System.out.println("���� �����Դϴ�.");
			}
		}

		scan.close();
	}

}
