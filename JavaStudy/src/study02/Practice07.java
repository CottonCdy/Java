package study02;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("�� (x, y)�� ��ǥ�� �Է��Ͻÿ� >> ");
		int x = scan.nextInt();
		int y = scan.nextInt();

		if ((x >= 100 && x <= 200) && (y >= 100 && y <= 200)) {
			System.out.println("(" + x + ", " + y + ")�� �簢�� �ȿ� �ֽ��ϴ�");
		} else
			System.out.println("(" + x + ", " + y + ")�� �簢�� �ȿ� �����ϴ�");
	}

}
