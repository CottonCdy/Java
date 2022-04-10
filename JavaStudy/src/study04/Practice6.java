package study04;

import java.util.Scanner;

public class Practice6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SecondCircle c[] = new SecondCircle[3]; // 3개의 Circle 배열 선언

		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >> ");
			double x = scan.nextDouble(); // x값 입력
			double y = scan.nextDouble(); // y값 입력
			int radius = scan.nextInt(); // 반지름 값 입력
			c[i] = new SecondCircle(x, y, radius); // Circle 객체 생성
		}

		// 면적이 가장 큰 원을 저장할 maxCircle변수, 초기값은 배열c의 0번째 인덱스 저장
		SecondCircle maxCircle = c[0];

		for (int i = 1; i < c.length; i++) {
			double maxArea = maxCircle.circleArea(maxCircle.getRadius()); // maxCircle의 넓이 저장
			double tempArea = c[i].circleArea(c[i].getRadius()); // c의 i번째 인덱스 넓이 저장

			// tempArea가 maxArea보다 크면 maxCircle 객체 변경
			if (tempArea > maxArea)
				maxCircle = c[i];
		}

		// 넓이가 가장 큰 원 출력
		maxCircle.maxAreaShow();

		scan.close();
	}
}

class SecondCircle {
	private final double PI = 3.14; // 상수로 선언
	private double x, y;
	private int radius;

	// x, y, radius 초기화
	public SecondCircle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	// Circle 정보 출력
	public void show() {
		System.out.println("(" + x + ", " + y + ")" + radius);
	}

	// Circle 정보 출력
	public void maxAreaShow() {
		System.out.println("가장 면적이 큰 원은 " + "(" + x + ", " + y + ")" + radius);
	}

	// 원의 넓이를 리턴하는 메소드
	public double circleArea(int radius) {
		return (radius * radius * PI);
	}

	// private 변수인 radius를 가져오기 위한 메소드
	public int getRadius() {
		return radius;
	}
}