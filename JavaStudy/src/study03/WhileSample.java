package study03;

import java.util.Scanner;

public class WhileSample {
	public static void main(String[] args) {
		int count = 0; // count는 입력된 정수의 개수
		int sum = 0; // sum은 합

		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하고 마지막에 -1을 입력하세요 : ");
		;

		int n = scan.nextInt();

		while (n != -1) // -1이 입력되면 while문 탈출
		{
			sum += n;
			count++;
			n = scan.nextInt();
		}

		if (count == 0)
			System.out.println("입력된 수가 없습니다");
		else {
			System.out.print("정수의 개수는 " + count + "개이며 ");
			System.out.print("평균은 " + (double) sum / count + "입니다");
		}
		scan.close();
	}

}
