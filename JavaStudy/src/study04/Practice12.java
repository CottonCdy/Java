package study04;

import java.util.Scanner;

public class Practice12 {
	private Scanner scan = new Scanner(System.in);
	private ReservationSystem sSeat = new ReservationSystem("S"); // S�¼�
	private ReservationSystem aSeat = new ReservationSystem("A"); // A�¼�
	private ReservationSystem bSeat = new ReservationSystem("B"); // B�¼�

	public static void main(String[] args) {
		Practice12 rSystem = new Practice12();
		rSystem.run();
	}

	private void run() {
		System.out.println("��ǰ �ܼ�ƮȦ ���� �ý����Դϴ�.");
		while (true) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4 >> ");
			int select = scan.nextInt();
			// ������
			if (select == 4)
				return;

			if (select == 1)
				reservation(); // ���� �޼ҵ�
			else if (select == 2)
				search(); // �¼� ��� �޼ҵ�
			else if (select == 3)
				cancel(); // �¼� ��� �޼ҵ�
			else
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

	// ���� �޼ҵ�
	private void reservation() {
		System.out.print("�¼����� S(1), A(2), B(3) >> ");
		int number = scan.nextInt();

		if (number == 1)
			sSeat.showSeat(); // S�¼� ���
		else if (number == 2)
			aSeat.showSeat(); // A�¼� ���
		else if (number == 3)
			bSeat.showSeat(); // B�¼� ���
		else
			System.out.println("�߸� �Է��ϼ̽��ϴ�");

		System.out.print("�̸� >>");
		String name = scan.next();
		System.out.print("��ȣ >>");
		int seatNumber = scan.nextInt();

		if (number == 1)
			sSeat.setReserve(name, seatNumber); // S�¼� ���� �޼ҵ� ����
		else if (number == 2)
			aSeat.setReserve(name, seatNumber); // A�¼� ���� �޼ҵ� ����
		else if (number == 3)
			bSeat.setReserve(name, seatNumber); // B�¼� ���� �޼ҵ� ����
		else
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
	}

	private void search() {
		sSeat.showSeat(); // S�¼� ���
		aSeat.showSeat(); // A�¼� ���
		bSeat.showSeat(); // B�¼� ���
		System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
	}

	private void cancel() {
		System.out.print("�̸� >> ");
		String name = scan.next();

		// ��� �¼����� ���
		boolean sCheck = sSeat.cancelReserve(name);
		boolean aCheck = aSeat.cancelReserve(name);
		boolean bCheck = bSeat.cancelReserve(name);

		// �����ڸ� ã�� ���ϸ� ���
		if (!(sCheck || aCheck || bCheck))
			System.out.println("�����Ͻ� ���� �����ϴ�!");
		else
			System.out.println("������ ��ҵǾ����ϴ�!");
	}
}

class ReservationSystem {
	private String seatGrade;
	private String[] seat = { "---", "---", "---", "---", "---", "---", "---", "---", "---", "---" }; // 10���� �¼� ����

	public ReservationSystem(String seatGrade) {
		this.seatGrade = seatGrade;
	}

	// ���� �޼ҵ�
	public void setReserve(String name, int number) {
		if (number < 1 || number > 10) {
			System.out.println("1~10 ������ ���ڸ� �Է����ּ���");
			return;
		}
		// ���ڸ��� �ƴϸ�
		if (!seat[number - 1].equals("---")) {
			System.out.println("�̹� ����� �ڸ��Դϴ�!");
			return;
		}
		// �ش� �¼��� ������ ���
		seat[number - 1] = name;
	}

	// ������ ��� �޼ҵ�
	public void showSeat() {
		System.out.print(seatGrade + ">> ");
		for (int i = 0; i < seat.length; i++)
			System.out.print(seat[i] + " ");

		System.out.println();
	}

	// ���� ��� �޼ҵ�
	public boolean cancelReserve(String name) {
		for (int i = 0; i < seat.length; i++) {
			// �ش� �¼��� ������ �̸��� ����
			if (seat[i].equals(name)) {
				seat[i] = "---";
				return true;
			}
		}
		// ��ü �¼����� ������ �̸��� �� ã����
		return false;
	}
}
