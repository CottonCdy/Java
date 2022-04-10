package study03;

import java.util.Arrays;
import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int array[]; // n개의 정수를 담을 배열
		int count = 0; // 가독성을 위해 10개 단위로 끊어서 출력
		boolean check = true; // 중복값이 있으면 false, 없으면 true

		System.out.print("정수 몇개? ");
		int inputNumber = scan.nextInt();

		// 지정된 범위를 넘어가면 프로그램 종료
		if (inputNumber > 100 || inputNumber <= 1) {
			System.out.println("1~100 사이의 숫자만 입력 가능합니다");
			return;
		}

		// 입력받은 숫자의 크기로 배열 초기화
		array = new int[inputNumber];

		for (int i = 0; i < array.length; i++) {
			// Math클래스의 random메소드를 활용해 랜덤값 저장
			// (0 ~ 1 사이의 double 값) * 100 + 1
			int rNumber = (int) (Math.random() * 100 + 1);

			// 중복값 검사
			for (int j = 0; j < array.length; j++) {
				if (array[j] == rNumber) {
					check = false;
					break; // 중복값이 확인되면 break
				} else {
					check = true; // 중복값이 없으면 check = true
				}
			}

			// 중복값이 없으면 array에 값 저장
			if (check)
				array[i] = rNumber;
			else {
				// 중복값이 존재하여 현재 인덱스에 값을 다른 값으로 바꾸기 위해 continue
				// 현재 값을 바꿔야 하므로 증가할 i를 미리 감소
				i--;
				continue;
			}

			System.out.print(array[i] + " ");
			count++;

			// 숫자 10개 출력 후에 줄바꿈
			if (count % 10 == 0)
				System.out.println();
		}

		System.out.println("\n=====정렬=====");

		Arrays.sort(array); // 배열 오름차순 정렬
		count = 0;
		// forEach문 사용
		for (int value : array) {
			System.out.print(value + " ");
			count++;

			if (count % 10 == 0)
				System.out.println();
		}
	}
}
