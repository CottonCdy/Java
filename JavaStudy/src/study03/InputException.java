package study03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� 3�� �Է� : ");
		int sum = 0;
		int n = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print(i + " >>");
			try {
				n = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				scan.nextLine(); // ���� �Է� ��Ʈ���� ���� �ִ� ��ū�� �����.
				i--; // �ε����� �������� �ʵ��� �̸� ����
				continue; // ���� ����
			}
			sum += n;
		}

		System.out.println("���� : " + sum);
		scan.close();

	}

}
