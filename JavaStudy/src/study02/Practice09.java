package study02;

import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("���� �߽ɰ� ������ �Է� >> ");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		double radius = scan.nextDouble();

		System.out.print("�� �Է� >> ");
		double inputX = scan.nextDouble();
		double inputY = scan.nextDouble();

		double distance = Math.sqrt(((inputX - x) * (inputX - x)) + ((inputY - y) * (inputY - y)));

		if (distance < radius)
			System.out.println("�� (" + inputX + ", " + inputY + ")�� �� �ȿ� �ִ�");
		else
			System.out.println("�� (" + inputX + ", " + inputY + ")�� �� �ȿ� ����");

	}

}
