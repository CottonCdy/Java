package study02;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("원화를 입력하세요(단위 원) >> ");
		int money = scan.nextInt();
		double rate = 1100;

		double dollar = money / rate;
		System.out.println(money + "원은 $" + dollar + "입니다.");
	}

}
