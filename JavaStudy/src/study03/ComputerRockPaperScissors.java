package study03;

import java.util.Scanner;

public class ComputerRockPaperScissors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String computerString[] = { "����", "����", "��" };

		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");

		while (true) {
			System.out.print("���� ���� ��! >> ");
			String inputString = scan.next();
			int random = (int) (Math.random() * 3);

			if (inputString.equals("�׸�"))
				break;

			System.out.print("����� = " + inputString + ", ��ǻ�� = " + computerString[random] + ", ");

			if (inputString.equals("����")) {
				if (computerString[random].equals("����"))
					System.out.println("�����ϴ�.");
				else if (computerString[random].equals("����"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else if (computerString[random].equals("��"))
					System.out.println("����ڰ� �̰���ϴ�.");
			} else if (inputString.equals("����")) {
				if (computerString[random].equals("����"))
					System.out.println("����ڰ� �̰���ϴ�.");
				else if (computerString[random].equals("����"))
					System.out.println("�����ϴ�.");
				else if (computerString[random].equals("��"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			} else if (inputString.equals("��")) {
				if (computerString[random].equals("����"))
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				else if (computerString[random].equals("����"))
					System.out.println("����ڰ� �̰���ϴ�.");
				else if (computerString[random].equals("��"))
					System.out.println("�����ϴ�.");
			} else
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}

		scan.close();
	}

}
