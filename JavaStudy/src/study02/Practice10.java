package study02;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("첫번째 원의 중심과 반지름 입력 >> ");
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double radius1 = scan.nextDouble();

		System.out.print("두번째 원의 중심과 반지름 입력 >> ");
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		double radius2 = scan.nextDouble();

		double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

		if (distance <= (radius1 + radius2))
			System.out.println("두 원은 서로 겹친다.");
		else
			System.out.println("두 원은 서로 겹치지 않는다.");

		scan.close();
	}

}
