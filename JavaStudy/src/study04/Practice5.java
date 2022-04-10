package study04;

import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle c[] = new Circle[3]; // 3개의 Circle 배열 선언

		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >> ");
			double x = scan.nextDouble(); // x값 입력
			double y = scan.nextDouble(); // y값 입력
			int radius = scan.nextInt(); // 반지름 값 입력
			c[i] = new Circle(x, y, radius); // Circle 객체 생성
		}
		for (int i = 0; i < c.length; i++)
			c[i].show();

		scan.close();
	}
}

class Circle {
	private double x, y;
	private int radius;

	// x, y, radius 초기화
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	// Circle 정보 출력
	public void show() {
		System.out.println("(" + x + ", " + y + ")" + radius);
	}
}