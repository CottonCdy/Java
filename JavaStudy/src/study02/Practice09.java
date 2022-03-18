package study02;

import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("원의 중심과 반지름 입력 >> ");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		double radius = scan.nextDouble();

		System.out.print("점 입력 >> ");
		double inputX = scan.nextDouble();
		double inputY = scan.nextDouble();

		double distance = Math.sqrt(((inputX - x) * (inputX - x)) + ((inputY - y) * (inputY - y)));

		if (distance < radius)
			System.out.println("점 (" + inputX + ", " + inputY + ")는 원 안에 있다");
		else
			System.out.println("점 (" + inputX + ", " + inputY + ")는 원 안에 없다");

	}

}
