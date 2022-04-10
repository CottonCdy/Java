package study04;

import java.util.Scanner;

public class Practice8 {
	private Scanner scan = new Scanner(System.in);
	private Phone[] user;

	public static void main(String[] args) {
		Practice8 phoneBook = new Practice8();
		phoneBook.run();
	}

	private void run() {
		createUsers(); // ����� ����

		for (int i = 0; i < user.length; i++) {
			System.out.print("�˻��� �̸� >> ");
			String searchName = scan.next();

			// �׸��� �Է��ϸ� ���α׷� ����
			if (searchName.equals("�׸�"))
				return;
			// �Է��� �̸��� ��ü�� �ִ� �̸��� ���ٸ� ��ȭ��ȣ ���
			// �ش� �̸��� ��ȭ��ȣ�� �ִ��� �迭 ��ȸ
			for (int j = 0; j < user.length; j++) {
				if (user[j].getName().equals(searchName)) {
					System.out.println(user[j].getName() + "�� ��ȣ�� " + user[j].getTel() + "�Դϴ�.");
					break;
				}
				// j�� �迭�� ������ �ε����̸� ���� ���
				if (j == user.length - 1)
					System.out.println(searchName + " �� �����ϴ�.");
			}
			// i���� �迭�� ũ�⸦ �Ѿ�� �ʰ� �� ����
			if (i == user.length - 1)
				i = -1;
		}
	}

	private void createUsers() {
		System.out.print("�ο��� >> ");
		int number = scan.nextInt();

		user = new Phone[number]; // �Է¹��� ������ ũ��� ��ü �迭 ����

		for (int i = 0; i < user.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�) >> ");
			String inputName = scan.next();
			String inputTel = scan.next();
			user[i] = new Phone(inputName, inputTel); // ��ü ����
		}

		System.out.println("���� �Ϸ�");
	}

}

class Phone {
	private String name;
	private String tel;

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}
}