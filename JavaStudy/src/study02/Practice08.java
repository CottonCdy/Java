package study02;

import java.util.Scanner;

public class Practice08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("점(x1, y1), (x2, y2)의 좌표를 입력하시오 >> ");
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();

			if (x1 == 0 || x2 == 0 || y1 == 0 || y2 == 0)
				break;

			if (inRect(x1, y1, 100, 100, 200, 200) || inRect(x1, y2, 100, 100, 200, 200)
					|| inRect(x2, y1, 100, 100, 200, 200) || inRect(x2, y2, 100, 100, 200, 200))
				System.out.println("사각형 충돌");
			else if (inRect(100, 100, x1, y1, x2, y2) && inRect(100, 200, x1, y1, x2, y2)
					&& inRect(200, 100, x1, y1, x2, y2) && inRect(200, 200, x1, y1, x2, y2))
				System.out.println("사각형 충돌");
			else
				System.out.println("사각형이 겹치지 않습니다.");
		}
		scan.close();
	}

	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else
			return false;
	}
}
