package study02;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("ù��° ���� �߽ɰ� ������ �Է� >> ");
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double radius1 = scan.nextDouble();

		System.out.print("�ι�° ���� �߽ɰ� ������ �Է� >> ");
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		double radius2 = scan.nextDouble();

		double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

		if (distance <= (radius1 + radius2))
			System.out.println("�� ���� ���� ��ģ��.");
		else
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");

		scan.close();
	}

}
