package study04;

import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle c[] = new Circle[3]; // 3���� Circle �迭 ����

		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >> ");
			double x = scan.nextDouble(); // x�� �Է�
			double y = scan.nextDouble(); // y�� �Է�
			int radius = scan.nextInt(); // ������ �� �Է�
			c[i] = new Circle(x, y, radius); // Circle ��ü ����
		}
		for (int i = 0; i < c.length; i++)
			c[i].show();

		scan.close();
	}
}

class Circle {
	private double x, y;
	private int radius;

	// x, y, radius �ʱ�ȭ
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	// Circle ���� ���
	public void show() {
		System.out.println("(" + x + ", " + y + ")" + radius);
	}
}