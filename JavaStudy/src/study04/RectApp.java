package study04;

import java.util.Scanner;

class RectangleEx {
	int width;
	int height;

	public int getArea() {
		return width * height;
	}
}

public class RectApp {
	public static void main(String[] args) {
		RectangleEx rect = new RectangleEx(); // 객체 생성
		Scanner scan = new Scanner(System.in);
		System.out.print(" >> ");
		rect.width = scan.nextInt();
		rect.height = scan.nextInt();
		System.out.println("사각형의 면적은 " + rect.getArea());

		scan.close();
	}
}
