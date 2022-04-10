package study04;

import java.util.Scanner;

public class Practice6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SecondCircle c[] = new SecondCircle[3]; // 3���� Circle �迭 ����

		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >> ");
			double x = scan.nextDouble(); // x�� �Է�
			double y = scan.nextDouble(); // y�� �Է�
			int radius = scan.nextInt(); // ������ �� �Է�
			c[i] = new SecondCircle(x, y, radius); // Circle ��ü ����
		}

		// ������ ���� ū ���� ������ maxCircle����, �ʱⰪ�� �迭c�� 0��° �ε��� ����
		SecondCircle maxCircle = c[0];

		for (int i = 1; i < c.length; i++) {
			double maxArea = maxCircle.circleArea(maxCircle.getRadius()); // maxCircle�� ���� ����
			double tempArea = c[i].circleArea(c[i].getRadius()); // c�� i��° �ε��� ���� ����

			// tempArea�� maxArea���� ũ�� maxCircle ��ü ����
			if (tempArea > maxArea)
				maxCircle = c[i];
		}

		// ���̰� ���� ū �� ���
		maxCircle.maxAreaShow();

		scan.close();
	}
}

class SecondCircle {
	private final double PI = 3.14; // ����� ����
	private double x, y;
	private int radius;

	// x, y, radius �ʱ�ȭ
	public SecondCircle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	// Circle ���� ���
	public void show() {
		System.out.println("(" + x + ", " + y + ")" + radius);
	}

	// Circle ���� ���
	public void maxAreaShow() {
		System.out.println("���� ������ ū ���� " + "(" + x + ", " + y + ")" + radius);
	}

	// ���� ���̸� �����ϴ� �޼ҵ�
	public double circleArea(int radius) {
		return (radius * radius * PI);
	}

	// private ������ radius�� �������� ���� �޼ҵ�
	public int getRadius() {
		return radius;
	}
}