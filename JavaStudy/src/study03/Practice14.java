package study03;

import java.util.Scanner;

public class Practice14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };

		while (true) {
			System.out.print("과목 이름 >>> ");
			String inputString = scan.next();

			// 입력받은 값이 "그만"인 경우 프로그램 종료
			if (inputString.equals("그만"))
				return;

			for (int i = 0; i < course.length; i++) {
				// 입력받은 값이 course배열 안에 있으면 점수 출력
				if (inputString.equals(course[i])) {
					System.out.println(course[i] + "의 점수는 " + score[i]);
					break;
				}

				// course 배열에 없으면 경고 출력
				// ex) course.length = 3
				// course.length - 1 = 2, i = 2
				if (course.length - 1 == i)
					System.out.println("없는 과목입니다.");
			}
		}
	}
}
