package study04;

import java.util.Scanner;

public class Practice7 {
	private Scanner scan = new Scanner(System.in);
	private int date;
	private Day[] day;

	public Practice7(int date) {
		this.date = date;

		day = new Day[this.date]; // �Ű������� �Է¹��� ���� ũ��� �迭 ����

		for (int i = 0; i < day.length; i++)
			day[i] = new Day(); // �迭�� ũ�⸸ŭ ��ü ����
	}

	public static void main(String[] args) {
		Practice7 april = new Practice7(30);
		april.run();
	}

	public void input() {
		System.out.print("��¥(1~" + date + ")? >> ");
		int inputSelect = scan.nextInt();

		// ������ ������ ��� ���
		if (inputSelect < 1 || inputSelect > date) {
			System.out.println("1~30 ������ ��¥�� �Է����ּ���");
			return;
		}

		System.out.print("�� ��(��ĭ���� �Է�)? >> ");
		String work = scan.next();

		// �ش� ��¥�� �� �� ����
		day[inputSelect - 1].set(work);
	}

	public void view() {
		System.out.print("��¥(1~" + date + ")? >> ");
		int viewSelect = scan.nextInt();

		// ������ ������ ��� ���
		if (viewSelect < 1 || viewSelect > date) {
			System.out.println("1~30 ������ ��¥�� �Է����ּ���");
			return;
		}

		System.out.print(viewSelect + "���� �� ���� ");
		day[viewSelect - 1].show();// �ش� ��¥�� �� �� ���
	}

	public void finish() {
		System.out.println("���α׷��� �����մϴ�.");
	}

	public void run() {
		System.out.println("�̹��� ������ ���� ���α׷�.");

		while (true) {
			System.out.print("����(�Է�:1, ����:2, ������:3) >> ");
			int select = scan.nextInt();

			if (select == 1)
				input();
			else if (select == 2)
				view();
			else if (select == 3) {
				finish();
				return;
			} else
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
}

class Day {
	private String work; // �Ϸ��� �� ���� ��Ÿ���� ���ڿ�

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null) // �� ���� ������
			System.out.println("�����ϴ�.");
		else
			System.out.println(work + "�Դϴ�.");
	}
}