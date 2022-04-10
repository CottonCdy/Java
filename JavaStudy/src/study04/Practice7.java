package study04;

import java.util.Scanner;

public class Practice7 {
	private Scanner scan = new Scanner(System.in);
	private int date;
	private Day[] day;

	public Practice7(int date) {
		this.date = date;

		day = new Day[this.date]; // 매개변수로 입력받은 값의 크기로 배열 선언

		for (int i = 0; i < day.length; i++)
			day[i] = new Day(); // 배열의 크기만큼 객체 생성
	}

	public static void main(String[] args) {
		Practice7 april = new Practice7(30);
		april.run();
	}

	public void input() {
		System.out.print("날짜(1~" + date + ")? >> ");
		int inputSelect = scan.nextInt();

		// 지정된 범위를 벗어날 경우
		if (inputSelect < 1 || inputSelect > date) {
			System.out.println("1~30 사이의 날짜만 입력해주세요");
			return;
		}

		System.out.print("할 일(빈칸없이 입력)? >> ");
		String work = scan.next();

		// 해당 날짜에 할 일 저장
		day[inputSelect - 1].set(work);
	}

	public void view() {
		System.out.print("날짜(1~" + date + ")? >> ");
		int viewSelect = scan.nextInt();

		// 지정된 범위를 벗어날 경우
		if (viewSelect < 1 || viewSelect > date) {
			System.out.println("1~30 사이의 날짜만 입력해주세요");
			return;
		}

		System.out.print(viewSelect + "일의 할 일은 ");
		day[viewSelect - 1].show();// 해당 날짜에 할 일 출력
	}

	public void finish() {
		System.out.println("프로그램을 종료합니다.");
	}

	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램.");

		while (true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
			int select = scan.nextInt();

			if (select == 1)
				input();
			else if (select == 2)
				view();
			else if (select == 3) {
				finish();
				return;
			} else
				System.out.println("잘못 입력하셨습니다.");
		}
	}
}

class Day {
	private String work; // 하루의 할 일을 나타내는 문자열

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null) // 할 일이 없으면
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
	}
}