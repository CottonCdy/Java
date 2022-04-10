package study04;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("����, ����, ���� ������ 3���� ���� �Է� >>");
		int math = scan.nextInt();
		int science = scan.nextInt();
		int english = scan.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average());

		scan.close();
	}
}

class Grade {
	private int math;
	private int science;
	private int english;

	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	// 3������ ����� ����ϴ� average() �޼ҵ�
	public int average() {
		return (math + science + english) / 3;
	}
}