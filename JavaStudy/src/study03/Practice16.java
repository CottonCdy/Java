package study03;

import java.util.Scanner;

public class Practice16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String computerString[] = { "����", "����", "��" };

		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");

		while (true) {
			System.out.print("���� ���� ��! >> ");
			String inputString = scan.next();
			int random = (int) (Math.random() * 3); // ��ǻ�Ͱ� ����, ����, ���� �����ϰ� ����

			// �׸��� �Է� ������� ���α׷� ����
			if (inputString.equals("�׸�"))
				return;

			System.out.print("����� = " + inputString + ", ��ǻ�� = " + computerString[random] + ", ");

			// ����ڿ��� ������ �Է¹޾��� ���
			if (inputString.equals("����")) {
				if (computerString[random].equals("����"))
					System.out.println("�����ϴ�.");
				else if (computerString[random].equals("����"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else if (computerString[random].equals("��"))
					System.out.println("����ڰ� �̰���ϴ�.");
			}
			// ����ڿ��� ������ �Է¹޾��� ���
			else if (inputString.equals("����")) {
				if (computerString[random].equals("����"))
					System.out.println("����ڰ� �̰���ϴ�.");
				else if (computerString[random].equals("����"))
					System.out.println("�����ϴ�.");
				else if (computerString[random].equals("��"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}
			// ����ڿ��� ���� �Է¹޾��� ���
			else if (inputString.equals("��")) {
				if (computerString[random].equals("����"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else if (computerString[random].equals("����"))
					System.out.println("����ڰ� �̰���ϴ�.");
				else if (computerString[random].equals("��"))
					System.out.println("�����ϴ�.");
			} else
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

}
