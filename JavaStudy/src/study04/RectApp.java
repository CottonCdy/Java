package study04;

import java.util.Scanner;

class Rectangle {
	int width;
	int height;

	public int getArea() {
		return width * height;
	}
}

public class RectApp {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); // ��ü ����
		Scanner scan = new Scanner(System.in);
		System.out.print(" >> ");
		rect.width = scan.nextInt();
		rect.height = scan.nextInt();
		System.out.println("�簢���� ������ " + rect.getArea());

		scan.close();
	}
}
