package study03;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number[] = new int[10];
		System.out.print("양의 정수 10개를 입력하시오 >> ");

		for (int i = 0; i < number.length; i++)
			number[i] = scan.nextInt(); // 10개의 정수를 number 배열에 하나씩 저장

		System.out.print("3의 배수는 ");

		// forEach문 사용
		for (int value : number) {
			if (value % 3 == 0) // 3의 배수만 구하는 조건문
				System.out.print(value + " ");
		}
	}
}