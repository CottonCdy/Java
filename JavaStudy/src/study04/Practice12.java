package study04;

import java.util.Scanner;

public class Practice12 {
	private Scanner scan = new Scanner(System.in);
	private ReservationSystem sSeat = new ReservationSystem("S"); // S좌석
	private ReservationSystem aSeat = new ReservationSystem("A"); // A좌석
	private ReservationSystem bSeat = new ReservationSystem("B"); // B좌석

	public static void main(String[] args) {
		Practice12 rSystem = new Practice12();
		rSystem.run();
	}

	private void run() {
		System.out.println("명품 콘서트홀 예약 시스템입니다.");
		while (true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
			int select = scan.nextInt();
			// 끝내기
			if (select == 4)
				return;

			if (select == 1)
				reservation(); // 예약 메소드
			else if (select == 2)
				search(); // 좌석 출력 메소드
			else if (select == 3)
				cancel(); // 좌석 취소 메소드
			else
				System.out.println("잘못 입력하셨습니다.");
		}
	}

	// 예약 메소드
	private void reservation() {
		System.out.print("좌석구분 S(1), A(2), B(3) >> ");
		int number = scan.nextInt();

		if (number == 1)
			sSeat.showSeat(); // S좌석 출력
		else if (number == 2)
			aSeat.showSeat(); // A좌석 출력
		else if (number == 3)
			bSeat.showSeat(); // B좌석 출력
		else
			System.out.println("잘못 입력하셨습니다");

		System.out.print("이름 >>");
		String name = scan.next();
		System.out.print("번호 >>");
		int seatNumber = scan.nextInt();

		if (number == 1)
			sSeat.setReserve(name, seatNumber); // S좌석 예약 메소드 실행
		else if (number == 2)
			aSeat.setReserve(name, seatNumber); // A좌석 예약 메소드 실행
		else if (number == 3)
			bSeat.setReserve(name, seatNumber); // B좌석 예약 메소드 실행
		else
			System.out.println("잘못 입력하셨습니다");
	}

	private void search() {
		sSeat.showSeat(); // S좌석 출력
		aSeat.showSeat(); // A좌석 출력
		bSeat.showSeat(); // B좌석 출력
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}

	private void cancel() {
		System.out.print("이름 >> ");
		String name = scan.next();

		// 모든 좌석에서 취소
		boolean sCheck = sSeat.cancelReserve(name);
		boolean aCheck = aSeat.cancelReserve(name);
		boolean bCheck = bSeat.cancelReserve(name);

		// 예약자를 찾지 못하면 출력
		if (!(sCheck || aCheck || bCheck))
			System.out.println("예약하신 곳이 없습니다!");
		else
			System.out.println("예약이 취소되었습니다!");
	}
}

class ReservationSystem {
	private String seatGrade;
	private String[] seat = { "---", "---", "---", "---", "---", "---", "---", "---", "---", "---" }; // 10개의 좌석 생성

	public ReservationSystem(String seatGrade) {
		this.seatGrade = seatGrade;
	}

	// 예약 메소드
	public void setReserve(String name, int number) {
		if (number < 1 || number > 10) {
			System.out.println("1~10 까지의 숫자만 입력해주세요");
			return;
		}
		// 빈자리가 아니면
		if (!seat[number - 1].equals("---")) {
			System.out.println("이미 예약된 자리입니다!");
			return;
		}
		// 해당 좌석에 예약자 등록
		seat[number - 1] = name;
	}

	// 예약목록 출력 메소드
	public void showSeat() {
		System.out.print(seatGrade + ">> ");
		for (int i = 0; i < seat.length; i++)
			System.out.print(seat[i] + " ");

		System.out.println();
	}

	// 예약 취소 메소드
	public boolean cancelReserve(String name) {
		for (int i = 0; i < seat.length; i++) {
			// 해당 좌석에 예약자 이름을 제거
			if (seat[i].equals(name)) {
				seat[i] = "---";
				return true;
			}
		}
		// 전체 좌석에서 예약자 이름을 못 찾으면
		return false;
	}
}
