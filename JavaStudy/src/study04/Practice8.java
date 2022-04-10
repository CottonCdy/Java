package study04;

import java.util.Scanner;

public class Practice8 {
	private Scanner scan = new Scanner(System.in);
	private Phone[] user;

	public static void main(String[] args) {
		Practice8 phoneBook = new Practice8();
		phoneBook.run();
	}

	private void run() {
		createUsers(); // 사용자 생성

		for (int i = 0; i < user.length; i++) {
			System.out.print("검색할 이름 >> ");
			String searchName = scan.next();

			// 그만을 입력하면 프로그램 종료
			if (searchName.equals("그만"))
				return;
			// 입력한 이름과 객체에 있는 이름이 같다면 전화번호 출력
			// 해당 이름과 전화번호가 있는지 배열 순회
			for (int j = 0; j < user.length; j++) {
				if (user[j].getName().equals(searchName)) {
					System.out.println(user[j].getName() + "의 번호는 " + user[j].getTel() + "입니다.");
					break;
				}
				// j가 배열의 마지막 인덱스이면 없음 출력
				if (j == user.length - 1)
					System.out.println(searchName + " 이 없습니다.");
			}
			// i값이 배열의 크기를 넘어가지 않게 값 변경
			if (i == user.length - 1)
				i = -1;
		}
	}

	private void createUsers() {
		System.out.print("인원수 >> ");
		int number = scan.nextInt();

		user = new Phone[number]; // 입력받은 숫자의 크기로 객체 배열 생성

		for (int i = 0; i < user.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력) >> ");
			String inputName = scan.next();
			String inputTel = scan.next();
			user[i] = new Phone(inputName, inputTel); // 객체 생성
		}

		System.out.println("저장 완료");
	}

}

class Phone {
	private String name;
	private String tel;

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}
}