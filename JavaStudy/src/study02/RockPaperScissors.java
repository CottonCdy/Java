package study02;

import java.util.Scanner;

/*
 * �� ����� �ϴ� ���������� ������ ������. �� ����� �̸��� "ö��"�� "����"�̴�. ���� "ö�� >>"��
 * ����ϰ� "����", "����", "��" �� �ϳ��� ���ڿ��� �Է¹޴´�. �׸��� "���� >>"�� ����ϰ� ����������
 * �Է¹޴´�. �Է¹��� ���ڿ��� ���Ͽ� ���� �̰���� �Ǻ��Ͽ� ���ڸ� ����Ѵ�.
 */
public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���.");
		System.out.print("ö�� >> ");
		String firstResult = scan.next();
		System.out.print("���� >> ");
		String secondResult = scan.next();

		if (firstResult.equals("����")) {
			if (secondResult.equals("����"))
				System.out.println("�����ϴ�");
			else if (secondResult.equals("����"))
				System.out.println("���� �̰���ϴ�.");
			else if (secondResult.equals("��"))
				System.out.println("ö���� �̰���ϴ�.");
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				return;
			}
		} else if (firstResult.equals("����")) {
			if (secondResult.equals("����"))
				System.out.println("ö���� �̰���ϴ�.");
			else if (secondResult.equals("����"))
				System.out.println("�����ϴ�");
			else if (secondResult.equals("��"))
				System.out.println("���� �̰���ϴ�.");
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				return;
			}

		} else if (firstResult.equals("��")) {
			if (secondResult.equals("����"))
				System.out.println("���� �̰���ϴ�.");
			else if (secondResult.equals("����"))
				System.out.println("ö���� �̰���ϴ�");
			else if (secondResult.equals("��"))
				System.out.println("�����ϴ�");
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				return;
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return;
		}
	}

}
