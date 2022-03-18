package study02;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int changeMoney;

		System.out.print("금액을 입력하시오 >> ");
		int money = scan.nextInt();

		changeMoney = money / 50000;
		money %= 50000;

		if (changeMoney > 0) {
			System.out.println("오만원권 " + changeMoney + "매");
		}

		changeMoney = money / 10000;
		money %= 10000;

		if (changeMoney > 0) {
			System.out.println("만원권 " + changeMoney + "매");
		}

		changeMoney = money / 1000;
		money %= 1000;

		if (changeMoney > 0) {
			System.out.println("천원권 " + changeMoney + "매");
		}

		changeMoney = money / 100;
		money %= 100;

		if (changeMoney > 0) {
			System.out.println("백원권 " + changeMoney + "매");
		}

		changeMoney = money / 50;
		money %= 50;

		if (changeMoney > 0) {
			System.out.println("오십원권 " + changeMoney + "매");
		}

		changeMoney = money / 10;
		money %= 10;

		if (changeMoney > 0) {
			System.out.println("십원권 " + changeMoney + "매");
		}

		changeMoney = money / 1;
		money %= 1;

		if (changeMoney > 0) {
			System.out.println("일원권 " + changeMoney + "매");
		}

	}

}
